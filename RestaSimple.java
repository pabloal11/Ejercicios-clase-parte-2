 import java.util.Scanner;

public class RestaSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un n�mero");
		long num1= teclado.nextLong();
		System.out.println("Introduce otro n�mero");
		long num2= teclado.nextLong();
		if(num1>num2)
			System.out.printf("El resultado es :%d", (num1-num2));
		else if (num2>num1) System.out.printf("Los n�meros son:%d", (num2-num1));
		
	}

}
