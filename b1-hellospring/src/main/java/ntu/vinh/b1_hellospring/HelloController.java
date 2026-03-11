package ntu.vinh.b1_hellospring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping({"/", "/hello"})
    public String hello(@RequestParam(defaultValue = "Spring Boot") String name, Model model) {
        model.addAttribute("title", "Ví dụ Hello Spring Boot");
        model.addAttribute("message", "Xin chào, " + name + "!");
        model.addAttribute("description", "Ứng dụng Spring Boot đầu tiên dùng Controller + Thymeleaf.");
        return "hello";
    }
}
