
public class Xe {
	private int id;
	private String chuXe;
	private String loaiXe;
	private double giaXe;
    private int dungTich;
   
	
	public Xe(int id, String chuXe, String loaiXe, double giaXe, int dungTich) {
		super();
		this.id = id;
		this.chuXe = chuXe;
		this.loaiXe = loaiXe;
		setGiaXe(giaXe);
		setDungTich(dungTich);
	}
	public Xe() {
		super();
	}
	
	public Xe(int id) {
		super();
		this.id = id;
	}
	public String getChuXe() {
		return chuXe;
	}
	public void setChuXe(String chuXe) {
		this.chuXe = chuXe;
	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}
	public double getGiaXe() {
		return giaXe;
	}
	public void setGiaXe(double giaXe) {
		if (giaXe <0)
			this.giaXe=0;
		else
		this.giaXe = giaXe;
	}
	public float getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) {
		if (dungTich <0)
			this .dungTich=0;
		else
		this.dungTich = dungTich;
	}
	 public double thue() {
	    	double phi=0;
	    	if(dungTich<100)
	    		phi=(giaXe/100);
	    	else
	    		if(dungTich<200)
	    		   phi= (giaXe*3/100);
	    		else
	    		   phi=(giaXe*5/100);
	    	return phi;
	    }
	@Override
	public String toString() {
		return "Baitap4 [id="+ id + ",chuXe=" + chuXe + ", loaiXe=" + loaiXe + ", giaXe=" + giaXe + ", dungTich=" + dungTich + ", thue="+thue()+"]";
	}	
}
	