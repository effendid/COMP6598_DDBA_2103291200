import java.util.Scanner;

public class TugasKelompokDuaNomorTiga {
    public static final Scanner input = new Scanner(System.in);

    // Deklarasi warna
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        int angka = 0;
        while (angka != 4) {
            menuUtama();
            System.out.print("Masukkan Menu 1 - 4 : ");
            angka = input.nextInt();
            switch (angka){
                case 1 :
                    hitungTabung();
                    break;
                case 2 :
                    hitungBalok();
                    break;
                case 3 :
                    hitungBola();
                    break;
                case 4 :
                    System.exit(0);
                default:
                    System.out.println(ANSI_CYAN_BACKGROUND + "Hanya menerima inputan 1 - 4" + ANSI_RESET);
            }
        }
    }

    public static void menuUtama(){
        String pesan = ". Hitung luas permukaan dan volume ";
        for (int i = 0; i < 4; i++) {
            if (i == 0){
                System.out.println(i+1 + pesan + "tabung");
            } else if (i == 1){
                System.out.println(i+1 + pesan + "balok");
            } else if (i == 2){
                System.out.println(i+1 + pesan + "bola");
            }else if (i == 3){
                System.out.println(i+1 + ". Keluar");
            }
        }
    }

    public static void pause(){
        Scanner wait = new Scanner(System.in);
        wait.nextLine();
    }

    public static void hitungTabung(){
        double jari_jari, tinggi, luas_permukaan, volume;
        System.out.print("Jari-Jari : ");
        jari_jari = input.nextDouble();

        System.out.print("Tinggi : ");
        tinggi = input.nextDouble();

        luas_permukaan = (2 * Math.PI * Math.pow(jari_jari,2)) + (2 * Math.PI * jari_jari * tinggi);
        System.out.println("Luas Permukaan Tabung : " + luas_permukaan);

        volume = (Math.PI * Math.pow(jari_jari,2) * tinggi);
        System.out.println("Volume Tabung : " + volume);

        pause();
    }

    public static void hitungBalok(){
        double panjang, lebar, tinggi, luas_permukaan, volume;
        System.out.print("Panjang : ");
        panjang = input.nextDouble();

        System.out.print("Lebar : ");
        lebar = input.nextDouble();

        System.out.print("Tinggi : ");
        tinggi = input.nextDouble();

        luas_permukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
        System.out.println("Luas Permukaan Balok : " + luas_permukaan);

        volume = panjang * lebar * tinggi;
        System.out.println("Volume Balok : " + volume);

        pause();
    }

    public static void hitungBola(){
        double jari_jari, luas_permukaan, volume;
        System.out.print("Jari-Jari : ");
        jari_jari = input.nextDouble();

        luas_permukaan = (4 * Math.PI * Math.pow(jari_jari,2));
        System.out.println("Luas Permukaan Bola : " + luas_permukaan);

        volume = (4.0 / 3) * Math.PI * Math.pow(jari_jari,3);
        System.out.println("Volume Bola : " + volume);

        pause();
    }
}
