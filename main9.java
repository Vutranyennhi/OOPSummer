package Bai9;
import java.util.Scanner;

public class main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong cong nhan: ");
        int n = scanner.nextInt();

        DanhSachCongNhan danhSach = new DanhSachCongNhan(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cong nhan thu " + (i + 1) + ":");
            System.out.print("Ma CN: ");
            int maCN = scanner.nextInt();
            System.out.print("Ho: ");
            String Ho = scanner.next();
            System.out.print("Ten: ");
            String Ten = scanner.next();
            System.out.print("So san pham: ");
            int SoSP = scanner.nextInt();

            Congnhan cn = new Congnhan(maCN, Ho, Ten, SoSP);
            danhSach.themCongnhan(cn);
        }

        System.out.println("Danh sach cong nhan vua nhap:");
        danhSach.xuatThongTin();

        System.out.println("So luong cong nhan trong danh sach: " + danhSach.tinhSoLuong());

        System.out.println("Cac cong nhan lam tren 200 san pham:");
        danhSach.xuatThongTinSP200();

        danhSach.sapXepGiamDanTheoSP();
        System.out.println("Danh sach cong nhan da sap xep theo so san pham giam dan:");
        danhSach.xuatThongTin();
    }
}
