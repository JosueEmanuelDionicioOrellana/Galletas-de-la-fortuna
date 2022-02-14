
public class Diseño {


	public void techo() {
		System.out.println("+================================================================================================+");
	}
	
	public void pared() {
		System.out.println("|                                                                                                |");
	}
	
	
	public void titulo(Mensaje mensaje) {
		System.out.println("|                                           "+mensaje.getTitulo()+"	");	
	}
	
	public void contenido(Mensaje mensaje) {
		System.out.println("| "+mensaje.getContenido()+"");
	}
}
