package ntu.vinh.b4_bmicaculator.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BmiController {

    @GetMapping({"/", "/bmi"})
    public String showForm(Model model) {
        model.addAttribute("heightCm", 170.0);
        model.addAttribute("weightKg", 65.0);
        return "bmi";
    }

    @PostMapping("/bmi")
    public String calculate(
            @RequestParam("heightCm") double heightCm,
            @RequestParam("weightKg") double weightKg,
            Model model) {

        model.addAttribute("heightCm", heightCm);
        model.addAttribute("weightKg", weightKg);

        if (heightCm <= 0 || weightKg <= 0) {
            model.addAttribute("error", "Chieu cao va can nang phai lon hon 0.");
            return "bmi";
        }

        if (heightCm < 100 || heightCm > 250 || weightKg < 20 || weightKg > 300) {
            model.addAttribute("error", "Vui long nhap trong khoang hop ly: cao 100-250 cm, nang 20-300 kg.");
            return "bmi";
        }

        double heightMeter = heightCm / 100.0;
        double bmi = weightKg / (heightMeter * heightMeter);

        model.addAttribute("bmi", String.format(Locale.US, "%.1f", bmi));
        model.addAttribute("category", categoryOf(bmi));
        model.addAttribute("advice", adviceFor(bmi));
        model.addAttribute("resultClass", classFor(bmi));

        return "bmi";
    }

    private String categoryOf(double bmi) {
        if (bmi < 18.5) {
            return "Gay";
        }
        if (bmi < 25) {
            return "Binh thuong";
        }
        if (bmi < 30) {
            return "Thua can";
        }
        return "Beo phi";
    }

    private String adviceFor(double bmi) {
        if (bmi < 18.5) {
            return "Ban nen bo sung dinh duong va tap luyen de tang can khoe manh.";
        }
        if (bmi < 25) {
            return "Rat tot. Hay duy tri che do an uong can bang va van dong deu dan.";
        }
        if (bmi < 30) {
            return "Can giam nhe calo va tang muc do hoat dong the chat.";
        }
        return "Nen tham khao bac si/chuyen gia dinh duong de co lo trinh giam can an toan.";
    }

    private String classFor(double bmi) {
        if (bmi < 18.5) {
            return "underweight";
        }
        if (bmi < 25) {
            return "normal";
        }
        if (bmi < 30) {
            return "overweight";
        }
        return "obese";
    }
}
