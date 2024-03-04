package tn.esprit.alternance;

public class calcule {

	
	
int id;
int somme;

public calcule(int id) {
	
	this.id=id;
	
}


public int calc(int id) {
	
	for(int i=0;i<id;i++) {
		somme=somme*i;
	}
	return somme;
}
}
