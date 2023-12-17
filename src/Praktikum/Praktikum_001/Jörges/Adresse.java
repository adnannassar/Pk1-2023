package Praktikum.Praktikum_001.Jörges;

import java.util.Objects;

public class Adresse implements VcardExportable {
	
private String strasse;
private int hausnummer;
private int plz;
private String ort;
private String land;
  


public Adresse(String strasse , int hausnummer , int plz,
		String ort , String land) {
	this.strasse=strasse;
	this.hausnummer=hausnummer;
	this.plz=plz;
	this.ort=ort;
	this.land=land;
}

@Override
public int hashCode() {
	return Objects.hash(hausnummer, land, ort, plz, strasse);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Adresse a = (Adresse) obj;
	 	return  hausnummer==a.hausnummer&&
			    plz == a.plz
		    && this.strasse.equals(a.getStrasse())
			&& this.ort.equals(a.getOrt())
			&& this.land.equals(a.getLand());
			
}

public String getStrasse() {
	return strasse;
}

public int getHausnummer() {
	return hausnummer;
}

public int getPlz() {
	return plz;
}

public String getOrt() {
	return ort;
}

public String getLand() {
	return land;
}



	
public String toString() {
	return  this.strasse + " " + this.hausnummer + ", " +
			this.plz + " " + this.ort + ", " +this.land;
			
}

	@Override
	public String exportiereAlsVcard(){
		return "Address Test TODO";
	}

}
