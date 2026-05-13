package ntu.vinh.demotintuc.controller;

import lombok.RequiredArgsConstructor;
import ntu.vinh.demotintuc.service.LoaiTinTucService;
import ntu.vinh.demotintuc.service.TinTucService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final TinTucService tinTucService;
    private final LoaiTinTucService loaiTinTucService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("danhSachTinMoi", tinTucService.findLatest5());
        model.addAttribute("danhSachLoai", loaiTinTucService.findAll());
        return "index";
    }

    @GetMapping("/tintuc")
    public String danhSachTinTuc(Model model,
                                  @RequestParam(required = false) Integer loaiId) {
        model.addAttribute("danhSachLoai", loaiTinTucService.findAll());
        if (loaiId != null) {
            model.addAttribute("danhSachTinTuc", tinTucService.findByLoaiId(loaiId));
            model.addAttribute("loaiHienTai", loaiTinTucService.findById(loaiId));
        } else {
            model.addAttribute("danhSachTinTuc", tinTucService.findAll());
        }
        return "tintuc/list";
    }

    @GetMapping("/tintuc/{id}")
    public String chiTietTinTuc(@PathVariable Integer id, Model model) {
        model.addAttribute("tinTuc", tinTucService.findById(id));
        model.addAttribute("danhSachLoai", loaiTinTucService.findAll());
        return "tintuc/detail";
    }
}
