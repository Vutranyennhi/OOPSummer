package Module3;

public abstract class Chuyenxe {
	private String masoChuyen;
	private String hotenTaixe;
	private String Soxe;
	private double doanhThu;
	public Chuyenxe(String masoChuyen, String hotenTaixe, String soxe, double doanhThu) {
		super();
		this.masoChuyen = masoChuyen;
		this.hotenTaixe = hotenTaixe;
		Soxe = soxe;
		this.doanhThu = doanhThu;
	}
	public Chuyenxe() {
		super();
		this.masoChuyen = "";
        this.hotenTaixe = "";
        this.Soxe = "";
        this.doanhThu = 0;
	}
	public String getMasoChuyen() {
		return masoChuyen;
	}
	public void setMasoChuyen(String masoChuyen) {
		this.masoChuyen = masoChuyen;
	}
	public String getHoteTaixe() {
		return hotenTaixe;
	}
	public void setHoteTaixe(String hoteTaixe) {
		this.hotenTaixe = hoteTaixe;
	}
	public String getSoxe() {
		return Soxe;
	}
	public void setSoxe(String soxe) {
		Soxe = soxe;
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Xe [maSoChuyen=");
		builder.append(getMasoChuyen());
		builder.append(", hoTenTaiXe=");
		builder.append(hotenTaixe);
		builder.append(", soXe=");
		builder.append(getSoxe());
		builder.append(", doanhThu=");
		builder.append(doanhThu);
		builder.append("]");
		return builder.toString();
	}

	public abstract double  tinhDoanhThu();

	}

