package Praktikum.Praktikum_001.Jörges;
import java.time.LocalDate;
import java.util.Arrays;
public class KontaktApp {
	  public static void main(String[] args) {
	        

	       KontaktListe liste = new KontaktListe();
	       Menu m=new Menu (liste);
	       m.ZeigeMenu();
	       
	       
//	       erster Kontakt
	        LocalDate date1= LocalDate.of(1999,10,01);
	        Adresse adresseprivat1 = new Adresse ("flas" , 80, 44388, "Dortmund",
		    		   "Deutschland");
	        Adresse adresseberuf1 = new Adresse ("voßkuhle" , 38, 44173, "Dortmund",
		    		   "Deutschland");
	        Person k1= new Person("Emna","Kolsi","0152 0000000",
	        						"Emna@yahoo.fr",date1,adresseprivat1,adresseberuf1);
	        
	        
//	        zweiter Kontakt
	        
	        LocalDate date2 = LocalDate.of(2000,04,25);
	        Adresse adresseprivat2 = new Adresse ("ost" , 26, 44389, "Dortmund",
		    		   "Deutschland");
	        Adresse adresseberuf2 = new Adresse ("emil-Figge-str" , 44, 44199, "Dortmund",
		    		   "Deutschland");
	        
	        Person k2= new Person("Ola","Aliziab","0176 1111111",
					"ola@gmail.com",date2,adresseprivat2,adresseberuf2);
	        
	      
//	        dritter Kontakt
	        
	        LocalDate date3 = LocalDate.of(1981,01,01);
	        Adresse adresseprivat3 = new Adresse ("Emil-Figge" , 42, 44227, "Dortmund",
		    		   "Deutschland");
	        
	        Adresse adresseberuf3 = new Adresse ("sonnenstraße" , 96, 44159, "Dortmund",
		    		   "Deutschland");
	        
	        Person k3= new Person("Jörges","Knabbe","0231 0000000",
			       		"jk@fh-dortmund.de",date3,adresseprivat3,adresseberuf3);
	   
//		       vierter Kontakt 
	        
		        LocalDate date4= LocalDate.of(1995,10,01);
//		        Adresse adresse4 = new Adresse ("flas" , 80, 44388, "Dortmund","Deutschland");
		        
		        Adresse adresseberuf4 = new Adresse ("bahnhofstr" , 1, 44111, "Dortmund",
			    		   "Deutschland");
		        
		        Person k4= new Person("Nada","Kolsi","0152 0000000",
		        						"Nada@yahoo.fr",date4,adresseprivat1,adresseberuf4);
		        
		        
//		        erste Firma
	
		        Adresse adresseA = new Adresse("Emil-Figge-str" , 42, 44388, "Dortmund",
		                "Deutschland");
		     
		        Firma firmaA= new Firma("Fachhochschule Dortmund","021400000","fh.dortmund@fh-dortmund.de",adresseA);
		        
//		        zweite Firma
		     
		        Adresse adresseB = new Adresse("Voßkuhle" , 38, 44173, "Dortmund",
		                "Deutschland");
		     
		        Firma firmaB= new Firma("ThyssenKrupp AG","023100000","Kontakt@Thyssenkrupp-nucera.com",adresseB);
		        
//		        dritte Firma
			     
		        Adresse adresseC = new Adresse("Bahnhof Platz" , 100, 44111, "Dortmund",
		                "Deutschland");
		     
		        Firma firmaC= new Firma("Cinestar GmbH","023859585","Buchung@cinestar-dortmund.de",adresseC);
		        
//		        vierte Firma
			     
		        Adresse adresseD = new Adresse("Martener str" , 5, 44888, "Dortmund",
		                "Deutschland");
		     
		        Firma firmaD= new Firma("Cinestar GmbH","023735737","Kundenservice@cinestar-dortmund.de",adresseD); 
		        
		        
//		        
		        
		        
	        liste.hinzufuegen(k1);
	        liste.hinzufuegen(k2);
	        liste.hinzufuegen(k3);
	        liste.hinzufuegen(k4);
	        liste.hinzufuegen(firmaA);
	        liste.hinzufuegen(firmaB);
	        liste.hinzufuegen(firmaC);
	        liste.hinzufuegen(firmaD);
	         
	     System.out.println("Anzahl von Kontakte der Liste ist: "
	       		+  liste.gibtAnzahlKontakte());
	     System.out.println("                  ");
	       
	     
	     
	      liste.druckeAlleKontakte();
	      
	      
	      System.out.println("\n************************************************************");
	      System.out.println("************************************************************\n");
	     
	      String suchName = "Cinestar GmbH";
	      Kontakt[] aus=liste.findeKontakteMitNamen(suchName);
	      
	      System.out.print("Hier sind die gefundne Kontakte mit Namen "+suchName + ": \n \n");
	      for (Kontakt k : aus) {
	            System.out.println(k + "\n");
	        }     
	      
		      new Menu(new KontaktListe()).ZeigeMenu();
		    
                
	    }
}
