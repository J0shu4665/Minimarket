package Minimarket;
import java.util.Scanner;
public class minimarket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama kasir: ");
        String namaKasir = in.nextLine();

        System.out.print("Masukkan gaji kasir: ");
        double gajiKasir = in.nextDouble();

        System.out.print("Masukkan ID kasir: ");
        String idKasir = in.next();

        Kasir kasir1 = new Kasir(namaKasir, gajiKasir, idKasir);
        System.out.println("Nama Kasir: " + kasir1.getNama());
        System.out.println("Gaji Kasir: " + kasir1.getGaji());
        System.out.println("ID Kasir: " + kasir1.getIdKasir());
       
        
        pembeli status = new pembeli();
        String membership = in.nextLine();
        status.setMembership(membership);
        
        makanan makanan = new makanan();
        System.out.print("Masukkan nama makanan: ");
        String namaMakanan = in.nextLine();
        double hargaMakanan = makanan.getHarga(namaMakanan);
        if (hargaMakanan != 0.0) {
            System.out.println("Harga " + namaMakanan + " adalah: " + hargaMakanan);
        } else {
            System.out.println("Makanan tidak ditemukan.");
        }

        in.close();
     
    }
}
