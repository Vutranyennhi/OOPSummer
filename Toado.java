package module1;

public class Toado {
   private int x;
   private int y;
   private String name;
public Toado() {
	super();
}
public Toado(int x, int y, String name) {
	this.x = x;
	this.y = y;
	this.name = name;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
@Override
public String toString() {
	return "Toado [x=" + x + ", y=" + y + ", name=" + name + "]";
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	}

