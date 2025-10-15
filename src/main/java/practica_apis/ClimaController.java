package practica_apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClimaController {

    @Autowired 
    private RestTemplate restTemplate; 

    @GetMapping("/clima") 
    public ClimaResponse getClima(@RequestParam(name = "ciudad") String ciudad) {

        double temperaturaObtenida;
        
        // Lógica de simulación de API externa (se usa para definir la temperatura)
        if (ciudad.toLowerCase().contains("frio") || ciudad.toLowerCase().contains("oslo")) {
            temperaturaObtenida = 8.5; 
        } else if (ciudad.toLowerCase().contains("calor") || ciudad.toLowerCase().contains("dubai")) {
            temperaturaObtenida = 32.0; 
        } else if (ciudad.toLowerCase().contains("error") || ciudad.toLowerCase().contains("falla")) {
             return new ClimaResponse("No se pudo obtener información del clima para " + ciudad);
        }
        else {
            temperaturaObtenida = 19.3; 
        }

        ClimaResponse respuesta = new ClimaResponse();
        respuesta.setCiudad(ciudad);
        respuesta.setTemperatura(temperaturaObtenida);
        
        String estado;
        
        if (temperaturaObtenida < 10) {
            estado = "frío";
        } else if (temperaturaObtenida >= 10 && temperaturaObtenida <= 25) {
            estado = "templado";
        } else {
            estado = "caluroso";
        }
        
        respuesta.setEstado(estado);
        
        return respuesta;
    }
}