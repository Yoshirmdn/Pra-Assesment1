import java.util.Scanner;

/**
 * soal4
 */
public class soal4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Angka Pertama");
        int angkaAwal = input.nextInt();
        System.out.println("Masukan Jarak Angka");
        int jarak = input.nextInt();
        System.out.println("Masukan Angka Ulang");
        int ulang = input.nextInt();
        int hasilarit = aritmatika(angkaAwal, jarak, ulang);
        System.out.println(hasilarit);
        input.close();
    }private static int hasil = 0;
    private static int aritmatika(int angkaAwal, int jarak , int ulang) {
        if (ulang > 0){
            ulang = ulang -1;
            hasil = hasil + angkaAwal;
            angkaAwal = angkaAwal + jarak;
            aritmatika(angkaAwal, jarak, ulang);
        }
        return hasil;
    } 
}