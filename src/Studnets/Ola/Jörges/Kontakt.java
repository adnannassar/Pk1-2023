package Studnets.Ola.Jörges;

    import java.time.LocalDate;

    public class Kontakt {
        public Kontaktenliste kontaktliste;
        private String nachname;
        private String vorname;
        private String telefon;
        private String email;
        private LocalDate geburtstag;

        Adresse a;
        public Kontakt(String nachname,String vorname,String telefon,String email,LocalDate geburtstag, Adresse a) {
            this.nachname=nachname;
            this.vorname=vorname;
            this.telefon=telefon;
            this.email=email;
            LocalDate geburstag;
            this.geburtstag=geburtstag;


        }
        public void druck() {
            System.out.println("Name: "+this.vorname+ " "+this.nachname+
                    "\n Telefon: "+this.telefon+ "\n E-mail: "+ this.email+
                    "\nGeburstag: "+this.geburtstag.getDayOfMonth()+"."+geburtstag.getMonth()+"."+geburtstag.getYear()+
                    "\n Adresse: "+this.a);

        }
        public String getNachname() {
            return nachname;
        }
        public String getVorname() {
            return vorname;
        }
        public String getTelefon() {
            return telefon;
        }
        public String getEmail() {
            return email;
        }
        public LocalDate getLocalDate() {
            String s = this.geburtstag.getDayOfMonth()+"."+geburtstag.getMonth()+"."+geburtstag.getYear();
            return LocalDate.parse(s);
        }
        public void setNachname(String nachname) {
            this.nachname = nachname;
        }
        public void setVorname(String vorname) {
            this.vorname = vorname;
        }
        public void setTelefon(String telefon) {
            this.telefon = telefon;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void setLocalDate(String localDate) {
            localDate = localDate;

        }
        public String toString() {
           return "Name: "+this.vorname+ " "+this.nachname+
                    "\n Telefon: "+this.telefon+ "\n E-mail: "+ this.email+"\nGeburstag: "+this.geburtstag.getDayOfMonth()+"."+geburtstag.getMonth()+"."+geburtstag.getYear()+"\n Adresse: "+this.a;



        }
    }
