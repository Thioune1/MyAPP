package broken;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *
 * @author ahm3dhany
 */
@Controller
public class DefaultController {
    
    @RequestMapping("*")
    public String handleDefault() {
        return "redirect:/sixWordStories";
    }
    
}
