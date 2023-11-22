import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double marka = 5.5;
        System.out.println("CAR стоимость машины на километр"+" " + Transport.CAR.proezd(marka));
        double marksOne = 6.5;
        System.out.println("BUS стоимость машины на километр"+ " "+ Transport.BUS.proezd(marksOne));
        double markaTwo = 10.5;
        System.out.println("TRUCK стоимость машины на километр"+ " "+ Transport.TRUCK.proezd(markaTwo));
    }
}



