 abstract class Kendaraan {
    // atribut umum semua kendaraan
    private String merek;
    private String warna;
    private int tahunProduksi;
    
    //construktor
    Kendaraan(String merek, String warna, int tahunProduksi){
        this.merek = merek;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }
    
    //Method informasi
    void informasi(){}

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
}

abstract class KendaraanLaut extends Kendaraan {
    KendaraanLaut(String merek, String warna, int tahunProduksi) {
        super(merek, warna, tahunProduksi);
    }
}

abstract class KendaraanUdara extends Kendaraan {
    KendaraanUdara(String merek, String warna, int tahunProduksi) {
        super(merek, warna, tahunProduksi);
    }
}

abstract class KendaraanDarat extends Kendaraan {
    KendaraanDarat(String merek, String warna, int tahunProduksi) {
        super(merek, warna, tahunProduksi);
    }
}

class Kapal extends KendaraanLaut {
    Kapal (String merek, String warna, int tahunProduksi){
        super(merek, warna, tahunProduksi);
    }

    @Override
    void informasi() {
        System.out.println("Kapal " + getMerek() + ", Warna " + getWarna() + ", Tahun Produksi " + getTahunProduksi());
    }
}

class Pesawat extends KendaraanUdara {
    Pesawat (String merek, String warna, int tahunProduksi){
        super(merek, warna, tahunProduksi);
    }

    @Override
    void informasi() {
        System.out.println("Pesawat " + getMerek() + ", Warna " + getWarna() + ", Tahun Produksi " + getTahunProduksi());
    }
}

class Mobil extends KendaraanDarat {
    Mobil (String merek, String warna, int tahunProduksi){
        super(merek, warna, tahunProduksi);
    }

    @Override
    void informasi() {
        System.out.println("Mobil " + getMerek() + ", Warna " + getWarna() + ", Tahun Produksi " + getTahunProduksi());
    }
}

class Motor extends KendaraanDarat {
    Motor (String merek, String warna, int tahunProduksi){
        super(merek, warna, tahunProduksi);
    }

    @Override
    void informasi() {
        System.out.println("Motor " + getMerek() + ", Warna " + getWarna() + ", Tahun Produksi " + getTahunProduksi());
    }
}


public class Transfortasi {
    public static void main(String[] args) throws Exception {
        // Membuat objek Kapal
        Kapal kapal = new Kapal("Titanic", "Putih", 1912);
        kapal.informasi();

        // Membuat objek Pesawat
        Pesawat pesawat = new Pesawat("Boeing 747", "Biru", 1998);
        pesawat.informasi();

        // Membuat objek Mobil
        Mobil mobil = new Mobil("Toyota", "Hitam", 2020);
        mobil.informasi();

        // Membuat objek Motor
        Motor motor = new Motor("Honda", "Beat", 2022);
        motor.informasi();
    }
}


