package ntu.vinh.b5_b6_truyendoituongvatruyendanhsangview.controllers;

import java.util.List;

import ntu.vinh.b5_b6_truyendoituongvatruyendanhsangview.models.SinhVien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TruyenDuLieuController {

    @GetMapping("/")
    public String trangChu() {
        return "index";
    }

    @GetMapping("/bai5")
    public String truyenDoiTuong(Model model) {
        SinhVien sv = new SinhVien("SV001", "Nguyen Van A", "a@ntu.edu.vn", 2004);
        model.addAttribute("sinhVien", sv);
        return "bai5";
    }

    @GetMapping("/bai6")
    public String truyenDanhSach(Model model) {
        List<SinhVien> danhSach = List.of(
                new SinhVien("SV001", "Nguyen Van A", "a@ntu.edu.vn", 2004),
                new SinhVien("SV002", "Tran Thi B", "b@ntu.edu.vn", 2003),
                new SinhVien("SV003", "Le Van C", "c@ntu.edu.vn", 2005)
        );
        model.addAttribute("danhSachSinhVien", danhSach);
        return "bai6";
    }
}