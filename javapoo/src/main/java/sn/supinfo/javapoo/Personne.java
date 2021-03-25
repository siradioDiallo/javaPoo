package sn.supinfo.javapoo;

/**
 * Hello world!
 *
 */
public class Personne 
{
	private String nom;
	private String prenom;
	private String tel;
	private String email;
	private int age;
	private static int nbreObjetCree=0;
	
	
	public Personne() {
		Personne.nbreObjetCree++;
	} 
	
   public Personne(String nom,String prenom,String tel,String email,int age) {
	   this.nom=nom;
	   this.prenom=prenom;
	   this.tel=tel;
	   this.email=email;
	   this.age=age;
	   Personne.nbreObjetCree++;
   }
   public void afficher() {
	   System.out.println(" Nom:"+nom+" prenom:"+prenom+" tel:"+tel+" age:"+age+" email:"+email);
   }
@Override
public String toString() {
	return " Nom:"+nom+" prenom:"+prenom+" tel:"+tel+" age:"+age+" email:"+email;
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
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public static int getNbreObjetCree() {
	return Personne.nbreObjetCree;
}
}
