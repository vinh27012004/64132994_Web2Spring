package ntu.vinh.demotintuc.service;

import ntu.vinh.demotintuc.model.TinTuc;

import java.util.List;

public interface TinTucService {
    List<TinTuc> findAll();
    TinTuc findById(Integer id);
    TinTuc save(TinTuc tinTuc);
    void deleteById(Integer id);
    List<TinTuc> findByLoaiId(Integer loaiId);
    List<TinTuc> findLatest5();
}
