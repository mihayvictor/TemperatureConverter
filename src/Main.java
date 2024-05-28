import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double celsius, fahrenheit, kelvin;

        Scanner input = new Scanner(System.in);

        System.out.println("*** Seja bem-vindo ao Temperature Converter ***");
        System.out.print("Digite uma temperatura em graus Celsius: ");
        celsius = input.nextDouble();
        fahrenheit = celsius * 1.8 + 32;
        kelvin = celsius + 273.15;
        Util.limpar();
        System.out.printf("| %.1f °C (Celsius) \n| %.1f °F (fahrenheit) \n| %.1f K (kelvin)    \n", celsius, fahrenheit, kelvin);
    }
}
