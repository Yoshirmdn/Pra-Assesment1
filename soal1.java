import java.util.Scanner;

class soal1{
public static void main(String[] args) {
    Scanner input  = new Scanner(System.in);
    int A = input.nextInt();
    int B = input.nextInt();
    int C = input.nextInt();

    // int konversi1 = konversi(A);
    // int konversi2 = konversi(B);
    // int konversi3 = konversi(C);
    konversi(A);
    System.out.println();
    konversi(B);
    System.out.println();
    konversi(C);

    // System.out.printf("%04d\n",konversi1);
    // System.out.printf("%04d\n",konversi2);
    // System.out.printf("%04d\n",konversi3);
    input.close();
    }public static void konversi(int Data) {
       int d1 = (Data / 1000 + 5)%10;
       int d2 = ((Data / 100)%10 + 5)%10;
       int d3 = ((Data / 10)%10 + 5)%10;
       int d4 = (Data %10 + 5)%10;
       System.out.print(d1);
       System.out.print(d4);
       System.out.print(d3);
       System.out.print(d2);
       
    }
}