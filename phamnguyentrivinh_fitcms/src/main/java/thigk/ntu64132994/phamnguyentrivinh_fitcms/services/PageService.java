package thigk.ntu64132994.phamnguyentrivinh_fitcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thigk.ntu64132994.phamnguyentrivinh_fitcms.models.Page;
import thigk.ntu64132994.phamnguyentrivinh_fitcms.repositories.PageRepository;

@Service
public class PageService {
    @Autowired
    PageRepository pageRepository;
    public List<Page> getAllPages() {
        return pageRepository.findAll();
    }

    public Page getPageById(int id) {
        return pageRepository.findById(id).orElse(null);
    }
}
