import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dato1 = 0;
		int dato2 = 0;
		int operacion = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		
		while(operacion < 6) {
			System.out.println("\n\tCALCULADORA BASICA");
			System.out.println("Digite el primer número");
			dato1 = teclado.nextInt();
			
			System.out.println("Digite el segundo número");
			dato2 = teclado.nextInt();
			
			menu();
			operacion = teclado.nextInt();
			/*
			if(operacion == 1) {
				suma(dato1, dato2);
			}
			if(operacion == 2) {
				System.out.println("La resta es: " + resta(dato1, dato2));
			}
			if(operacion == 3) {
				System.out.println("La división es: " + division(dato1, dato2));
			}
			if(operacion == 4) {
				System.out.println("La multiplicación es: " + multiplicacion(dato1, dato2));
			}
			if(operacion == 5) {
				suma(dato1, dato2);
				System.out.println("La resta es: " + resta(dato1, dato2));
				System.out.println("La división es: " + division(dato1, dato2));
				System.out.println("La multiplicación es: " + multiplicacion(dato1, dato2));
			}
			*/
			switch(operacion) {
			case 1:
				suma(dato1, dato2);
				break;
			case 2:
				System.out.println("La resta es: " + resta(dato1, dato2));
				break;
			case 3:
				System.out.println("La división es: " + division(dato1, dato2));
				break;
			case 4:
				System.out.println("La multiplicación es: " + multiplicacion(dato1, dato2));
				break;
			case 5:
				suma(dato1, dato2);
				System.out.println("La resta es: " + resta(dato1, dato2));
				System.out.println("La división es: " + division(dato1, dato2));
				System.out.println("La multiplicación es: " + multiplicacion(dato1, dato2));
				break;			
			}
		}
		
	}
	
	public static void menu() {
		System.out.println("Seleccione la operacion que desea:");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. División");
		System.out.println("4. Multiplicación");
		System.out.println("5. Todas las operaciones");
		System.out.println("6. Salir");
	}
	
	public static void suma(int a, int b) {
		int resultado;
		resultado = a + b;
		System.out.println("La suma es: " + resultado);
	}
	
	public static int resta(int x, int y) {
		int resultado;
		resultado = x - y;
		return resultado;
	}
	
	public static float division(int a, int b) {
		float resultado;
		resultado = (float) a / (float) b;
		return resultado;
	}
	
	public static int multiplicacion(int dato1, int dato2) {
		int resultado;
		resultado = dato1 * dato2;
		return resultado;
	}
	
}