package ntu.vinh.demotintuc.repository;

import ntu.vinh.demotintuc.model.LoaiTinTuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiTinTucRepository extends JpaRepository<LoaiTinTuc, Integer> {
}
