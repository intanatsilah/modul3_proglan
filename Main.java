import java.util.Scanner;

/**
 * @author intan
 */
public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * memiliki variabel sisi, luas
         */
        int sisi, luas;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan panjang sisi persegi : ");
        sisi = sc.nextInt();
        luas = sisi * sisi;
        /**
         * untuk melakukan inputan sisi
         */

        System.out.println("Luas persegi adalah "+luas);
        /**
         * untuk menampilkan hasil perhitungan luas persegi
         */
    }
}
