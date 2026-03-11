package thigk.ntu64132994.phamnguyentrivinh_fitcms.contrellers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import 
@Controller
public class DashboardController {

    @GetMapping({"/", "/dashboard"})
    public String dashboard() {
        return "dashboard";
    }
    ArrayList<Page> dsTrang = new ArrayList<Page>();

}
