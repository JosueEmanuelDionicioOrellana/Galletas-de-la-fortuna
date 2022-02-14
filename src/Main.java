import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Diseño diseño = new Diseño();
		
		Random random = new Random();
	
		int numero = random.nextInt(1,7);
		
		
		
		HashMap<Integer,Mensaje> mensajes = new HashMap<Integer,Mensaje>();
		
		mensajes.put(1, new Mensaje("Ama de verdad","Las cosas son bellas si se las ama")); 
		mensajes.put(2, new Mensaje("Se feliz ","La belleza es poder, y una sonrisa es su espada"));
		mensajes.put(3, new Mensaje("Arriesgate","La vida es o una gran aventura o nada"));
		
		
		mensajes.put(4, new Mensaje("Caes mal","Me das repulsión, me provocas rencor, no me gustas nada, te quiero lejos de mi vida."));
		mensajes.put(5, new Mensaje("Hipocrita ","Se ve que lo que se lleva es la hipocresía, y tú eres de los que van a la moda."));
		mensajes.put(6, new Mensaje("con cuidado","Voy a tratarte como a un enemigo… esperaré lo peor de ti."));
		
		
		Mensaje escojido=mensajes.get(numero);
		int seleccion=2;
		
		diseño.techo();
		System.out.println("|                      GALLETAS DE LA FORTUNA  ");
		diseño.pared();
		diseño.pared();
		System.out.println("|puede recibir un mensaje de odio o de amor");
		System.out.println("|Quiere jugar?");
		System.out.println("|    [1]. SI");
		System.out.println("|    [2]. NO");
		Scanner entrada = new Scanner(System.in);
		diseño.techo();
		seleccion= entrada.nextInt();
			
		if(seleccion==1) {
				
			System.out.println(" ");
			System.out.println(" ");
			diseño.techo();
			diseño.pared();
			diseño.titulo(escojido);
			diseño.contenido(escojido);
			diseño.pared();
			diseño.techo();
				
		}if(seleccion==2) {
		
			System.out.print("adios");
			
		}
	}

}
