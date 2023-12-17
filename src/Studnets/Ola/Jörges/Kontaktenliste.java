package Studnets.Ola.Jörges;
import java.util.Arrays;
public class Kontaktenliste {
    public Kontakt k[] = new Kontakt[2];
    public int anzkontakte=0;

    public Kontaktenliste() {

    }

    public void hinzufuegen(Kontakt neu) {
        if (anzkontakte >= k.length) {
            Kontakt []ersatz = Arrays.copyOf(k, k.length +1);
            ersatz[ersatz.length-1]=neu;
            k=new Kontakt[k.length+1];
            k=ersatz;

        }
        k[anzkontakte++] = neu;
    }

    public void durckeAlleKontakte() {
        System.out.println("Kontakte in der Liste:");
        for (int i = 0; i < anzkontakte; i++) {
            System.out.println("Name: " + k[i].getVorname() + " " + k[i].getNachname()
                    + "\n Telefonnummer: " + k[i].getTelefon() + "\n E-mail: " + k[i].getEmail()
                    + "\n Geburtstag: " + k[i].getLocalDate() + "\n Adresse:" + k[i].a.toString());
        }
    }
        public int gibtAnzahlKontakte(){
          return this.anzkontakte;
        }

        public Kontakt[] findeKontakteMitNamen (String name) {
            if (name == null) {
                return new Kontakt[0];
            }
            Kontakt[] gesuchteNachname = new Kontakt[anzkontakte];
            int anzahlgesuchteName = 0;
            for (int i = 0; i < anzkontakte; i++) {
                if (k[i].getNachname().equals(name)) {
                    gesuchteNachname[anzahlgesuchteName] = k[i];
                    anzahlgesuchteName++;
                }
            }
            return gesuchteNachname;
        }

}