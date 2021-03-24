package sn.supinfo.javapoo;

public class SeanceDeCours {
	private String date;
	private int dateDebut;
	private int dateFin;
	private int soldeHeure;
	
	public SeanceDeCours() {
		
	}
public SeanceDeCours(String date,int dateDebut,int dateFin,int soldeHeure) {
		this.date=date;
		this.dateDebut=dateDebut;
		this.dateFin=dateFin;
		this.soldeHeure=soldeHeure;
		}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(int dateDebut) {
		this.dateDebut = dateDebut;
	}
	public int getDateFin() {
		return dateFin;
	}
	public void setDateFin(int dateFin) {
		this.dateFin = dateFin;
	}
	public int getSoldeHeure() {
		return soldeHeure;
	}
	public void setSoldeHeure(int soldeHeure) {
		this.soldeHeure = soldeHeure;
	}
	@Override
	public String toString() {
		return "SeanceDeCours [date=" + date + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", soldeHeure="
				+ soldeHeure + "]";
	}

	
}
