import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName = "tayfun", password = "patikajava", uName, pWord;

        Scanner sc = new Scanner(System.in);
        System.out.print("Kullanıcı Adı: ");
        uName = sc.nextLine();
        System.out.print("Parola: ");
        pWord = sc.nextLine();

        if (uName.equals(userName) && pWord.equals(password)) {
            System.out.println("Başarılı Bir Şekilde Giriş Yaptınız...");
        } else {
            System.out.println("Kullanıcı Adı veya Parola yanlış...!");
            System.out.println("Parolanızı sıfırlamak ister misiniz? (e/h)");
            String karar = sc.nextLine();
            switch (karar) {
                case "e":
                    System.out.println("Yeni Parolanızı Giriniz...");
                    String newPassword = sc.nextLine();
                    if (newPassword.equals(password)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu");

                    }
                    password = newPassword;
                    break;
                case "h":
                    System.out.println("Tekrar Deneyiniz...");
                    break;
            }
        }
    }


}