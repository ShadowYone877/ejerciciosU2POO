// Importación de la clase Scanner para leer datos del teclado

import java.util.Scanner;

//Nombre de la clase (UpperCamelCase)
class MainOperacionesPOO {

    // Metodo principal del programa
    public static void main(String[] args) {

        // Creación de un objeto Scanner 
        Scanner sc = new Scanner(System.in);

        OperacionesPOO op1 = new OperacionesPOO();

        // Variable para almacenar la opcion del usuario
        int x;

        // Ciclo para repetir el menu hasta que el usuario elija salir
        do {

            // Menu de opciones
            System.out.println("0: Salir");
            System.out.println("1: Realizar Suma");
            System.out.println("2: Realizar Resta");
            System.out.println("3: Realizar Multiplicacion");
            System.out.println("4: Realizar Division");
            System.out.println("5: Realizar Modulo\n");

            // Ingreso de la opcion del usuario al sistema
            System.out.print("Ingresa el numero correspondiente a la opcion deseada: ");
            // Lectura de la opcion del usuario y almacenamiento en la variable opcion
            x = sc.nextInt();

            // Validacion de la opcion del usuario
            if (x <= 5 && x > 0) {

                // Pedir el primer valor al usuario 
                System.out.print("\nIngresa el primer numero: ");
                // Almacenamiento del primer valor en el objeto op1
                op1.setNum1(sc.nextInt());

                // Pedir el segundo valor al usuario
                System.out.print("\nIngresa el segundo numero: ");
                // Almacenamiento del segundo valor en el objeto op1
                op1.setNum2(sc.nextInt());

                // Operacion a realizar segun la opcion del usuario
                switch (x) {
                    // Casos para cada operacion
                    case 1:
                        // Mostrar el resultado de la suma del primer y segundo numero
                        System.out.println("--------SUMA--------");
                        System.out.println("\n" + op1.getNum1() + " + " + op1.getNum2() + " = " + op1.getSumar() + "\n");

                        break;
                    case 2:
                        // Mostrar el resultado de la resta del primer y segundo numero
                        System.out.println("--------RESTA--------");
                        System.out.println("\n" + op1.getNum1() + " - " + op1.getNum2() + " = " + op1.getRestar() + "\n");

                        break;
                    case 3:
                        // Mostrar el resultado de la multiplicacion del primer y segundo numero
                        System.out.println("--------MULTIPLICACION--------");
                        System.out.println("\n" + op1.getNum1() + " * " + op1.getNum2() + " = " + op1.getMultiplicar() + "\n");

                        break;

                    case 4:
                        // Mostrar el resultado de la division del primer y segundo numero
                        System.out.println("--------DIVISION--------");
                        System.out.println("\n" + op1.getNum1() + " / " + op1.getNum2() + " = " + op1.getDividir() + "\n");

                        break;

                    case 5:
                        // Mostrar el resultado del modulo del primer y segundo numero
                        System.out.println("--------MODULO--------");
                        System.out.println("\n" + op1.getNum1() + " % " + op1.getNum2() + " = " + op1.getModulo() + "\n");

                        break;

                    default:

                        break;
                }
            }
            // Validacion de la opcion del usuario
        } while (x != 0);
    }
}
