import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/pokemon")
public class PokeControlador {

    @Autowired
    private RestTemplate restTemplate;

    private static final String POKEAPI_URL = "https://pokeapi.co/api/v2/pokemon/";

    @GetMapping("/{nombre}")
    public String obtenerInfoPokemon(@PathVariable String nombre) {
        
        String url = POKEAPI_URL + nombre.toLowerCase();

        
        String respuestaJson = restTemplate.getForObject(url, String.class);

        
        return respuestaJson;
    }
}