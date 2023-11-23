import java.util.Scanner;

public class HorarioExtraescolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un día de la semana");
		String dia= teclado.nextLine();
		switch(dia) {
		case"lunes": System.out.println("Psicomotricidad");
					break;
		case"martes":
		case "jueves": System.out.println("Natación");
					break;
		case "miércoles":  System.out.println("Música");
					break;
		case "viernes":  System.out.println("Descanso");
					break;
		case "sábado":  
		case "dsomingo": System.out.println("\033[31mDia sin actividades");
		 				System.out.println("\u001B[0m");
		 				break;
		default: System.out.println("Día erroneo");
		}
	}

}
