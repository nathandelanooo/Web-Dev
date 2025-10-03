
import java.time.LocalDate;

public class Rental {
    String RentalID;
    int LamaSewa;
    double TotalBiaya;
    LocalDate TglMulai;
    LocalDate TglSelesai;
    Kendaraan ObjKendaraan;
    Petugas ObjPetugas;
    Penyewa ObjPenyewa;

    public Rental (String ID, int Ls, Double Tb, LocalDate M, LocalDate S, Kendaraan K, Petugas Pt, Penyewa Py){
        setRentalID (ID);
        setLamaSewa (Ls);
        setTotalBiaya (Tb);
        setTglMulai(M);
        setTglSelesai (S);
        setObjKendaraan (K);
        setObjPetugas(Pt);
        setObjPenyewa(Py);
    }

    public void setRentalID(String rentalID) {
        RentalID = rentalID;
    }

    public String getRentalID() {
        return RentalID;
    }

    public void setLamaSewa(int lamaSewa) {
        LamaSewa = lamaSewa;
    }

    public int getLamaSewa() {
        return LamaSewa;
    }

    public void setTotalBiaya(Double totalBiaya) {
        TotalBiaya = totalBiaya;
    }
    public Double getTotalBiaya() {
        return TotalBiaya;
    }
    public void setTglMulai(LocalDate tglMulai) {
        TglMulai = tglMulai;
    }
    public LocalDate getTglMulai() {
        return TglMulai;
    }
    public void setTglSelesai(LocalDate tglSelesai) {
        TglSelesai = tglSelesai;
    }
    public LocalDate getTglSelesai() {
        return TglSelesai;
    }
    public void setObjKendaraan(Kendaraan objKendaraan) {
        ObjKendaraan = objKendaraan;
    }
    public Kendaraan getObjKendaraan() {
        return ObjKendaraan;
    }
    public void setObjPenyewa(Penyewa objPenyewa) {
        ObjPenyewa = objPenyewa;
    }
    public Penyewa getObjPenyewa() {
        return ObjPenyewa;
    }
    public void setObjPetugas(Petugas objPetugas) {
        ObjPetugas = objPetugas;
    }
    public Petugas getObjPetugas() {
        return ObjPetugas;
    }
   
}
