package ntu.vinh.b5_b6_truyendoituongvatruyendanhsangview.models;

public class SinhVien {

    private String maSo;
    private String hoTen;
    private String email;
    private int namSinh;

    public SinhVien() {
    }

    public SinhVien(String maSo, String hoTen, String email, int namSinh) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.email = email;
        this.namSinh = namSinh;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
}