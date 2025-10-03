public abstract class Person {
    protected  String kode, nama,noHP, username, password;
    public Person(String kode, String nama, String noHP, String username, String password){
        setKode(kode);
        setNama(nama);
        setNoHP(noHP);
        setUsername(username);
        setPassword(password);
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getKode() {
        return kode;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }
    public String getNoHP() {
        return noHP;
    }
    public void setUsername(String Username) {
        this.username = Username;
    }
    public String getUsername() {
        return username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
}