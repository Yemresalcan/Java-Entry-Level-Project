import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password;
        Scanner input = new Scanner(System.in);
        int right = 3 ;
        int balance = 2500;
        int select;

        while (right > 0) {
            System.out.println("Kullanıcı adınız: ");
            userName=input.nextLine();

            System.out.println("Parolanızı giriniz: ");
            password= input.nextLine();
            if(userName.equals("yunus") && password.equals("1234")) {
                System.out.println("Merhaba Bankamatiğe Hoş geldiniz ");
               do{
                   System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
                   System.out.println("1-Para yatırma\n"+
                           "2-Para Çekme\n"+
                           "3-Bakiye Sorgulama\n"
                           +"4-Çıkış yap");
                   select = input.nextInt();
                   switch (select) {
                       case 1 -> {
                           System.out.println("Yatırılacak Para miktari :");
                           int price = input.nextInt();
                           balance += price;
                       }
                       case 2 -> {
                           System.out.println("Çekmek istediğiniz Para miktarı : ");
                           int price = input.nextInt();
                           balance -= price;
                       }

                       case 3 -> {
                           System.out.println("Bakiyeniz : "+balance);
                       }

                   }


               }while (select !=4);
                break;

            }else{
                right--;
                System.out.println("Yanlış Kullanıcı adı veya şifre! Kalan hakkınız : "+right);
                if(right==0) {
                    System.out.println("Hesabınız bloke oldu bankanız ile iletişime geçiniz");
                }
            }


        }


    }
}