package tn.esprit.alternance;

import java.util.Objects;

public class Employe {
	 private int cin;
	    private int matricule;
	    private String nom , prenom;
	    
	    
	    
	    
		public Employe() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employe(int cin, int matricule, String nom, String prenom) {
			super();
			this.cin = cin;
			this.matricule = matricule;
			this.nom = nom;
			this.prenom = prenom;
		}
		public int getCin() {
			return cin;
		}
		public void setCin(int cin) {
			this.cin = cin;
		}
		public int getMatricule() {
			return matricule;
		}
		public void setMatricule(int matricule) {
			this.matricule = matricule;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		@Override
		public String toString() {
			return "Employe [cin=" + cin + ", matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(cin, matricule, nom, prenom);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employe other = (Employe) obj;
			return cin == other.cin && matricule == other.matricule && Objects.equals(nom, other.nom)
					&& Objects.equals(prenom, other.prenom);
		}
	    
		
	    
}
