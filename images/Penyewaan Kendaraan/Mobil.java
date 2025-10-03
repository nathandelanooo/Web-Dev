public class Mobil extends Kendaraan {
    private String jenis;
    private int kapasitas;
    private String fasilitas;
    private String transmisi;

    public Mobil(String plat, String model, String merk, int tahun, String status, String BBM, double harga, String warna, String j, int k, String f, String t) {
        super(plat, model,merk, tahun, status, BBM, harga,warna);
        this.jenis = j;
        this.kapasitas = k;
        this.fasilitas = f;
        this.transmisi = t;
    }

    public void setJenis(String j) {
        j = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setKapasitas(int k) {
        k = kapasitas;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setFasilitas(String f) {
        f = fasilitas;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setTransmisi(String t) {
        t = transmisi;
    }

    public String getTransmisi() {
        return transmisi;
    }

    //Override
    @Override
    public double hitungBiaya(int lamaSewa) {
        return lamaSewa * getHarga();
    }
}    
