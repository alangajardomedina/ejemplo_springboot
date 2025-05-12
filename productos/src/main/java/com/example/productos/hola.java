@RestController
public class ejemplo{

    @GetMapping("/")
    public String hola(){
        return "holap :D";
    }
}