public class Bus extends Kendaraan{
    private int jumlah;
    private String fitur;

    public Bus(String plat, String model, String merk, int tahun, String status, String BBM, double harga, String warna, int jum, String ftr) {
        super(plat, model, merk, tahun, status, BBM, harga, warna);
        this.jumlah = jum;
        this.fitur = ftr;
    }

    public void setJumlah(int jum) {
        jum = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setFitur(String ftr) {
        ftr = fitur;
    }

    public String getFitur() {
        return fitur;
    }

    @Override
    public double hitungBiaya(int lamaSewa) {
        return lamaSewa * getHarga();
    }
}
