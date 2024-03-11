package Minimarket;
import java.util.ArrayList;

class makanan extends Barang {
    private ArrayList<String> daftarMakanan = new ArrayList<>();
    private ArrayList<Double> hargaMakanan = new ArrayList<>();

    public makanan() {
        daftarMakanan.add("Mie Instan");
        hargaMakanan.add(5000.0);
        daftarMakanan.add("Nugget");
        hargaMakanan.add(20000.0);
    }

    public double getHarga(String namaMakanan) {
        int index = daftarMakanan.indexOf(namaMakanan);
        if (index != -1) {
            return hargaMakanan.get(index);
        }
        return 0.0;
    }
}

class minuman extends Barang{

}

public class Barang {
    static ArrayList<ArrayList<String>> In = new ArrayList<>();
    protected String nama;
    protected double harga;
    protected int stok;
    protected ArrayList<makanan> listMakanan = new ArrayList<>();
    protected ArrayList<minuman> listMinuman = new ArrayList<>();

    public void setNama(String nama) {
        this.nama = nama;
        
    }
    public String getNama() {
        return nama;
    }
    public void setHarga (double harga) {
        this.harga = harga;
    }
    public double getHarga() {
        return harga;
    }

    public ArrayList<makanan> getListMakanan() {
        return listMakanan;
    }

    public ArrayList<minuman> getListMinuman() {
        return listMinuman;
    }
}