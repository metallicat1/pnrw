package pnrw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SatelliteController {
    @GetMapping("/satellite")
    public String showSatellite() {
        return "Satellite";
    }
}
