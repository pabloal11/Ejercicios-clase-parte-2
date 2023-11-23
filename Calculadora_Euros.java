import java.util.Scanner;

public class Calculadora_Euros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una cantidad en pesetas");
		float num1= teclado.nextFloat();
		if (num1>0) {
			System.out.printf("Serian: %f",(num1/166.386) );}
		else {
			System.out.printf("error " );}
		
	}

}
