package paquetito;

public class material {
	
	private String titulo;
	private String autor;
	private int año_publicacion;
	
	public material(String titulo, String autor, int año_publicacion) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.año_publicacion = año_publicacion ;
	}
	public void mostrarInfo() {

		System.out.println("Titulo:"+titulo+"/ Autor"+autor+"/Año publicacion"+año_publicacion);
		
	}

}
