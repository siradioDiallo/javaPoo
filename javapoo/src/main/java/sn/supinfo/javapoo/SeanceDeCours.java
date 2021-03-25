package sn.supinfo.javapoo;

public class SeanceDeCours {
	private String date;
	private int heureDebut;
	private int heureFin;
	private int soldeHeure;
	private String prof;
	private String group;
	private String module;
	
	
public String getModule() {
		return module;
	} 

	public void setModule(String module) {
		this.module = module;
	}

public SeanceDeCours(String date,int dateDebut,int dateFin,int soldeHeure,String prof,String module,String group) {
		this.date=date;
		this.heureDebut=dateDebut;
		this.heureFin=dateFin;
		this.soldeHeure=soldeHeure;
		this.prof=prof;
		this.module=module;
		this.group=group;
		}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(int dateDebut) {
		this.heureDebut = dateDebut;
	}
	
	public void setHeureFin(int dateFin) {
		this.heureFin = dateFin;
	}
	public int getSoldeHeure() {
		return soldeHeure;
	}
	public void setSoldeHeure(int soldeHeure) {
		this.soldeHeure = soldeHeure;
	}
	public String getProf() {
		return prof;
	}
	public void setProf(String prof) {
		this.prof = prof;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public int getHeureFin() {
		return heureFin;
	}
	public SeanceDeCours() {
		
	}
	
	@Override
	public String toString() {
		return "SeanceDeCours [date=" + date + ", dateDebut=" + heureDebut + ", dateFin=" + heureFin + ", soldeHeure="
				+ soldeHeure + "]";
	}

	
}
