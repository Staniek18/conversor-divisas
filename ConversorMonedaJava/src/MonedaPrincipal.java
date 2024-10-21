import java.util.InputMismatchException;
import java.util.Scanner;

public class MonedaPrincipal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        int op=0;
        Double cantidadP=0.0;
        String monedaOrigen = "";
        String monedaDestino = "";

        while (op!=7){

            System.out.println("\n**********************************************\n" +
                    "BIENVENIDO\n"+
                    "Por favor Selecciona una de las siguiente OPCIONES para la conversion de divisas:\n" +
                    "1.Dólar(USD) -> Peso Argentino(ARS)\n"+
                    "2.Peso Argentino(ARS) ->  Dólar(USD)\n"+
                    "3.Dólar(USD) -> Real Brasileño(BRL)\n"+
                    "4.Real Brasileño(BRL) -> Dólar(USD)\n"+
                    "5.Dólar(USD) -> Peso Colombiano(COP)\n"+
                    "6.Peso Colombiano(COP) -> Dólar(USD)\n"+
                    "7.Salir\n");



            try {

                // Pedimos la cantidad solo una vez
                System.out.println("Opcion: ");
                op=lectura.nextInt();

            } catch (InputMismatchException e) {
                //System.out.println("Opcion no válida. Por favor, ingresa un número del 1 al 7.");
                lectura.next();  // Limpiar el valor no numérico ingresado
                op=0;
            }


            // Determinamos las monedas de origen y destino según la opción seleccionada
            switch (op) {
                case 1:
                    monedaOrigen = "USD";
                    monedaDestino = "ARS";
                    break;
                case 2:
                    monedaOrigen = "ARS";
                    monedaDestino = "USD";
                    break;
                case 3:
                    monedaOrigen = "USD";
                    monedaDestino = "BRL";
                    break;
                case 4:
                    monedaOrigen = "BRL";
                    monedaDestino = "USD";
                    break;
                case 5:
                    monedaOrigen = "USD";
                    monedaDestino = "COP";
                    break;
                case 6:
                    monedaOrigen = "COP";
                    monedaDestino = "USD";
                    break;

                case 7:
                    System.out.println("Saliendo....");
                    break;

                default:
                    System.out.println("Opcion no válida. Por favor, ingresa un número del 1 al 7.");
                    continue; // Saltamos la iteración si la opción no es válida
            }

            if(op>0 && op<7){

                try {

                    // Pedimos la cantidad solo una vez
                    System.out.print("Ingresa la cantidad: ");
                    cantidadP = lectura.nextDouble();

                    // Creamos el objeto ConversionDeDivisas una vez por ciclo
                    ConversionDeDivisas convertir = new ConversionDeDivisas(monedaOrigen, monedaDestino, cantidadP);

                    // Mostramos el resultado de la conversión
                    System.out.println("Cantidad convertida: " + convertir.getCantidadConvertida());

                } catch (InputMismatchException e) {
                    System.out.println("Entrada no válida. Por favor, ingresa una cantidad correcta.");
                    lectura.next();  // Limpiar el valor no numérico ingresado
                }


            }


        }

    }
}
