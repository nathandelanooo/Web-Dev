import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Penyewa extends Person implements Login {
   String alamat, noSIM;
    public Penyewa (String kode, String nama, String noHP, String alamat, String noSIM, String username, String password){
        super(kode,nama,noHP,username,password);
        setAlamat(alamat);
        setNoSIM(noSIM);
   }
   
        public Penyewa(){
            super("","","","","");
            boolean checkStatus = true;
            Scanner userInput = new Scanner(System.in);
            while(checkStatus){
            System.out.println("==== Login Penyewa ====");
            System.out.print("Masukkan Username: ");
            String n = userInput.nextLine(); super.setUsername(n);
            System.out.print("Masukkan Password: ");
            String p = userInput.nextLine(); super.setPassword(p);
            signIn();

            if(getNama().equals("")){
                checkStatus = true;
            }else{
                checkStatus = false;
            }
        }
        }

   public void setAlamat(String alamat) {
       this.alamat = alamat;
   }

    public String getAlamat() {
        return alamat;
    }
   public void setNoSIM(String noSIM) {
       this.noSIM = noSIM;
   }

    public String getNoSIM() {
        return noSIM;
    }
    public void signIn(){

        boolean checkStatus = false;
        try{
        File isiakun = new File("C:\\Users\\Wilson Tanjaya\\OneDrive\\Documents\\Proyek U Java\\Proyek Java UTS\\akunPenyewa.txt");
        Scanner inputScanner = new Scanner(isiakun);
        
        while (inputScanner.hasNextLine()) { 
            String data = inputScanner.nextLine();
            String[] parts = data.split(",");
            String tempKode = parts[0];
            String tempNama = parts[1];
            String tempNoHP = parts[2];
            String tempAlamat = parts[3];
            String tempNoSIM = parts[4];
            String tempUsername = parts[5];
            String tempPassword = parts[6];
            if (getUsername().equals(tempUsername) && getPassword().equals(tempPassword)) {
                checkStatus = true;
                super.setKode(tempKode);
                super.setNama(tempNama);
                super.setNoHP(tempNoHP);
                setAlamat(tempAlamat);
                setNoSIM(tempNoSIM);
                break;
            }else{
                super.setNama("");
            }
        }
        }catch (FileNotFoundException e){
            System.out.println("An Error Occured");
            e.printStackTrace();
        }
    }
   
}