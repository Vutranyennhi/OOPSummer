package Bai9;

public class Congnhan {
private int maCN;
private String Ho;
private String Ten;
private int soSP;
private double donGia,tienLuong;

public int getMaCN() {
	return maCN;
}
public void setMaCN(int maCN) {
	this.maCN = maCN;
}
public String getHo() {
	return Ho;
}
public void setHo(String ho) {
	Ho = ho;
}
public String getTen() {
	return Ten;
}
public void setTen(String ten) {
	Ten = ten;
}
public int getSoSP() {
	return soSP;
}
public void setSoSP(int soSP) {
	if (soSP <0)
	this.soSP = 0;
	else
	this.soSP=soSP;
}
public Congnhan() {
	super();
}
public Congnhan(int id, String ho, String ten, int soSP) {
	super();
	this.maCN = id;
	Ho = ho;
	Ten = ten;
	this.soSP = soSP;
}
public double gettienLuong(int soSP) {
	if (soSP>=1 && soSP <=199) {
		donGia=0.5;
	}else if (soSP>=200 && soSP <=399) {
		donGia=0.55;
	}else if (soSP>=400 && soSP <=599) {
		donGia=0.6;
	}else {
		donGia=0.65;
	}
	tienLuong= (double) soSP * donGia;
	return tienLuong;
}
@Override
public String toString() {
	return "Congnhan [maCN=" + maCN + ", Ho=" + Ho + ", Ten=" + Ten + ", soSP=" + soSP + ", donGia=" + donGia
			+ ", tienLuong=" + tienLuong + "]";
}


}
