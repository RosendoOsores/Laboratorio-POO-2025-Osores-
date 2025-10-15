package practica_apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;


@RestController 
public class Controlador {

    
    @GetMapping("/hola") 
    public Map<String, String> holaApi() {
        
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("mensaje", "vegeta777");
        return respuesta; 
    }

  
}