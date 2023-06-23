package baitap7;

public class Aggregtion {
private ToaDo tam;
private double banKinh;
private double sopi=3.14;

public Aggregtion() {
	super();
}
public Aggregtion(ToaDo tam, double banKinh, double sopi) {
	super();
	this.tam = tam;
	this.banKinh = banKinh;
	this.sopi = sopi;
}
public ToaDo getTam() {
	return tam;
}
public void setTam(ToaDo tam) {
	this.tam = tam;
}
public double getBanKinh() {
	return banKinh;
}
public void setBanKinh(double banKinh) {
	this.banKinh = banKinh;
}
public double getSopi() {
	return sopi;
}
public void setSopi(double sopi) {
	this.sopi = sopi;
}
public double ChuVi(double banKinh, double sopi) {
	return banKinh *2*sopi;
  }
public double DienTich(double banKinh,double sopi) {
	return pi*(banKinh*banKinh);
}
 }
