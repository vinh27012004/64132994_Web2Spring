package ntu.vinh.demotintuc.service;

import ntu.vinh.demotintuc.model.LoaiTinTuc;

import java.util.List;

public interface LoaiTinTucService {
    List<LoaiTinTuc> findAll();
    LoaiTinTuc findById(Integer id);
    LoaiTinTuc save(LoaiTinTuc loaiTinTuc);
    void deleteById(Integer id);
}
