package ntu.vinh.demotintuc.controller;

import lombok.RequiredArgsConstructor;
import ntu.vinh.demotintuc.model.LoaiTinTuc;
import ntu.vinh.demotintuc.model.TinTuc;
import ntu.vinh.demotintuc.service.LoaiTinTucService;
import ntu.vinh.demotintuc.service.TinTucService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final TinTucService tinTucService;
    private final LoaiTinTucService loaiTinTucService;

    // ===== DASHBOARD =====
    @GetMapping({"", "/"})
    public String dashboard(Model model) {
        model.addAttribute("soLuongTinTuc", tinTucService.findAll().size());
        model.addAttribute("soLuongLoai", loaiTinTucService.findAll().size());
        return "admin/index";
    }

    // ===== LOAI TIN TUC =====
    @GetMapping("/loaitintuc")
    public String danhSachLoai(Model model) {
        model.addAttribute("danhSachLoai", loaiTinTucService.findAll());
        return "admin/loaitintuc/list";
    }

    @GetMapping("/loaitintuc/them")
    public String themLoaiForm(Model model) {
        model.addAttribute("loaiTinTuc", new LoaiTinTuc());
        return "admin/loaitintuc/form";
    }

    @PostMapping("/loaitintuc/luu")
    public String luuLoai(@ModelAttribute LoaiTinTuc loaiTinTuc) {
        loaiTinTucService.save(loaiTinTuc);
        return "redirect:/admin/loaitintuc";
    }

    @GetMapping("/loaitintuc/sua/{id}")
    public String suaLoaiForm(@PathVariable Integer id, Model model) {
        model.addAttribute("loaiTinTuc", loaiTinTucService.findById(id));
        return "admin/loaitintuc/form";
    }

    @GetMapping("/loaitintuc/xoa/{id}")
    public String xoaLoai(@PathVariable Integer id) {
        loaiTinTucService.deleteById(id);
        return "redirect:/admin/loaitintuc";
    }

    // ===== TIN TUC =====
    @GetMapping("/tintuc")
    public String danhSachTinTuc(Model model) {
        model.addAttribute("danhSachTinTuc", tinTucService.findAll());
        return "admin/tintuc/list";
    }

    @GetMapping("/tintuc/them")
    public String themTinTucForm(Model model) {
        model.addAttribute("tinTuc", new TinTuc());
        model.addAttribute("danhSachLoai", loaiTinTucService.findAll());
        return "admin/tintuc/form";
    }

    @PostMapping("/tintuc/luu")
    public String luuTinTuc(@ModelAttribute TinTuc tinTuc,
                             @RequestParam(required = false) Integer loaiId) {
        if (loaiId != null) {
            tinTuc.setLoaiTinTuc(loaiTinTucService.findById(loaiId));
        }
        tinTucService.save(tinTuc);
        return "redirect:/admin/tintuc";
    }

    @GetMapping("/tintuc/sua/{id}")
    public String suaTinTucForm(@PathVariable Integer id, Model model) {
        model.addAttribute("tinTuc", tinTucService.findById(id));
        model.addAttribute("danhSachLoai", loaiTinTucService.findAll());
        return "admin/tintuc/form";
    }

    @GetMapping("/tintuc/xoa/{id}")
    public String xoaTinTuc(@PathVariable Integer id) {
        tinTucService.deleteById(id);
        return "redirect:/admin/tintuc";
    }
}
