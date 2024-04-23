import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingresar cambio: \n");
        String cambio = input.nextLine();
        ConsultaRates consultaRates = new ConsultaRates();
        Rates rate = consultaRates.consulta(cambio);
        System.out.println(rate);

    }
}
