import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Petugas extends Person implements Login {

    public Petugas (String kode, String nama, String noHP, String username, String password){
        super(kode,nama,noHP,username,password);
    }
    public Petugas(){
        
        super("","","","","");
        boolean checkStatus = true;
        Scanner userInput = new Scanner(System.in);
        while(checkStatus){
            System.out.println("==== Login Petugas ====");
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

    public void signIn(){
        boolean checkStatus = true;
        try{
        File isiakun = new File("C:\\Users\\Wilson Tanjaya\\OneDrive\\Documents\\Proyek U Java\\Proyek Java UTS\\akunPetugas.txt");
        Scanner inputScanner = new Scanner(isiakun);
        
        while (inputScanner.hasNextLine()) { 
            String data = inputScanner.nextLine();
            String[] parts = data.split(",");
            String tempKode = parts[0];
            String tempNama = parts[1];
            String tempNoHP = parts[2];
            String tempUsername = parts[3];
            String tempPassword = parts[4];
            if (getUsername().equals(tempUsername) && getPassword().equals(tempPassword)) {
                checkStatus = false;
                super.setKode(tempKode);
                super.setNama(tempNama);
                super.setNoHP(tempNoHP);
                super.setUsername(tempUsername);
                super.setPassword(tempPassword);
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
