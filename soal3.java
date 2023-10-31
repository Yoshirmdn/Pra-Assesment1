import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String JK=input.next();
        double BB=input.nextInt();
        double TB=input.nextInt();
        double tb2=TB /100;
        input.close();
        double hasil=BB / (tb2 * tb2);

        switch (JK) {
            case "Pria" : if (hasil < 20.50) {
                System.out.printf("%.2f, Kurus", hasil);
            }

            else if (hasil > 20.50 && hasil <=26.99) {
                System.out.printf("%.2f, Ideal", hasil);
            }

            else {
                System.out.printf("%.2f, Gemuk", hasil);
            }

            break;

            case "Wanita" : if (hasil < 18.50) {
                System.out.printf("%.2f, Kurus", hasil);
            }

            else if (hasil > 18.50 && hasil <=24.99) {
                System.out.printf("%.2f, Ideal", hasil);
            }

            else {
                System.out.printf("%.2f, Gemuk", hasil);
            }

            break;
            default: break;
        }

    }
}