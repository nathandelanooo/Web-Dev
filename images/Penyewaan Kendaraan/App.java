import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Penyewa penyewa1 = null;
        boolean status = true;
        Scanner userInput = new Scanner(System.in);
        
        Petugas petugas1 = new Petugas();
        System.out.println("==== Data Petugas ====");
        System.out.println("NIK: " + petugas1.getKode());
        System.out.println("Nama: " + petugas1.getNama());
        System.out.println("No HP: " + petugas1.getNoHP());
        
        while(status){
        System.out.println("klik 'y' untuk lanjut: ");
        String pilihan = userInput.nextLine();
        
        
        if(pilihan.equalsIgnoreCase("y")){
        penyewa1 = new Penyewa();
        System.out.println("==== Data Penyewa ====");
        System.out.println("NIK: " + penyewa1.getKode());
        System.out.println("Nama: " + penyewa1.getNama());
        System.out.println("No HP: " + penyewa1.getNoHP());
        System.out.println("Alamat: " + penyewa1.getAlamat());
        System.out.println("No SIM: " + penyewa1.getNoSIM());
        status = false;
        }else{
            status = true;
        }
    }
        ArrayList<Motor> listMotor = new ArrayList<>();
        listMotor.add(new Motor("B 4351 CPK", "Beat", "Honda", 2025, "Tersedia", "Pertalite", 150000, "Biru", "Matic", 2));
        listMotor.add(new Motor("B 5830 MSN", "NMax", "Yamaha", 2018, "Tersedia", "Pertamax", 350000, "Silver", "Matic", 2));
        listMotor.add(new Motor("B 3333 MSN", "Aerox", "Yamaha", 2019, "Tersedia", "Pertamax", 250000, "Hijau", "Matic", 2));

        ArrayList<Mobil> listMobil = new ArrayList<>();
        listMobil.add(new Mobil("B 7736 IHS", "Avanza", "Toyota", 2010, "Tersedia", "Pertamax", 3000000, "Kuning", "Kopling", 6, "AC", "MT"));
        listMobil.add(new Mobil("B 3546 GSO", "Pajero", "Mitsubishi", 2017, "Tersedia", "Diesel", 7000000, "Abu Abu", "Matic", 8, "Kursi Pijat", "AT"));
        listMobil.add(new Mobil("B 5320 TSJ", "Xenia", "Daihatsu", 2022, "Tersedia", "Pertalite", 1500000, "Merah", "Kopling", 6, "AC", "MT"));

        ArrayList<Bus> listBus =  new ArrayList<>();
        listBus.add(new Bus("B 2368 LPM", "Dutro", "Hino", 2010, "Tersedia", "Solar", 15000000, "Kuning", 80, "Sofa"));
        listBus.add(new Bus("B 2090 MLM", "OH860", "Mercedes-Benz", 2018, "Tersedia", "Solar", 20000000, "Biru", 100, "Sofa"));
        listBus.add(new Bus("B 2368 LPM", "OM8056LA", "Mercedes-Benz", 2024, "Tersedia", "Solar", 35000000, "Hitam", 75, "Sofa"));

        System.out.println("\n=== PILIH KATEGORI KENDARAAN ===");
        System.out.println("1. Motor");
        System.out.println("2. Mobil");
        System.out.println("3. Bus");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = input.nextInt();
        input.nextLine(); 

        Kendaraan k = null;

        switch (pilihan) {
            case 1:
                System.out.println("\n=== DAFTAR MOTOR ===");
                for (int i = 0; i < listMotor.size(); i++) {
                    Motor mtr = listMotor.get(i);
                    System.out.println((i + 1) + ". " + mtr.getPlat() + ", " + mtr.getModel() + ", " + mtr.getMerk() + ", " + mtr.getTahun() + ", " + mtr.getStatus() + ", " + mtr.getBbm() + ", " + mtr.getWarna() + ", " + mtr.getTipe() + ", " + mtr.getRoda());
                }
                System.out.println("Pilih Motor (1-" + listMotor.size() + "): ");
                int pilihmotor = input.nextInt();
                k = listMotor.get(pilihmotor - 1);
                break;

            case 2:
                System.out.println("\n=== DAFTAR MOBIL ===");
                for (int i = 0; i < listMobil.size(); i++) {
                    Mobil mbl = listMobil.get(i);
                    System.out.println((i + 1) + ". " + mbl.getPlat() + ", " + mbl.getModel() + ", " + mbl.getMerk() + ", " + mbl.getTahun() + ", " + mbl.getStatus() + ", " + mbl.getBbm() + ", " + mbl.getWarna() + ", " + mbl.getJenis() + ", " + mbl.getKapasitas() + ", " + mbl.getFasilitas() + ", " + mbl.getTransmisi());
                }
                System.out.print("Pilih mobil (1-" + listMobil.size() + "): ");
                int pilihMobil = input.nextInt();
                k = listMobil.get(pilihMobil - 1);
                break;

            case 3:
                System.out.println("\n=== DAFTAR BUS ===");
                for (int i = 0; i < listBus.size(); i++) {
                    Bus bs = listBus.get(i);
                    System.out.println((i + 1) + ". " + bs.getPlat() + ", " + bs.getModel() + ", " + bs.getMerk() + ", " + bs.getTahun() + ", " + bs.getStatus() + ", " + bs.getBbm() + ", " + bs.getWarna() + ", " + bs.getJumlah() + ", " + bs.getFitur());
                }
                System.out.print("Pilih bus (1-" + listBus.size() + "): ");
                int pilihBus = input.nextInt();
                k = listBus.get(pilihBus - 1);
                break;

            default:
                System.out.println("Pilihan Anda tidak valid");
                return;
        }

        System.out.print("Masukkan Berapa Lama sewa : ");
        int lama = input.nextInt();

        double totalBiaya = k.hitungBiaya(lama);

        System.out.println("\n=== INFORMASI SEWA ===");
        System.out.println("Nama: " + penyewa1.getNama());
        System.out.println("Kendaraan: " + k.getClass());
        System.out.println("Lama sewa: " + lama + " hari");
        System.out.println("Total biaya sewa: Rp " + totalBiaya);

        try (FileWriter fw = new FileWriter("C:\\Users\\LEGION\\OneDrive\\Documents\\Proyek Java UTS\\sewa1.txt", true)) {
            fw.write(penyewa1.getNama() + " , " + k.getPlat() + " , " + k.getModel() +" , " + k.getMerk() + " , " + k.getTahun() + " , " + k.getStatus() + " , " + k.getBbm() + " , " + k.getWarna());
            if (k instanceof Motor) {
                Motor mtr = (Motor) k;
                fw.write(" , " + mtr.getTipe() + " , " + mtr.getRoda() + " , " + lama + " hari, " + totalBiaya);
            } else if (k instanceof Mobil) {
                Mobil mbl = (Mobil) k;
                fw.write(" , " + mbl.getJenis() + " , " + mbl.getKapasitas() + " , " + mbl.getFasilitas() + " , " + mbl.getTransmisi() + " , " + lama + " hari, " + totalBiaya);
            } else if (k instanceof Bus) {
                Bus bs = (Bus) k;
                fw.write(" , " + bs.getJumlah() + " , " + bs.getFitur() + " , " + lama + " hari, " + totalBiaya);
            }
            System.out.println("\nData sewa berhasil disimpan ke file sewa.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n=== DATA SEWA YANG TERSIMPAN ===");
        try (Scanner fileReader = new Scanner(new File("C:\\Users\\Wilson Tanjaya\\OneDrive\\Documents\\Proyek U Java\\Proyek Java UTS\\sewa1.txt"))) {
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
         ArrayList<Rental> rentalList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Rental ID: ");
        String rentalId = sc.nextLine();
        System.out.print("Masukkan Lama Sewa (hari): ");
        int lamaSewa = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Masukkan Total Biaya: ");
        double TotalBiaya = sc.nextLong();
        sc.nextLine();
        System.out.print("Masukkan Nama Petugas: ");
        String namaPetugas = sc.nextLine();
        System.out.print("Masukkan Nama Penyewa: ");
        String namaPenyewa = sc.nextLine();
        System.out.print("Masukkan Plat Kendaraan: ");
        String plat = sc.nextLine();
        System.out.print("Masukkan Merk Kendaraan: ");
        String merk = sc.nextLine();
        System.out.print("Masukkan Model Kendaraan: ");
        String model = sc.nextLine();

        Petugas p = new Petugas("", namaPetugas, "", "", "");
        Penyewa py = new Penyewa("", namaPenyewa, "", "", "", "", "");
        Kendaraan K = new Motor(plat, model, merk, 0, "Tersedia", "Pertalite", 0, "Hitam", "Matic", 2);


        Rental r = new Rental(rentalId, lamaSewa, TotalBiaya,
        LocalDate.now(),
        LocalDate.now().plusDays(lamaSewa),
        K, p, py);

        rentalList.add(r);

        if (!rentalList.isEmpty()) {
            writeToFile(rentalList);
        } else {
            System.out.println("Belum ada data untuk disimpan.");
        }

        sc.close();
    }

    public static void writeToFile(ArrayList<Rental> rentalList) {
        try {
            FileWriter writer = new FileWriter(
                "C:\\Users\\Wilson Tanjaya\\OneDrive\\Documents\\Proyek U Java\\Proyek Java UTS\\DataRental.txt");

            for (Rental r : rentalList) {
                writer.write("RentalID : " + r.getRentalID() + "\n");
                writer.write("Petugas  : " + r.getObjPetugas().getNama() + "\n");
                writer.write("Penyewa  : " + r.getObjPenyewa().getNama() + "\n");
                writer.write("Plat     : " + r.getObjKendaraan().getPlat() + "\n");
                writer.write("Merk     : " + r.getObjKendaraan().getMerk() + "\n");
                writer.write("Model    : " + r.getObjKendaraan().getModel() + "\n");
                writer.write("Lama Sewa: " + r.getLamaSewa() + " hari\n");
                writer.write("Total Biaya: " + r.getTotalBiaya() + "\n");
                writer.write("-----------------------------------\n");
            }

            writer.close();
            System.out.println("File berhasil dibuat (DataRental.txt).");
        } catch (IOException e) {
            System.out.println("Terjadi error saat menulis file.");
            e.printStackTrace();
        }

        System.out.println("\n===Kwitansi Rental===");
        for (Rental r : rentalList) {
            System.out.println("RentalID : " + r.getRentalID());
            System.out.println("Petugas  : " + r.getObjPetugas().getNama());
            System.out.println("Penyewa  : " + r.getObjPenyewa().getNama());
            System.out.println("Plat     : " + r.getObjKendaraan().getPlat());
            System.out.println("Merk     : " + r.getObjKendaraan().getMerk());
            System.out.println("Model    : " + r.getObjKendaraan().getModel());
            System.out.println("Lama Sewa: " + r.getLamaSewa() + " hari");
            System.out.println("Total Biaya: " + r.getTotalBiaya());
            System.out.println("-----------------------------------");
        }
    }
}        

