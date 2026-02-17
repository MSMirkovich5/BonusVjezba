import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Zadatak 1 - Površina pravokutnika:
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Upišite duljinu pravokutnika: ");
        int duljina = input.nextInt();
        System.out.print("Upišite širinu pravokutnika: ");
        int sirina = input.nextInt();
        if (duljina != sirina){
            System.out.println("Površina pravokutnika je: " + duljina*sirina);
        }
        else System.out.println("Pravokutnik ne smije imati iste stranice! Površina kvadrata je: "+ duljina*sirina);

         */

        //Zadatak 2 - Temperatura:
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Upišite temperaturu: ");
        double temp = input.nextDouble();
        System.out.println("Fahrenheit: " + (temp*(9.0/5))+32);
        System.out.println("Kelvin: " + (temp+273.15));

         */

        //Zadatak 3 - FizzBuzz:
        /*
        for (int i = 1; i <= 100; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if (i%3==0){
                System.out.println("Buzz");
            }
            else if (i%5==0){
                System.out.println("Fizz");
            }
            else System.out.println(i);
        }

         */

        //Zadatak 4 - Polja Brojeva:
        Scanner input = new Scanner(System.in);
        System.out.print("Koliko brojeva želite u polju? ");
        int koliko = input.nextInt();
        int[] poljeBrojeva = new int[koliko];
        for (int i = 0; i < koliko; i++) {
            System.out.print("Unesite broj u polje: ");
            poljeBrojeva[i] = input.nextInt();
        }
        System.out.println("Najveći broj je: " + Arrays.stream(poljeBrojeva).max().getAsInt() + " Najmanji broj je: " + Arrays.stream(poljeBrojeva).min().getAsInt());
    }

}
