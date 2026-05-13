package ntu.vinh.demotintuc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "loai_tin_tuc")
public class LoaiTinTuc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_loai", nullable = false, length = 100)
    private String tenLoai;

    @Column(name = "mo_ta", length = 255)
    private String moTa;

    @JsonIgnore
    @OneToMany(mappedBy = "loaiTinTuc", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TinTuc> danhSachTinTuc = new ArrayList<>();
}
