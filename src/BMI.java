import java.util.Scanner;

public class BMI {
    public String obliczBMI(int waga, double wzrost){
        double BMI = waga/(wzrost*wzrost);
        String wynik = String.valueOf(BMI);

        if (BMI < 16) {
            return "wygłodzenie";
        } else if (BMI < 17) {
            return "wychudzenie";
        } else if (BMI < 18.5) {
            return "niedowaga";
        } else if (BMI < 25) {
            return "wartość prawidłowa";
        } else if (BMI > 24.99) {
            return "ulana kurwa";
        }


        return wynik;
    }

    public static void main(String[] args) {
        BMI bmi = new BMI();
        System.out.println(bmi.obliczBMI(5,1.84));
    }
}
