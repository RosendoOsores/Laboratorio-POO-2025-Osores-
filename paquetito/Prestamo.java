package paquetito;

public class Prestamo  {
		
	
	private String fechaInicio;
	private String fechaLimite;

	
	public Prestamo(String  fechaInicio, int diasRetraso, String  fechaLimite ) {
		
		this.fechaInicio = fechaInicio;
		this. fechaLimite =  fechaLimite;
	
		
	}
	
	public void calcularMulta(int diasRetraso) {
		System.out.println("La multa es igual a" + diasRetraso);
	}
}
