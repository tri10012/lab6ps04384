package sample.entity;
// Generated Oct 19, 2016 10:15:15 AM by Hibernate Tools 4.3.1



/**
 * Khachhang generated by hbm2java
 */
public class Khachhang  implements java.io.Serializable {


     private String maKhachHang;
     private String matKhau;
     private String hoVaTen;
     private String email;
     private String dienThoai;

    public Khachhang() {
    }

    public Khachhang(String maKhachHang, String matKhau, String hoVaTen, String email, String dienThoai) {
       this.maKhachHang = maKhachHang;
       this.matKhau = matKhau;
       this.hoVaTen = hoVaTen;
       this.email = email;
       this.dienThoai = dienThoai;
    }
   
    public String getMaKhachHang() {
        return this.maKhachHang;
    }
    
    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }
    public String getMatKhau() {
        return this.matKhau;
    }
    
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    public String getHoVaTen() {
        return this.hoVaTen;
    }
    
    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDienThoai() {
        return this.dienThoai;
    }
    
    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public void insert(String makh, String matkhau, String hovaten, String email, String sodt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}


