import java.util.Scanner;

public class HorarioExtraescolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un d�a de la semana");
		String dia= teclado.nextLine();
		switch(dia) {
		case"lunes": System.out.println("Psicomotricidad");
					break;
		case"martes":
		case "jueves": System.out.println("Nataci�n");
					break;
		case "mi�rcoles":  System.out.println("M�sica");
					break;
		case "viernes":  System.out.println("Descanso");
					break;
		case "s�bado":  
		case "dsomingo": System.out.println("\033[31mDia sin actividades");
		 				System.out.println("\u001B[0m");
		 				break;
		default: System.out.println("D�a erroneo");
		}
	}

}
