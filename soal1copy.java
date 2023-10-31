import java.util.Scanner;

public class soal1copy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int masukan1 = scanner.nextInt();
        int masukan2 = scanner.nextInt();
        int masukan3 = scanner.nextInt();

        int hasilEnkripsi1 = enkripsi(masukan1);
        int hasilEnkripsi2 = enkripsi(masukan2);
        int hasilEnkripsi3 = enkripsi(masukan3);

        // Menampilkan hasil enkripsi
        System.out.println(hasilEnkripsi1);
        System.out.println(hasilEnkripsi2);
        System.out.println(hasilEnkripsi3);
        scanner.close();
    }
    public static int enkripsi(int angka) {
        // Mengonversi angka ke dalam bentuk string untuk memudahkan manipulasi digit
        String angkaStr = Integer.toString(angka);

        // Langkah 1: Menambahkan 5 pada setiap digit dan mengambil satuan hasil penjumlahan
        StringBuilder hasilEnkripsi = new StringBuilder();
        for (char digit : angkaStr.toCharArray()) {
            int digitEnkripsi = (Character.getNumericValue(digit) + 5) % 10;
            hasilEnkripsi.append(digitEnkripsi);
        }
        // Langkah 2: Menukar digit kedua dan keempat
        char temp = hasilEnkripsi.charAt(1);
        hasilEnkripsi.setCharAt(1, hasilEnkripsi.charAt(3));
        hasilEnkripsi.setCharAt(3, temp);
        return Integer.parseInt(hasilEnkripsi.toString());
    }
}
