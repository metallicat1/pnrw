package pnrw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomePage {
    @GetMapping ("/")
    public String Welcome() {
        return "WelcomePage";
    }
}
