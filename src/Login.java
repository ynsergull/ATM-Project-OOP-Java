import java.util.Scanner;


public class Login {
    public boolean Login(Hesap hesap){
        Scanner Scanner = new Scanner(System.in);
        
        String kullanici_adi;
        String parola;
        System.out.println("Kullanıcı adı: ");
        kullanici_adi = Scanner.nextLine();
        System.out.println("Parola: ");
        parola = Scanner.nextLine();
        
        if (hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola)){
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
