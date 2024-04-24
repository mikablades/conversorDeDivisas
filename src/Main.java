
import java.util.*;

public class Main {
    public static void main(String[] args) throws InputMismatchException {

        String monedas = """
               *********************************************
                                BIENVENIDO
                Monedas disponibles para cambio:
                
                    ARS - Peso argentino
                    BOB - Boliviano boliviano
                    BRL - Real brasileño
                    CLP - Peso chileno
                    COP - Peso colombiano
                    USD - Dólar estadounidense
                    
               *********************************************
                """;


        Scanner input = new Scanner(System.in);
        System.out.println(monedas);
        while (true){
            System.out.println("Ingrese las siglas de la moneda de origen");
            String divOrigen = input.next().toUpperCase();
            System.out.println("Ingrese las siglas de la que desea obtener");
            String divSalida = input.next().toUpperCase();

            System.out.println("Ingrese la cantidad a convertir");
            double valorSalida = input.nextDouble();
            var convertido = ConsultaRates.consulta(divOrigen, divSalida,valorSalida);
            System.out.println("El valor "+ valorSalida + " " + divOrigen + " es igual a " + convertido + " " + divSalida);


            System.out.println("Escriba <<no>> para dejar de convertir  ");
            String opc = input.next();
            if (opc .equalsIgnoreCase("no")){
                System.out.println("Gracias por utilizar nuestros servicios.");
                break;
            }
        }
    }

}
