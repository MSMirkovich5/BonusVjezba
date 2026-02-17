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
        Scanner input = new Scanner(System.in);
        System.out.print("Upišite temperaturu: ");
        double temp = input.nextDouble();
        System.out.println("Fahrenheit: " + (temp*(9.0/5))+32);
        System.out.println("Kelvin: " + (temp+273.15));
    }

}
