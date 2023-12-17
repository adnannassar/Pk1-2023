package Praktikum.Praktikum_001.Jörges;

import java.util.Objects;

public class Firma extends Kontakt implements VcardExportable{
	
	 private String name;
	 private Adresse adresse;
	
public Firma(String name, String telefon, String email , Adresse adresse) {
		
		super(telefon,email);
		this.name=name;
		this.adresse=adresse;
	
	}

	

	public String getName() {
		return name;
	}

	public Adresse getAdresse() {
		return adresse;
	}


	
	 @Override
		public int hashCode() {
			return Objects.hash(super.hashCode(), name, adresse);
		}
	 
	 

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			Firma f = (Firma) obj;
		  return this.name.equals(f.getName())&& this.adresse.equals
					(f.getAdresse());
		}


	

   @Override
	public void drucke() {
		
		System.out.println("Name: " + this.name +
				   "\nTelefon: " + getTelefon() + 
				   "\nE-Mail: " + getEmail() + 
				   "\nAdresse: " + this.adresse.toString());	
	}
	
	
	
	@Override
	public String toString() {
		 return "Name: " + this.name +
				   "\nTelefon: " + getTelefon() + 
				   "\nE-Mail: " + getEmail() + 
				   "\nAdresse: " + this.adresse.toString();
	}
   @Override
	public String getSuchkriterium() {
		return this.name;
	}

	@Override
	public String exportiereAlsVcard(){
		return "Firma Test TODO";
	}
}
