package bai8;

public class CD {
private int maCD;
private String tuaCD;
private int SoBaiHat;
private double GiaThanh;
public CD(int maCD, int tuaCD, int soBaiHat, double giaThanh) {
	super();
	this.maCD = 999999;
	this.tuaCD = "chua xac dinh";
	this.SoBaiHat = 0;
	this.GiaThanh = 0.0;
}
public CD() {
	super();
}
public int getMaCD() {
	return maCD;
}
public void setMaCD(int maCD) {
	if (maCD>0) {
	this.maCD = maCD;
	}
}
public String getTuaCD() {
	return tuaCD;
}
public void setTuaCD(String tuaCD) {
	if( !tuaCD.isEmpty() ) {
	    this.tuaCD = tuaCD;
	    }
}
public int getSoBaiHat() {
	return SoBaiHat;
}
public void setSoBaiHat(int soBaiHat) {
	if (soBaiHat>0) {
	this.SoBaiHat = soBaiHat;
	}
}
public double getGiaThanh() {
	return GiaThanh;
}
public void setGiaThanh(double giaThanh) {
	if (giaThanh>0) {
	this.GiaThanh = giaThanh;
    }
}
@Override
public String toString() {
	return "CD [maCD=" + maCD + ", tuaCD=" + tuaCD + ", SoBaiHat=" + SoBaiHat + ", GiaThanh=" + GiaThanh + "]";
}

}
