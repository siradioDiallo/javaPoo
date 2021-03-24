package sn.supinfo.javapoo;

public class Salle {
	private String nom_salle;
	private int nbrePlace;
	
	public Salle() {}

	public Salle(String nom,int place) {
		this.nom_salle=nom;
		this.nbrePlace=place;
	}
	
	
	public String getNom_salle() {
		return nom_salle;
	}
	public void setNom_salle(String nom_salle) {
		this.nom_salle = nom_salle;
	}
	public int getNbrePlace() {
		return nbrePlace;
	}
	public void setNbrePlace(int nbrePlace) {
		this.nbrePlace = nbrePlace;
	}

	@Override
	public String toString() {
		return "Salle [nom_salle=" + nom_salle + ", nbrePlace=" + nbrePlace + "]";
	}
	

}
