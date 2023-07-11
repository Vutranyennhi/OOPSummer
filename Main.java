package Module3;

		import java.util.ArrayList;

		public class Main {
		public static void main(String[] args) {
			
			ArrayList<Chuyenxe> listChuyenxe= new ArrayList<>();
			double tongDoanhThuXeNoiThanh=0;
			double tongDoanhThuXeNgoaiThanh=0;
			double tongDoanhThuTatCaCacLoaiXe=0;
			Chuyenxe ChuyenxeNgoaithanh1= new ChuyenxeNgoaithanh("123","Vũ Văn Minh","A001",3000,"Nha trang",3);
			Chuyenxe ChuyenxeNoithanh1 = new ChuyenxeNoithanh("345","Vũ Văn An","12ry",40000,20,30);
			
			listChuyenxe.add(ChuyenxeNoithanh1);
			listChuyenxe.add(ChuyenxeNgoaithanh1);
			
			for(Chuyenxe chuyenXe : listChuyenxe) {
		        tongDoanhThuTatCaCacLoaiXe += chuyenXe.tinhDoanhThu();

		        if (chuyenXe instanceof ChuyenxeNoithanh) {
		            tongDoanhThuXeNoiThanh += chuyenXe.tinhDoanhThu();
		        } else if (chuyenXe instanceof ChuyenxeNgoaithanh) {
		            tongDoanhThuXeNgoaiThanh += chuyenXe.tinhDoanhThu();
		        }
		    }
			System.out.println(listChuyenxe);
		    System.out.println("Tổng doanh thu của tất cả các chuyến xe: " + tongDoanhThuTatCaCacLoaiXe);
		    System.out.println("Tổng doanh thu của chuyến xe ngoại thành: " + tongDoanhThuXeNgoaiThanh);
		    System.out.println("Tổng doanh thu của chuyến xe nội thành: " + tongDoanhThuXeNoiThanh);
			
		}
		}