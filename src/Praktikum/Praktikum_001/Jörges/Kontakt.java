package Praktikum.Praktikum_001.Jörges;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Objects;
public abstract class Kontakt implements Comparable<Kontakt>, Praktikum.Praktikum_001.Jörges.VcardExportable {
	private String telefon;
	private String email;
	private KontaktListe kontaktliste;
	
public Kontakt (String telefon, String email) {
		
		this.telefon=telefon;
		this.email=email;

	}

	public String getTelefon() {
		return telefon;
	}

	public String getEmail() {
		return email;
	}

	
//	
	
	
	public abstract String getSuchkriterium();
//	
	
	public abstract void drucke();
//	{
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//		String dateasString = geburtstag.format(formatter);
//		
//		System.out.println(" Name: " + this.vorname + " " + this.nachname + "\n " +
//						   "Telefon: " + this.telefon + "\n E-Mail: " + this.email + 
//						   "\n Geburtstag: "+ dateasString+ "\n Adresse: " + this.adresse.toString()  );
//		
//	}

	@Override
	public String toString() {
		return "Telefon: " + this.telefon + "\n E-Mail: " + this.email;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, telefon);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kontakt k= (Kontakt) obj;
		if(this.telefon.equals(k.getTelefon())&& this.email.equals(k.getEmail()))return true;
		else return false;
	}

	@Override
	public int compareTo(Kontakt k) {
		return this.getSuchkriterium().compareTo(k.getSuchkriterium());
	}
}
