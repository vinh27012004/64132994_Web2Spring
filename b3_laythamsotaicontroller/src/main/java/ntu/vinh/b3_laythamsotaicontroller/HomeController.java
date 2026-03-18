package ntu.vinh.b3_laythamsotaicontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Ung dung dang chay. Thu cac duong dan: /demo/hello/Lay, /demo/sum?a=3&b=9";
    }
}
