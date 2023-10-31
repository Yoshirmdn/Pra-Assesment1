import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A , B;
        A = input.nextInt();
        B = input.nextInt();
        int hasil = A + B;
        teks(hasil);
        System.out.println(teks(hasil));
        input.close();
    }
    public static String teks(int result) {
        String[] huruf = {"","satu","dua","tiga","empat","lima","enam","tujuh","delapan","sembilan"};
        int ratusan = result/100;
        int puluhan = (result/10)%10;
        int satuan = result %10;
        String ratus = (ratusan > 0)? huruf[ratusan] + " ratus " : " ";
        String puluh = (puluhan > 1)? huruf[puluhan] + " puluh " : " ";
        String satu = (satuan > 0 || satuan <=9)? huruf[satuan] + " " : " ";
        return ratus + puluh + satu;
    }
}
