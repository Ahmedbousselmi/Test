package tn.esprit.alternance;

import java.util.Objects;




public class Etudiant implements Comparable<Etudiant>{
private int id;
private String nom,prenom;




public Etudiant(){
	super();
	// TODO Auto-generated constructor stub
}
public Etudiant(String nom, String prenom) {
	super();
	this.nom = nom;
	this.prenom = prenom;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
	return "Enseignant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
}
@Override
public int hashCode() {
	return Objects.hash(id);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Etudiant other = (Etudiant) obj;
	return id == other.id;
}
@Override
public int compareTo(Etudiant o) {
	return this.id-o.id;
}


}
