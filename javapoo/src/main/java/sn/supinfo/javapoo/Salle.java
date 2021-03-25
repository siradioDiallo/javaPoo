package sn.supinfo.javapoo;

public class Salle {
	private String nomSalle;
	private int nbrePlace;
	
	public Salle() {}

	public Salle(String nom,int place) {
		this.nomSalle=nom;
		this.nbrePlace=place;
	}
	
	
	public String getNom_salle() {
		return nomSalle;
	}
	public void setNom_salle(String nom_salle) {
		this.nomSalle = nom_salle;
	}
	public int getNbrePlace() {
		return nbrePlace;
	}
	public void setNbrePlace(int nbrePlace) {
		this.nbrePlace = nbrePlace;
	}

	@Override
	public String toString() {
		return "Salle [nom_salle=" + nomSalle + ", nbrePlace=" + nbrePlace + "]";
	}
	

}
