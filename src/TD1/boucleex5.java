package TD1;

public class boucleex5 {



        public static void main(String[] args) {
            int N=25418 ;
            int a=N/10000 ;
            int b=(N%10000)/1000 ;
            int c=((N%10000)%1000)/100 ;
            int d=(((N%10000)%1000)%100)/10 ;
            int e=((((N%10000)%1000)%100)%10) ;
            int s= a+b+c+d+e ;
            System.out.println(" " +a+" + " +b+" + " +c+" + " +d+" + " +e+" = " + s);
        }

    }

