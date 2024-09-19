import java.util.Scanner;

public class DesafioAppbanco {

    public static void main(String[] args) {

    //Variables
        String nombre = "Tony Stark";
        String cuenta = "Corriente";
        double saldo = 1599.99;
        int usuario = 0;

    //datos del cliente
        System.out.println();
        System.out.println("Nombre del cliente:" + nombre);
        System.out.println("Tipo de cuenta:" + cuenta) ;
        System.out.println("Saldo disponible: " + saldo + "$");
        System.out.println();

    // opciones del usuario
        String operaciones = """ 
                    *************************************************
                    ** Escriba el número de la opción deseada **
                    1 - Consultar saldo
                    2 - Retirar
                    3 - Depositar
                    9 - Salir
                    """;



   // todo el funcionamiento de la app
        Scanner opcionUsuario = new Scanner(System.in);
        while (usuario != 9) {
            System.out.println(operaciones);
            usuario = opcionUsuario.nextInt();

            switch (usuario) {
                case 1:
                    System.out.println();
                    System.out.println("El saldo actualizado es " + saldo + "$");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Cual es el valor que deseas reitrar?");
                    double valoraRetirar = opcionUsuario.nextDouble();

                    if (valoraRetirar > saldo) {
                        System.out.println("Fondos insuficientes");
                } else {
                        saldo = saldo - valoraRetirar;
                        System.out.println("Saldo actual es:" + saldo + "$");
                    }
                    break;

                case 3:
                    System.out.println("Cual es el valor que deseas depositar?");
                    double deposito = opcionUsuario.nextDouble();

                    saldo += deposito;
                    System.out.println("Saldo actual es:" + saldo + "$");
                    break;

                case 9:
                    System.out.println("Finalizado el programa. Muchas gracias por usar nuestros sevicios");
                    break;

                default:
                    System.out.println("La opcion que seleccionaste no es valida");
                    break;

            }





        }

    }




}











