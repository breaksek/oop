public class CircleDemo {
    public static void main(String[] args) {
		
        Circle c1 = new Circle();
        //private System.out.println(c1.radius);
		//private System.out.println(c1.color);
		System.out.println(c1.getRadius());
		System.out.println(c1.toString());
		System.out.println(c1.getArea());
		
		Cylinder cy1 = new Cylinder();
		System.out.println("Rasius is " + cy1.getRadius()
		+ ", Height is " + cy1.getHeight()
		+ ", Color is " + cy1.getColor()
		+ ", Base area is " + cy1.getArea()
		+ ", Volume is " + cy1.getVolume());
		System.out.println(cy1);
	}
	
}