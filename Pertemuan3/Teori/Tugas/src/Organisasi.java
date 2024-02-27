abstract class Pekerjaan {
    protected String nama;
    protected int gajiPokok;

    public Pekerjaan(String nama, int gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    abstract int hitungGaji(int jumlahAbsen);
}

class PekerjaTetap extends Pekerjaan {
    private int bonus;

    public PekerjaTetap(String nama, int gajiPokok, int bonus) {
        super(nama, gajiPokok);
        this.bonus = bonus;
    }

    @Override
    int hitungGaji(int jumlahAbsen) {
        return gajiPokok + bonus - (jumlahAbsen * 10000); // Setiap absen dikurangi Rp 10.000
    }
}

class PekerjaPartTime extends Pekerjaan {
    private int tarifPerJam;
    private int jumlahJamKerja;

    public PekerjaPartTime(String nama, int gajiPokok, int tarifPerJam, int jumlahJamKerja) {
        super(nama, gajiPokok);
        this.tarifPerJam = tarifPerJam;
        this.jumlahJamKerja = jumlahJamKerja;
    }

    @Override
    int hitungGaji(int jumlahAbsen) {
        return gajiPokok + (tarifPerJam * jumlahJamKerja) - (jumlahAbsen * 5000); // Setiap absen dikurangi Rp 5.000
    }
}

public class Organisasi  {
    public static void main(String[] args) {
        Pekerjaan pekerja1 = new PekerjaTetap("John", 5000000, 1000000);
        Pekerjaan pekerja2 = new PekerjaPartTime("Doe", 0, 100000, 20);

        int absensiPekerja1 = 5; // Contoh absensi pekerja1
        int absensiPekerja2 = 2; // Contoh absensi pekerja2

        System.out.println("Gaji " + pekerja1.nama + ": Rp " + pekerja1.hitungGaji(absensiPekerja1));
        System.out.println("Gaji " + pekerja2.nama + ": Rp " + pekerja2.hitungGaji(absensiPekerja2));
    }
}
