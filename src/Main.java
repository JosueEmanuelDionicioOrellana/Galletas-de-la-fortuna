import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Dise�o dise�o = new Dise�o();
		
		Random random = new Random();
	
		int numero = random.nextInt(1,7);
		
		
		
		HashMap<Integer,Mensaje> mensajes = new HashMap<Integer,Mensaje>();
		
		mensajes.put(1, new Mensaje("Ama de verdad","Las cosas son bellas si se las ama")); 
		mensajes.put(2, new Mensaje("Se feliz ","La belleza es poder, y una sonrisa es su espada"));
		mensajes.put(3, new Mensaje("Arriesgate","La vida es o una gran aventura o nada"));
		
		
		mensajes.put(4, new Mensaje("Caes mal","Me das repulsi�n, me provocas rencor, no me gustas nada, te quiero lejos de mi vida."));
		mensajes.put(5, new Mensaje("Hipocrita ","Se ve que lo que se lleva es la hipocres�a, y t� eres de los que van a la moda."));
		mensajes.put(6, new Mensaje("con cuidado","Voy a tratarte como a un enemigo� esperar� lo peor de ti."));
		
		
		Mensaje escojido=mensajes.get(numero);
		int seleccion=2;
		
		dise�o.techo();
		System.out.println("|                      GALLETAS DE LA FORTUNA  ");
		dise�o.pared();
		dise�o.pared();
		System.out.println("|puede recibir un mensaje de odio o de amor");
		System.out.println("|Quiere jugar?");
		System.out.println("|    [1]. SI");
		System.out.println("|    [2]. NO");
		Scanner entrada = new Scanner(System.in);
		dise�o.techo();
		seleccion= entrada.nextInt();
			
		if(seleccion==1) {
				
			System.out.println(" ");
			System.out.println(" ");
			dise�o.techo();
			dise�o.pared();
			dise�o.titulo(escojido);
			dise�o.contenido(escojido);
			dise�o.pared();
			dise�o.techo();
				
		}if(seleccion==2) {
		
			System.out.print("adios");
			
		}
	}

}
