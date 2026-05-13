package ntu.vinh.demotintuc.service.impl;

import lombok.RequiredArgsConstructor;
import ntu.vinh.demotintuc.model.TinTuc;
import ntu.vinh.demotintuc.repository.TinTucRepository;
import ntu.vinh.demotintuc.service.TinTucService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TinTucServiceImpl implements TinTucService {

    private final TinTucRepository tinTucRepository;

    @Override
    @Transactional(readOnly = true)
    public List<TinTuc> findAll() {
        return tinTucRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TinTuc findById(Integer id) {
        return tinTucRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy tin tức id: " + id));
    }

    @Override
    @Transactional
    public TinTuc save(TinTuc tinTuc) {
        if (tinTuc.getId() == null) {
            tinTuc.setNgayDang(LocalDateTime.now());
        }
        return tinTucRepository.save(tinTuc);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        tinTucRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TinTuc> findByLoaiId(Integer loaiId) {
        return tinTucRepository.findByLoaiTinTucId(loaiId);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TinTuc> findLatest5() {
        return tinTucRepository.findTop5ByOrderByNgayDangDesc();
    }
}
