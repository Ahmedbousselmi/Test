import java.util.Scanner;

public class JeuPuissance4 {

    static int[][] grille = new int[6][7];
    static Scanner sc = new Scanner(System.in);
    static int joueur = 1;

    public static void main(String[] args) {

        System.out.println("Jeu Puissance 4");
        System.out.println("Le joueur 1 utilise le chiffre 1 et le joueur 2 utilise le chiffre 2 pour remplir la grille.");

        while (true) {
            afficherGrid(grille);
            System.out.println("C'est au tour du joueur " + joueur);
            int colonne = saisieCol();
            placerPiece(grille,colonne,joueur);
            if (checkwinner(grille,joueur)) {
                afficherGrid(grille);
                System.out.println("C'est le joueur " + joueur + " qui a gagné!");
                break;
            } else if (checkdraw(grille)) {
                afficherGrid(grille);
                System.out.println("Aucun des deux joueurs n'a gagné");
                break;
            }

            joueur = joueur % 2 + 1;
        }
    }

    public static void afficherGrid(int[][] grille) {
        System.out.println("-----------------");
        for (int i = 0; i < 6; i++) {
            System.out.print("|");
            for (int j = 0; j < 7; j++) {
                System.out.print(" " + grille[i][j] + " |");
            }
            System.out.println();
            System.out.println("-----------------");
        }
    }

    public static int saisieCol() {
        Scanner sc = new Scanner(System.in);
        int colonne;
        do {
            System.out.print("Choisissez le numéro de la colonne (1-7) qui contienne des cases vides: ");
            while (!sc.hasNextInt()) {
                System.out.println("Numéro invalide! Saisie un numéro 1 et 7.");
                sc.next();
            }
            colonne = sc.nextInt();
        } while (colonne < 1 || colonne > 7);
        return colonne - 1;
    }

    public static void placerPiece(int[][] grille, int colonne, int joueur) {
        for (int i = 5; i >= 0; i--) {
            if (grille[i][colonne] == 0) {
                grille[i][colonne] = joueur;
                break;
            }
        }
    }

    public static boolean checkwinner (int[][] grille,int joueur) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (joueur == grille[i][j+1] && joueur == grille[i][j+2] && joueur == grille[i][j+3]) {
                    return true;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (joueur == grille[i+1][j] && joueur == grille[i+2][j] && joueur == grille[i+3][j]) {
                    return true;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (joueur == grille[i+1][j+1] && joueur == grille[i+2][j+2] && joueur == grille[i+3][j+3]) {
                    return true;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 6; j >= 3; j--) {
                if (joueur == grille[i+1][j-1] && joueur == grille[i+2][j-2] && joueur == grille[i+3][j-3]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean checkdraw(int[][] grille) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                if (grille[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}