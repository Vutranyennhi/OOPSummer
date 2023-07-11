package Module3;

public class ChuyenxeNgoaithanh extends Chuyenxe{
	private String noiDen;
	private double soNgaydiduoc;
	public ChuyenxeNgoaithanh(String masoChuyen, String hoteTaixe, String soxe, double doanhThu) {
		super(masoChuyen, hoteTaixe, soxe, doanhThu);
	this.noiDen = "";
    this.soNgaydiduoc = 0;}
	
	public ChuyenxeNgoaithanh(String masoChuyen, String hoteTaixe, String soxe, double doanhThu, String noiDen,
			double soNgaydiduoc) {
		super(masoChuyen, hoteTaixe, soxe, doanhThu);
		this.noiDen = noiDen;
		this.soNgaydiduoc = soNgaydiduoc;
	}
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public double getSoNgaydiduoc() {
		return soNgaydiduoc;
	}
	public void setSoNgaydiduoc(double soNgaydiduoc) {
		this.soNgaydiduoc = soNgaydiduoc;
	}
	@Override
	public double tinhDoanhThu() {
		// TODO Auto-generated method stub
		
		return getDoanhThu() * soNgaydiduoc ;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("XeNgoaiThanh=");
		builder.append(super.toString());
		builder.append(", noiDen");
		builder.append(noiDen);
		builder.append(", soNgaydiduoc=");
		builder.append(soNgaydiduoc);
		builder.append("]");
		return builder.toString();
	}
}
	
	
	
