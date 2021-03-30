package sn.supinfo.javapoo.heritage;

/**
 * 
 * @author Amadou S DIALLO
 * Permet de mémoriser les informations sur un prof
 *
 */
public class Professeur extends Personne{
	private String speciality;
	
	public Professeur() {
		super();
	}
	
	public Professeur(int id,String matricule,String genre,String nom,String prenom,String adresse,
			  String dateDeNaissance,String lieuDeNaissance,String nationalite,String situationMatri,String tel,
			  String email,String speciality) {
		
		super(id,matricule,genre,nom,prenom,adresse,dateDeNaissance,lieuDeNaissance,nationalite,situationMatri,
				  tel,email);
		
		this.speciality=speciality;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

}
