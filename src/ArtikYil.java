import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner( System.in);

        System.out.println(" Lutfen yil giriniz: ");
        a= input.nextInt();

        double artikyil= (a %4);
        if ( a %4 == 0 ) {
            System.out.println("Artik bir yildir..");
        if (a %400 == 0) {
            System.out.println("Artik bir yildir..");}
        }
        else {
            System.out.println(" Artik bir yil degildir..");
        }

    }
}
