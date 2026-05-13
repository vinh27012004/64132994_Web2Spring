package ntu.vinh.demotintuc.controller;

import lombok.RequiredArgsConstructor;
import ntu.vinh.demotintuc.model.LoaiTinTuc;
import ntu.vinh.demotintuc.model.TinTuc;
import ntu.vinh.demotintuc.service.LoaiTinTucService;
import ntu.vinh.demotintuc.service.TinTucService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {

    private final TinTucService tinTucService;
    private final LoaiTinTucService loaiTinTucService;

    // ===== TIN TUC =====
    @GetMapping("/tintuc")
    public List<TinTuc> getAllTinTuc() {
        return tinTucService.findAll();
    }

    @GetMapping("/tintuc/{id}")
    public ResponseEntity<TinTuc> getTinTucById(@PathVariable Integer id) {
        return ResponseEntity.ok(tinTucService.findById(id));
    }

    @PostMapping("/tintuc")
    public ResponseEntity<TinTuc> createTinTuc(@RequestBody TinTuc tinTuc) {
        return ResponseEntity.ok(tinTucService.save(tinTuc));
    }

    @PutMapping("/tintuc/{id}")
    public ResponseEntity<TinTuc> updateTinTuc(@PathVariable Integer id,
                                                @RequestBody TinTuc tinTuc) {
        tinTuc.setId(id);
        return ResponseEntity.ok(tinTucService.save(tinTuc));
    }

    @DeleteMapping("/tintuc/{id}")
    public ResponseEntity<Void> deleteTinTuc(@PathVariable Integer id) {
        tinTucService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    // ===== LOAI TIN TUC =====
    @GetMapping("/loaitintuc")
    public List<LoaiTinTuc> getAllLoaiTinTuc() {
        return loaiTinTucService.findAll();
    }

    @GetMapping("/loaitintuc/{id}")
    public ResponseEntity<LoaiTinTuc> getLoaiTinTucById(@PathVariable Integer id) {
        return ResponseEntity.ok(loaiTinTucService.findById(id));
    }

    @PostMapping("/loaitintuc")
    public ResponseEntity<LoaiTinTuc> createLoaiTinTuc(@RequestBody LoaiTinTuc loaiTinTuc) {
        return ResponseEntity.ok(loaiTinTucService.save(loaiTinTuc));
    }

    @PutMapping("/loaitintuc/{id}")
    public ResponseEntity<LoaiTinTuc> updateLoaiTinTuc(@PathVariable Integer id,
                                                        @RequestBody LoaiTinTuc loaiTinTuc) {
        loaiTinTuc.setId(id);
        return ResponseEntity.ok(loaiTinTucService.save(loaiTinTuc));
    }

    @DeleteMapping("/loaitintuc/{id}")
    public ResponseEntity<Void> deleteLoaiTinTuc(@PathVariable Integer id) {
        loaiTinTucService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
