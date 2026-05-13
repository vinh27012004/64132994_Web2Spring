package ntu.vinh.demotintuc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "tin_tuc")
public class TinTuc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tieu_de", nullable = false, length = 255)
    private String tieuDe;

    @Column(name = "tom_tat", length = 500)
    private String tomTat;

    @Column(name = "noi_dung", columnDefinition = "TEXT")
    private String noiDung;

    @Column(name = "hinh_anh", length = 255)
    private String hinhAnh;

    @Column(name = "ngay_dang")
    private LocalDateTime ngayDang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "loai_id")
    private LoaiTinTuc loaiTinTuc;
}
