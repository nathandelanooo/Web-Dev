public abstract class Kendaraan {
    private String plat;
    private String model;
    private String merk;
    private int tahun;
    private String status;
    private String BBM;
    private double harga;
    private String warna;

    public Kendaraan (String plat, String model, String merk, int tahun, String status, String BBM, double harga, String warna) {
        this.plat = plat;
        this.model = model;
        this.merk = merk;
        this.tahun = tahun;
        this.status = status;
        this.BBM = BBM;
        this.harga = harga;
        this.warna = warna;   
    }

    //Setter
    public void setStatus(String status) {
        this.status = status;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    //Getter
    public String getPlat() {
        return plat;
    }

    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public int getTahun() {
        return tahun;
    }

    public String getWarna() {
        return warna;
    }

    public String getStatus() {
        return status;
    }

    public double getHarga() {
        return harga;
    }

    public String getBbm() {
        return BBM;
    }

    //Abstract
    public abstract double hitungBiaya(int lamaSewa);

    public void Tampilan() {
        System.out.println(plat + " " + model + " " + merk + " " + tahun + " " + BBM + "Rp " + harga + " " + warna + " " + status);
    }
}
