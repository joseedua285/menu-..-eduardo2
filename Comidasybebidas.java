package Menu;

import java.util.Scanner;

public class Comidasybebidas {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	byte opMax = 1;
	byte opPlatillo, opPlatillo2;
	float total = 0;
	String pedido = "" ;
	
	
	do{
		
	System.out.println("\tRESTAURANTE DOS CARNALES\n");
	System.out.println("    menu:\r\n"
			+ "1- entradas\r\n"
			+ "        -dedos de queso $40\r\n"
			+ "        -guacamole $34\r\n"
			+ "        -papas a la francesa $45\r\n"
			+ "    \r\n"
			+ "2- sopas\r\n"
			+ "        -verduras $35\r\n"
			+ "        -fideos $35\r\n"
			+ "        -letras $35\r\n"
			+ "    \r\n"
			+ "3- plato fuerte\r\n"
			+ "        -pechuga de pollo empanizada $45\r\n"
			+ "        -hamburguesa de carne de res $54\r\n"
			+ "        -ensalada $60\r\n"
			+ "    \r\n"
			+ "4- postres $20\r\n"
			+ "        -helado (vainilla/chocolate/fresa) \r\n"
			+ "        -flan napolitano \r\n"
			+ "        -fresas con crema \r\n"
			+ "        -platanos fritos \r\n"
			+ "    \r\n"
			+ "5- bebidas\r\n"
			+ "        -limonada $30\r\n"
			+ "        -naranjada $30\r\n"
			+ "        -cerveza $45\r\n"
			+ "        -malteada $30\r\n"
			+ "        -refresco $30\r\n"
			+ "    \r\n"
			+ "6-terminar pedido\r\n"
			+ "        -efectivo\r\n"
			+ "        -tarjeta");
	
	System.out.print("Opcion de platillo: "); opPlatillo = sc.nextByte();
	
	
	switch( opPlatillo){
	case 1:
		System.out.println("\n1- dedos de queso $40\r\n"
				+ "2- guacamole $34\r\n"
				+ "3- papas a la francesa $45");
		
		System.out.print("ENTRADAS: "); opPlatillo2 = sc.nextByte();
		
		if( opPlatillo2== 1 ){
			pedido += " dedos de queso\n ";
			total += 40;
		}else if( opPlatillo2 == 2){
			pedido += " guacamole\n ";
			total += 34;
		}else if( opPlatillo2 == 3){
			pedido += " papas a la francesa\n ";
			total += 45;
		}
		
		break;
		
	case 2 :
		System.out.println("\n1- verduras $35\r\n"
				+ "2-fideos $35\r\n"
				+ "-letras $35");
		
		System.out.print("SOPAS: "); opPlatillo2 = sc.nextByte();
		
		if( opPlatillo2 == 1 ) {
			pedido += "sopa de verdura";
		}else if( opPlatillo2 == 2 ) {
			pedido += "sopa de fideos";
		}else if( opPlatillo2 == 3 ) {
			pedido += "sopa de letras";
		}
		
		total += 35;
		
		break;
		
	case 3:
		System.out.println("\n1- pechuga de pollo empanizada $45\r\n"
				+ "2-hamburguesa de carne de res $54\r\n"
				+ "3-ensalada $60");
		
		System.out.print("PLATO FUERTE: "); opPlatillo2 = sc.nextByte();
		
		if( opPlatillo2 == 1 ){
			pedido += " pechuga de pollo empanizada\n ";
			total += 45;
		}else if( opPlatillo2 == 2){
			pedido += " hamburguesa de carne de res\n ";
			total += 54;
		}else if( opPlatillo2 == 3){
			pedido += " ensalada\n ";
			total += 60;
		}
		
		break;
		
		
	case 4 :
		System.out.println("\n1-helado (vainilla/chocolate/fresa) \r\n"
				+ "2-flan napolitano \r\n"
				+ "3-fresas\n con crema \r\n"
				+ "4-platanos fritos ");
		
		System.out.print("POSTRE: "); opPlatillo2 = sc.nextByte();
		
		if( opPlatillo2 == 1 ) {
			pedido += " helado\n ";
		}else if ( opPlatillo2 == 2 ) {
			pedido += " flan napolitano\n ";
		}else if ( opPlatillo2 == 3 ) {
			pedido += " fresas\\n con crema\n ";
		}else if ( opPlatillo2 == 4 ) {
			pedido += " platanos fritos \n ";
		}
		
		total += 20;
		
		
		break;
		
		
	case 5 :
		System.out.println("\n1-limonada $30\r\n"
				+ "2-naranjada $30\r\n"
				+ "3-cerveza $45\r\n"
				+ "4-malteada $30\r\n"
				+ "5-refresco $30");
		
		System.out.print("BEBIDAS: "); opPlatillo2 = sc.nextByte();
		
		if( opPlatillo2 == 1 || opPlatillo == 2|| opPlatillo2 == 4 || opPlatillo2 == 5 ) {
			switch(opPlatillo2) {
			case 1 :
				pedido += "limonada\n";
				break;
			
			case 2 :
				pedido += "naranjada\n";
				break;
				
			case 4 :
				pedido += "malteada";
				break;
				
			case 5 :
				pedido += "refresco";
				break;
			}
			
			
			total += 30;
		}else if ( opPlatillo2 == 3 ) {
			pedido += "cerveza\n";
			total += 45;
		}
		
		break;
		
	case 6 :
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println("pedido");
		System.out.println("El total del pedido es: $"+total);
		break;
		
			
			}
	
	}while( opPlatillo != 6 );

	}

}
