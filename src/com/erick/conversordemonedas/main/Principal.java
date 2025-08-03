package com.erick.conversordemonedas.main;

import com.erick.conversordemonedas.servicio.ServicioDeConversion;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServicioDeConversion conversion = new ServicioDeConversion();
        int opcion;
        String seguir;
        String saludo = "Bienvenido al conversor de monedas.";
        String menu = """
                1) Dolar -> Peso Argentino
                2) Peso Argentino -> Dolar
                3) Dolar --> Real Brasileño 
                4) Real Brasileño --> Dolar 
                5) Dolar -> Peso Colombiano 
                6) Peso Colombiano --> Dolar 
                7) Dolar --> Peso Chileno 
                8) Peso Chileno ->> Dolar 
                9) Salir
                Escoja una opcion: \s""";
        String pregunta = "¿Cuánto desea cambiar";

        String preguntaMasConversiones = "¿Desea realizar mas conversiones? " +
                "[Y/N]\n" +
                "Y = Continuar\n" +
                "N = Parar:";

        System.out.println(saludo);


        do {
            System.out.println(menu);
            try{
                opcion = sc.nextInt();
                sc.nextLine();
                if(opcion >= 1 && opcion <=8){
                    switch (opcion) {
                        case 1:
                            procesaOpcionConversion("USD", "ARS", sc, conversion, pregunta);
                            break;
                        case 2:
                            procesaOpcionConversion("ARS", "USD", sc, conversion, pregunta);
                            break;
                        case 3:
                            procesaOpcionConversion("USD", "BRL", sc, conversion, pregunta);
                            break;
                        case 4:
                            procesaOpcionConversion("BRL", "USD", sc, conversion, pregunta);
                            break;
                        case 5:
                            procesaOpcionConversion("USD", "COP", sc, conversion, pregunta);
                            break;
                        case 6:
                            procesaOpcionConversion("COP", "USD", sc, conversion, pregunta);
                            break;
                        case 7:
                            procesaOpcionConversion("USD", "CLP", sc, conversion, pregunta);
                            break;
                        case 8:
                            procesaOpcionConversion("CLP", "USD", sc, conversion, pregunta);
                            break;
                    }while(true){
                        System.out.println(preguntaMasConversiones);
                        seguir = sc.nextLine().toUpperCase();
                        if (seguir.equals("Y") || seguir.equals("N")){
                            break;
                        }else{
                            System.out.println("Opcion invalida. Por favor solo ingrese [Y/N]");
                        }
                    }
//                    do{
//                        System.out.println(preguntaMasConversiones);
//                        seguir = sc.nextLine().toUpperCase();
//                    }while(!seguir.equalsIgnoreCase("N") && !seguir.equalsIgnoreCase("Y"));
                }else if(opcion == 9){
                    seguir = "N";
                }else{
                    System.out.println("Opcion no Valida, Por favor ingrese una de las opciones permitidas.");
                    seguir = "Y";
                }
            }catch(InputMismatchException e){
                System.out.println("Error. Por favor ingrese solamente númerosl.");
                sc.nextLine();
                seguir = "Y";
            }
        }while (seguir.equalsIgnoreCase("Y"));
        System.out.println("Cerrando el programa. ¡Gracias por usar nuestros servicios!");
    }

    private static void procesaOpcionConversion(String monedaOrigen, String monedaDestino,
                                                Scanner sc, ServicioDeConversion conversion,
                                                String pregunta) {


        System.out.println(pregunta + "de " + monedaOrigen + " hacia " + monedaDestino);
        Double cantidad = sc.nextDouble();
        sc.nextLine();
        Double resultadoConversion = conversion.realizarConversion(monedaOrigen, monedaDestino, cantidad);
        String resultadoFormateado = String.format("%.2f", resultadoConversion);

        System.out.println("---------------------------------------------------------");
        System.out.println("Sus " + cantidad + " de " + monedaOrigen + " equivalen a: " + resultadoFormateado + " de " + monedaDestino);
        System.out.println("---------------------------------------------------------");

    }
}



