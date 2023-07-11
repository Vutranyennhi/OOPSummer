package Module3;

public class ChuyenxeNoithanh extends Chuyenxe {
	private int soTuyen;
	private double soKmdiduoc;
	public ChuyenxeNoithanh(String masoChuyen, String hoteTaixe, String soxe, double doanhThu, int soTuyen,
			double soKmdiduoc) {
		super(masoChuyen, hoteTaixe, soxe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKmdiduoc = soKmdiduoc;
	}
	public ChuyenxeNoithanh(String masoChuyen, String hotenTaixe, String soxe, double doanhThu) {
		super(masoChuyen, hotenTaixe, soxe, doanhThu);
	}
	public int getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}
	public double getSoKmdiduoc() {
		return soKmdiduoc;
	}
	public void setSoKmdiduoc(double soKmdiduoc) {
		this.soKmdiduoc = soKmdiduoc;
	}
	@Override
	public double tinhDoanhThu() {
		// TODO Auto-generated method stub
		return getDoanhThu() * soKmdiduoc;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("XeNoiThanh =");
		builder.append(super.toString());
		builder.append(", soTuyen=");
		builder.append(soTuyen);
		builder.append(", ngayDi=");
		builder.append(soKmdiduoc);
		builder.append("]");
		return builder.toString();
	}
}
	
