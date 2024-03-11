package Minimarket;

public class Pegawai {
    protected String nama;
    protected double gaji;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public Pegawai() {
        
    }

    public Pegawai(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getnama() {
        return nama;
    }
    public double getGaji(){
        return gaji;
    }

}
class Kasir extends Pegawai {
    private String idKasir;

    public Kasir(String nama, double gaji, String idKasir) {
        super(nama, gaji);
        this.idKasir = idKasir;
    }

    public String getIdKasir() {
        return idKasir;
    }

    public void setIdKasir(String idKasir) {
        this.idKasir = idKasir;
    }
    public String getNama(){
        return super.nama;
    }

}
