public class Circle{
	
	// property
	private double radius;
	private String color;
	
	// method
	public Circle(){
		radius = 1.0;
		color = "biru";
	}
	
	public Circle (double r){
		radius = r;
		color = "biru";
	}
	
	public Circle (double r, String c){
		radius = r;
		color = c;
	}
	
	// Akses Method
	public double getRadius(){
		return radius;
	}
	
	public String getColor(){
		return color;
	}

	public void setRadius(double r){
		radius = r;
	}
	
	public String toString(){
		return("radius = "+radius +", warna = "+color);
	}
	
	public double getArea(){
		return 3.14 * radius * radius;
	}

}