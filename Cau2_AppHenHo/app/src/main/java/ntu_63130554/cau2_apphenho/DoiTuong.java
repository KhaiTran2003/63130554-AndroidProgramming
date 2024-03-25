package ntu_63130554.cau2_apphenho;

public class DoiTuong {
    private String ho;
    private String ten;
    private String sdt;
    private String diaChi;
    private String gioiThieu;
    private int idAvatar;

    public DoiTuong(String ho, String ten, String sdt, String diaChi, String gioiThieu, int idAvatar) {
        this.ho = ho;
        this.ten = ten;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.gioiThieu = gioiThieu;
        this.idAvatar = idAvatar;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiThieu() {
        return gioiThieu;
    }

    public void setGioiThieu(String gioiThieu) {
        this.gioiThieu = gioiThieu;
    }

    public int getIdAvatar() {
        return idAvatar;
    }

    public void setIdAvatar(int idAvatar) {
        this.idAvatar = idAvatar;
    }
}
