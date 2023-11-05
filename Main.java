import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double valoPi = 3.1415;

        System.out.println("1) CALCULAR EL ÁREA DE UN TRIANGULO.");
        System.out.println("Ingrese la base del triángulo");
        double base = entrada.nextFloat();
        System.out.println("Ingrese la altura del triángulo");
        double altura = entrada.nextFloat();
        double area = (base * altura) /2;
        System.out.println("El área del triángulo es; "+ area +"<---");

        System.out.println("\n/////////////\n");

        System.out.println("2) INGRESE DOS NÚMEROS POR LA CONSOLA Y SUMARLOS.");
        System.out.println("Ingresa el primer número:");
        double number1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double number2 = entrada.nextDouble();
        double suma = number1 + number2;
        System.out.println("La suma de los dos números es: "+suma+" <----");

        System.out.println("\n/////////////\n");

        System.out.println("3)Ingrese un numero y visualizar el número elevado al cuadrado");
        System.out.println("ingrese el número");
        double num1 = entrada.nextDouble();
        double cuadrado = num1 * num1;
        System.out.println("El número al cuadrado es " +cuadrado);

        System.out.println("\n/////////////\n");

        System.out.println("4)Escribir un programa que convierta de euros a dólares ");
        double euro = entrada.nextDouble();

        double dólar = 1.07;

        double cambio = euro*dólar;

        System.out.println("EL VALOR DE CAMBIO A DÓLARES ES " +cambio);

        System.out.println("\n/////////////\n");

        System.out.println("5)CALCULE EL ÁREA Y EL PERIMETRO DE UN CUADRADO");
        System.out.println("INGRESE UN LADO DEL CUADRADO") ;
        double lado = entrada.nextDouble();

        double área1 = lado * lado;
        double perimetro = lado + lado + lado + lado;

        System.out.println("EL ÁREA DE UN CUADRADO ES: " + área1);
        System.out.println("EL PERIMETRO DEL CUADRADO ES: " + perimetro);

        System.out.println("\n/////////////\n");

        System.out.println("6)CALCULE EL ÁREA Y VOLUMEN DE UN CILINDRO");

        System.out.println("ingrese base de cilindro");
        double basecilindro = entrada.nextDouble();
        System.out.println("ingrese altura de cilindro");
        double alturacilindro = entrada.nextDouble();

        double areacilindro = 2*3.1416*basecilindro*(basecilindro+alturacilindro);
        double volumencilindro = 3.1416*(basecilindro*basecilindro)*alturacilindro;

        System.out.println("El área del cilindro es: " +areacilindro+"cm²");
        System.out.println("El volumen del circulo es: "+volumencilindro);

        System.out.println("\n/////////////\n");

        System.out.println("7)ESCRIBIR UN PROGRAMA QUE LEA EL RADIO DE UNA CIRCUNFERENCIA Y CALCULE LA LONGITUD DE LA MISMA Y EL ÁREA DEL CIRCULO INSCRITO");


        System.out.println("Ingrese el radio de una circunferencia");
        double radio = entrada.nextDouble();


        double longitud = 2 * 3.1416 * radio;
        double area4 = 3.1416 * (radio * radio);

        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área de la circunferencia es: " + area4);


        System.out.println("\n/////////////\n");


        System.out.println("8)CALCULAR EL PROMEDIO DE TRES NUMEROS INGRESADOS POR TECLADO ");

        System.out.println("Ingrese el primer número");
        double numero1 = entrada.nextDouble();

        System.out.println("Ingrese el segundo número");
        double numero2 = entrada.nextDouble();

        System.out.println("Ingrese el tercer número");
        double numero3 = entrada.nextDouble();

        double promedio = (numero1 + numero2 + numero3) / 3;

        System.out.println("El promedio es: " + promedio );

        System.out.println("\n/////////////\n");

    }
}

