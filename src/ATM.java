import java.util.Scanner;


public class ATM {
    
    public void calis(Hesap hesap){
        Login login = new Login();
        Scanner Scanner = new Scanner(System.in);
        
        System.out.println("Bankamıza Hoşgeldiniz....");
        
        System.out.println("*********************************");
        System.out.println("Kullanıcı Grişi");
        System.out.println("**********************************");
        int giris_hakki = 3;
        
        while(true){
            if (login.Login(hesap)){
                System.out.println("Giriş Başarılı....");
                break;
            }
            else{
                System.out.println("Giriş Başarısız....");
                giris_hakki -= 1;
                System.out.println("Kalan giriş hakkı: " + giris_hakki);
            }
            if (giris_hakki == 0){
                System.out.println("Giriş hakkınız bitti....");
                return;
            }
           
        }
        System.out.println("**************************");
        String islemler = "1. Bakiye Görüntüle\n"
                + "2. Para Yatırma\n"
                + "3. Para Çekme\n"
                + "Çıkış için q'ya basınız";
           System.out.println(islemler);     
           System.out.println("*********************************");
           
          while (true){
              System.out.println("İşlem Seçiniz: ");
              String islem = Scanner.nextLine();
              
              if (islem.equals("q")){
                  break;
              }
              else if(islem.equals("1")){
                  System.out.println("Bakiyeniz: " + hesap.getBakiye());
              }
              else if(islem.equals("2")){
                  System.out.print("Yatırmak istedğiniz tutar: ");
                  int tutar;
                  tutar = Scanner.nextInt();
                  Scanner.nextLine();
                  hesap.paraYatır(tutar);
             }
              else if(islem.equals("3")){
                  System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                  int tutar;
                  tutar = Scanner.nextInt();
                  Scanner.nextLine();
                  hesap.paraÇek(tutar);
                  
              }
              else{
                  System.out.println("Geçersiz işlem...");
              }
              
         } 
        
        
    }
    
}