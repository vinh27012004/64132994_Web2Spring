package thigk.ntu64132994.phamnguyentrivinh_fitcms.controllers;
import thigk.ntu64132994.phamnguyentrivinh_fitcms.models.Page;
import thigk.ntu64132994.phamnguyentrivinh_fitcms.services.PageService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/page")
public class ApiPageController {

    @Autowired
    private PageService pageService;
    @GetMapping("/all")
    public List<Page> getAllPages() {
        List<Page> dsTrang = new ArrayList<Page>();
        dsTrang = pageService.getAllPages();
        return dsTrang;
    }
    @GetMapping("/{id}")
    public Page getPageById(@PathVariable("id") int id) {
        return pageService.getPageById(id);
    }
}
