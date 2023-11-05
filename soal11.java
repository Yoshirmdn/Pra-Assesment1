import java.util.Scanner;

class soal11{
public static void main(String[] args) {
    Scanner input  = new Scanner(System.in);
    int A = input.nextInt();
    int B = input.nextInt();
    int C = input.nextInt();

    konversi(A);
    System.out.println();
    konversi(B);
    System.out.println();
    konversi(C);

    input.close();
    }public static void konversi(int Data) {
       int d1 = (Data / 1000 + 7)%10;
       int d2 = ((Data / 100)%10 + 7)%10;
       int d3 = ((Data / 10)%10 + 7)%10;
       int d4 = (Data %10 + 7)%10;
       System.out.print(d3);
       System.out.print(d2);
       System.out.print(d1);
       System.out.print(d4);
       
    }
}