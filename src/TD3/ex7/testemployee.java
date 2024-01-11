package TD3.ex7;

public class testemployee {

        public static void main(String[] args) {

            Patron p=new Patron("Ali","Bennani",10000);
            System.out.println(p.toString());
            p.gains();
            TravailleurCommission tc=new TravailleurCommission(
                    "Taha","benchkroun",20000,1000);
            System.out.println(tc.toString());
            tc.gains();
            TravailleurHoraire th=new TravailleurHoraire("A","B",2000);
            System.out.println(th.toString());
            th.gains();



        }
    }
