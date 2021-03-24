package sn.supinfo.javapoo;

public class Module {
  private String nomModule;
  private int volumeHoraire;
  private int coefficient;
  private String description;
  
  
  public Module() {}
  
  public Module(String nom,int volume,int coef,String des) {
	  this.nomModule=nom;
	  this.volumeHoraire=volume;
	  this.coefficient=coef;
	  this.description=des;
  }
  
public String getNomModule() {
	return nomModule;
}


public void setNomModule(String nomModule) {
	this.nomModule = nomModule;
}


public int getVolumeHoraire() {
	return volumeHoraire;
}


public void setVolumeHoraire(int volumeHoraire) {
	this.volumeHoraire = volumeHoraire;
}


public int getCoefficient() {
	return coefficient;
}


public void setCoefficient(int coefficient) {
	this.coefficient = coefficient;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


@Override
public String toString() {
	return "Module [nomModule=" + nomModule + ", volumeHoraire=" + volumeHoraire + ", coefficient=" + coefficient
			+ ", description=" + description + "]";
}
  
}
