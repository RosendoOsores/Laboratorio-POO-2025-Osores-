package practica_apis;

public class ClimaResponse {

    private String ciudad;
    private double temperatura;
    private String estado;
    private String error; 

    public ClimaResponse() {} 
    
    public ClimaResponse(String error) {
        this.error = error;
    }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
    
    public double getTemperatura() { return temperatura; }
    public void setTemperatura(double temperatura) { this.temperatura = temperatura; }
    
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    
    public String getError() { return error; }
    public void setError(String error) { this.error = error; }
}