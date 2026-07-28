class TaiKhoanNganHang {
    double soDu;
    static double laiSuat;
}

public class MainApp {   // class chứa main, khác với TaiKhoanNganHang
    public static void main(String[] args) {
        TaiKhoanNganHang taiKhoanNganHang1 = new TaiKhoanNganHang();
        TaiKhoanNganHang taiKhoanNganHang2 = new TaiKhoanNganHang();

        taiKhoanNganHang1.soDu = 1000000;
        taiKhoanNganHang2.soDu = 2000000;
        TaiKhoanNganHang.laiSuat = 0.05;

        System.out.println(taiKhoanNganHang1.soDu);
        System.out.println(taiKhoanNganHang2.soDu);
        System.out.println(TaiKhoanNganHang.laiSuat);
    }
}