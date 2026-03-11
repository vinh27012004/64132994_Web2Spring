package ntu.vinh.b2_truyendulieusangview;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinhVienController {

    @GetMapping("/")
    public String hienThiThongTinSinhVien(Model model) {
        model.addAttribute("mssv", "64132994");
        model.addAttribute("hoTenSv", "Phạm Nguyễn Trí Vinh");
        model.addAttribute("namSinh", 2004);
        model.addAttribute("gioiTinh", "Nam");
        return "sinhvien";
    }
}
