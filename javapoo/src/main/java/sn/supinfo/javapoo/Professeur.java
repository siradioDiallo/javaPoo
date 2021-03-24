package sn.supinfo.javapoo;

public class Professeur {
	private String nom;
	private String prenom;
	private String tel;
    
	
	public Professeur() {}

    public Professeur(String nom,String prenom,String tel) {
    	this.nom=nom;
    	this.prenom=prenom;
    	this.tel=tel;
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


	@Override
	public String toString() {
		return " Nom:"+nom+" prenom:"+prenom+" tel:"+tel+" age:";
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
