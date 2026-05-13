package ntu.vinh.demotintuc.service.impl;

import lombok.RequiredArgsConstructor;
import ntu.vinh.demotintuc.model.LoaiTinTuc;
import ntu.vinh.demotintuc.repository.LoaiTinTucRepository;
import ntu.vinh.demotintuc.service.LoaiTinTucService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoaiTinTucServiceImpl implements LoaiTinTucService {

    private final LoaiTinTucRepository loaiTinTucRepository;

    @Override
    @Transactional(readOnly = true)
    public List<LoaiTinTuc> findAll() {
        return loaiTinTucRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public LoaiTinTuc findById(Integer id) {
        return loaiTinTucRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy loại tin tức id: " + id));
    }

    @Override
    @Transactional
    public LoaiTinTuc save(LoaiTinTuc loaiTinTuc) {
        return loaiTinTucRepository.save(loaiTinTuc);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        loaiTinTucRepository.deleteById(id);
    }
}
