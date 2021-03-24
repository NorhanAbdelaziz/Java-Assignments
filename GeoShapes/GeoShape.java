public abstract class GeoShape {
protected static int dim1;
public abstract float calcArea();
public GeoShape(){}
public GeoShape(int dim1){
this.dim1 = dim1;
}
public static void setD (int d)
{
dim1 = d;
}
public int getD (int d) {
dim1 = d;
return d;
}
}

class Circle extends GeoShape{
	public Circle(int dim1){
		this.dim1 = dim1;
	}
public float calcArea() {
return 3.141592653589793238f * dim1 * dim1;
}

}


class Triangle extends GeoShape{
int height;
public Triangle(int height, int dim1) {
	this.height = height;
	this.dim1 = dim1;
}
public float calcArea() {
return 0.5f * dim1 * height;
}
public void setH (int h)
{
height = h;
}
public int getH (int h) {
return h;
}
}


class Rectangle extends GeoShape{
int dim2;
public Rectangle(int dim2, int dim1) {
	this.dim2 = dim2;
	this.dim1 = dim1;
}
public float calcArea() {
return dim1 * dim2; 
}
public void setD2 (int d2)
{
dim2 = d2;
}
public int getD2 (int d2) {
dim2 = d2;
return d2;
}
}


class Main {
public static float sumArea (GeoShape s1, GeoShape s2, GeoShape s3){
return s1.calcArea() + s2.calcArea() + s3.calcArea();
}

public static void main(String[] args) {
	Circle c = new Circle(1);
	Triangle t = new Triangle(10,4);
	Rectangle r = new Rectangle(6,2);
System.out.println(sumArea(c,t,r));
}}
