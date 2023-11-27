package comspringmvc.demo;
import org.springframework.web.bind.annotation.RequestMapping;
public class Homecontroller {
    @RequestMapping("/")
    public String index()
    
    {
        System.out.println("resert1 application1");
        return "index.html";
    }
    @RequestMapping("/about")
    public String about()
    {
        return "about.html";
    }
    @RequestMapping("/product")
    public String product()
    {
        return "product.html";
    }
}


