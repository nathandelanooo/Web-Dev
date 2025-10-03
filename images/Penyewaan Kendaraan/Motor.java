public class Motor extends Kendaraan {
    private String tipe;
    private int roda;

    public Motor (String plat, String model, String merk, int tahun, String status, String BBM, double harga, String warna, String tip, int rd) {
        super(plat, model, merk, tahun, status, BBM, harga, warna);
        this.tipe = tip;
        this.roda = rd;
    }

    public void setTipe(String tip) {
        tip = tipe;
    }

    public String getTipe() {
        return tipe;
    }

    public void setRoda(int rd) {
        rd = roda;
    }

    public int getRoda() {
        return roda;
    }

    @Override
    public double hitungBiaya(int lamaSewa) {
        return lamaSewa * getHarga();
    }
}
