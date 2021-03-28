import java.util.Scanner;
    /*
            Adnan Bayu Aji		2440101295
            Dwi Mahmud Effendi	2440076343
            Pebry Harnelfi Mirza	2440099561
            Arighi Yuskowanastra	2440099321
    */

public class TugasKelompokDuaNomorSatu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // menerima inputan untuk angka pertama
        System.out.print("Masukkan angka : ");
        int angka  = input.nextInt();

        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < angka; j++) {
                System.out.print(" X");
            }
            System.out.println("");
        }
    }
}
