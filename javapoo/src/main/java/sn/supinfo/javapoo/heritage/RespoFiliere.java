package sn.supinfo.javapoo.heritage;

public class RespoFiliere extends Personne{
	private String filiere;
	private String groupeSanguin;
	

	public RespoFiliere() {
		super();
	}
	
	public RespoFiliere(int id, String matricule, String genre, String nom, String prenom, String adresse,
			String dateDeNaissance, String lieuDeNaissance, String nationalite, String situationMatri, String tel,
			String email,String filiere,String groupeSanguin) {
		super(id,matricule,genre,nom,prenom,adresse,dateDeNaissance,lieuDeNaissance,nationalite,situationMatri,
				  tel,email);
		this.groupeSanguin=groupeSanguin;
		this.filiere=filiere;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	
	public String getGroupeSanguin() {
		return groupeSanguin;
	}

	public void setGroupeSanguin(String groupeSanguin) {
		this.groupeSanguin = groupeSanguin;
	}

	@Override
	public String toString() {
		return super.toString()+" filiere=" + filiere + ", groupeSanguin=" + groupeSanguin;
	}

}
