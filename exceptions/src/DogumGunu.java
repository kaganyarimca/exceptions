import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DogumGunu {

    public static void  main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğum Günü Tebrik Programı");
        System.out.println("Doğum gününüz ve saatinizi giriniz:");
        String dogumGunuInput= scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dogumGunu = LocalDateTime.parse(dogumGunuInput, formatter);

        LocalDateTime bugun = LocalDateTime.now();

        if (dogumGunu.getMonthValue() == bugun.getMonthValue() && dogumGunu.getDayOfMonth() == bugun.getDayOfMonth() ){
            System.out.println("Bugün doğum gününüz, İyi ki doğdunuz.");
        }
        else{
            long gunKaldi = bugun.until(dogumGunu, ChronoUnit.DAYS);
            long saatKaldi = bugun.until(dogumGunu, ChronoUnit.HOURS);
            System.out.printf("Doğum gününüze: " + gunKaldi + "gün, veya" + saatKaldi + "saat kaldı.    " );

        }
        scanner.close();
    }
}
