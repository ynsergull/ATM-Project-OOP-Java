public class Hesap {
    
    private String kullanici_adi;
    private String parola;
    private int bakiye;

    public Hesap(String kullanici_adi, String parola, int bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    public void paraYatır(int tutar){
        bakiye += tutar;
        System.out.println("Yeni bakiyeniz: " + bakiye);
    }
    public void paraÇek(int tutar){
        if(bakiye<tutar){
            System.out.println("Yetersiz bakiye.");
        }
        else{
            bakiye -= tutar;
            System.out.println("Yeni bakiyeniz: " + bakiye);
        }
    }
}