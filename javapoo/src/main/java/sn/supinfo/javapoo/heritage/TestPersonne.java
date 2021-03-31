package sn.supinfo.javapoo.heritage;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne personne = new Personne();
		personne.setAdresse("Zone de Captage");
		personne.setDateDeNaissance("22/41/2020");
		personne.setEmail("diallo@gmail.com");
		personne.setGenre("Masculin");
		personne.setId(10);
		personne.setLieuDeNaissance("GUinée");
		personne.setMatricule("SIK 005060");
		personne.setNationalite("Guinéenne");
		personne.setNom("Diallo");
		personne.setPrenom("Amadou");
		personne.setSituationMatri("Célibataire");
		personne.setTel("4776022");
		
		Etudiant etudiant = new Etudiant(12,"5060","M","Diop","Moussa","Dakar plateau","22/12/2020","Guinée","Sénégalaise","Mariée","785256635","diop@gmail.com","B");
		System.out.println(etudiant);
		
	}

}
