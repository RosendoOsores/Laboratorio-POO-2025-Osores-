package paquetito;

public class libro extends material {
	private int ISBN;
	
	
	public libro(String titulo,String autor,int año_publicacion,int ISBN) {
		super(titulo,autor,año_publicacion);
		this.ISBN = ISBN;
	}
	
	
	@Override
	public void mostrarInfo() {
		
		System.out.println("El isbn del libro es:"+ISBN);
		
		
		
		
	}
	
	
}
