package ntu.vinh.b3_laythamsotaicontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/demo")
public class ParamDemoController {

    @GetMapping("/hello/{name}")
    public String getByPathVariable(@PathVariable String name) {
        return "Xin chao " + name + " (lay bang @PathVariable)";
    }

    @GetMapping("/sum")
    public String getByRequestParam(
            @RequestParam(defaultValue = "0") int a,
            @RequestParam(defaultValue = "0") int b) {
        return "Tong = " + (a + b) + " (lay bang @RequestParam)";
    }

    @PostMapping("/login")
    public String postByFormParam(
            @RequestParam String username,
            @RequestParam String password) {
        return "Nhan duoc username=" + username + ", password=" + password;
    }
}
