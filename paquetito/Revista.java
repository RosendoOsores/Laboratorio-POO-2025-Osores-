package paquetito;

public class Revista extends material {
		
	private String categoria;
	
	
	public Revista(String titulo,String autor,int año_publicacion,String categoria) {
		super(titulo,autor,año_publicacion);
		this.categoria = categoria;
	}
	
	
	@Override
	public void mostrarInfo() {
		
		System.out.println("El isbn del libro es:"+ categoria);
		
		
		
		
	}
	
	
}


