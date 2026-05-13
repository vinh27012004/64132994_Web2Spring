package ntu.vinh.demotintuc.repository;

import ntu.vinh.demotintuc.model.TinTuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TinTucRepository extends JpaRepository<TinTuc, Integer> {
    List<TinTuc> findByLoaiTinTucId(Integer loaiId);
    List<TinTuc> findTop5ByOrderByNgayDangDesc();
}
