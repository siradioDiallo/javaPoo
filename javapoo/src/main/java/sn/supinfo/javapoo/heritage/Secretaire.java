package sn.supinfo.javapoo.heritage;

public class Secretaire extends Personne {
  private String finContrat;
  private String debutContrat;
  
  public Secretaire() {
	  super();
  }
  
  public Secretaire(int id, String matricule, String genre, String nom, String prenom, String adresse,
			String dateDeNaissance, String lieuDeNaissance, String nationalite, String situationMatri, String tel,
			String email,String finContrat,String debutContrat) {
	  
	  super(id,matricule,genre,nom,prenom,adresse,dateDeNaissance,lieuDeNaissance,nationalite,situationMatri,
			  tel,email);
	  this.debutContrat=debutContrat;
	  this.finContrat=finContrat;
  }

public String getFinContrat() {
	return finContrat;
}

public void setFinContrat(String finContrat) {
	this.finContrat = finContrat;
}

public String getDebutContrat() {
	return debutContrat;
}

public void setDebutContrat(String debutContrat) {
	this.debutContrat = debutContrat;
}

@Override
public String toString() {
	return super.toString()+ "finContrat=" + finContrat + ", debutContrat=" + debutContrat;
}

}
