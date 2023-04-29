import java.util.Scanner;
public class KGiris {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String username, password;

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        username = input.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java")){
            System.out.println("Giriş Yaptınız");
        } else {
            System.out.println("Tekrar Deneyiniz");
        }



    }

}
