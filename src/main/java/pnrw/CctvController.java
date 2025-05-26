package pnrw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CctvController {
    @GetMapping("/cctv")
    public String cctvView() {
        return "CCTV"; // Looks for Profile.html in templates
    }
}
