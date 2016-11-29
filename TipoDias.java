import java.util.Scanner;
public class TipoDias {
	public static void main(String[] args){
		
		//nos pide un dia y nosotros se lo pasamos y se guarda el texto en dia que mas tarde esta variable se utilizara en el switch
		System.out.println("¿Qué día de la semana es hoy?: ");
		Scanner in = new Scanner (System.in);
		String dia = in.next().toLowerCase();
        in.close();
        
        switch(dia){
			//dependiendo del dia que escribas se le asocia un texto
			case "lunes":
				System.out.println("Es laboral");
				break;
			case "martes":
				System.out.println("Es laboral");
				break;
			case "miercoles":
				System.out.println("Es laboral");
				break;
			case "jueves":
				System.out.println("Es laboral");
				break;
			case "viernes":
				System.out.println("Es laboral");
				break;
			case "sabado":
				System.out.println("No es laboral");
				break;
			case "domingo":
				System.out.println("No es laboral");
				break;
				//si no escribes las palabras antes establecidas, escribe no es un dia
			default:
				System.out.println("No es un día");
				break;
		} 
	}
}	
