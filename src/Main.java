
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ingrese el tipo de cambio que desea efectuar");
        Scanner input = new Scanner(System.in);
        ConsultaApi consulta = new ConsultaApi();
        var eleccion = input.nextLine();

        var respuesta = consulta.tipoDeCambio(eleccion);
        System.out.println(respuesta);



    }
}