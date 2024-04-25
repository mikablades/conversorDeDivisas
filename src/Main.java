
import java.util.*;

public class Main {
    public static void main(String[] args) throws InputMismatchException {

        String monedas = """
               |==================================================|
               |                  Rare Exchange                   |
               |    Monedas disponibles para tu extraño cambio:   |
               |                                                  |
               |       KGS - Kyrgyzstani Som (Kyrgyzstan)         |
               |       CLP - Peso Chileno                         |
               |       MOP - Macanese Pataca (Macau)              |
               |       PGK - Papua New Guinean Kina               |
               |       SZL - Eswatini Lilangeni (Eswatini)        |
               |       WST - Samoan Tālā (Samoa)                  |
               |                                                  |
               |==================================================|
               """;


        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println(monedas+"\n");
            System.out.println("Ingrese las siglas de la moneda de origen");
            String divOrigen = input.next().toUpperCase();
            System.out.println("Ingrese las siglas de la que desea obtener");
            String divSalida = input.next().toUpperCase();

            System.out.println("Ingrese la cantidad a convertir");
            double valorSalida = input.nextDouble();
            var convertido = ConsultaRates.consulta(divOrigen, divSalida,valorSalida);
            System.out.println("--------------------------------------------------\n"
                    +"El valor de "+ valorSalida + " "
                    + divOrigen + " es igual a "
                    + convertido + " " + divSalida +"\n"+
                    "--------------------------------------------------");

            System.out.println("1 -> otra conversion \n" +
                    "2 -> Salir del programa");
            String salida = input.next();
            if (salida .equalsIgnoreCase("2")){
                System.out.println("Finalizando...");
                break;
            }
        }
    }

}
