package models;

public abstract class ConNguoi {
    private String ten;
    private String ngaySinh;
    private String gioiTinh;
    private String soDienThoai;

    public ConNguoi( String ten, String ngaySinh, String gioiTinh, String soDienThoai) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
    }

    public ConNguoi(String[] arrString) {
        this.ten = arrString[1];
        this.ngaySinh = arrString[2];
        this.gioiTinh = arrString[3];
        this.soDienThoai = arrString[4];
    }


    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }


    public abstract String showInfo();

    @Override
    public String toString() {
        return  ',' + ten + ',' + ngaySinh + ',' + gioiTinh + ',' + soDienThoai;
    }
}
