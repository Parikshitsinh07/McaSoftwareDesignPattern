class Cricle implements Shape{
	 private double r;
	
	public Cricle() {
        r = 1.0;
    }
	
	// Constructor 2: Initialize with specified radius
	public Cricle(double radius){
		r = radius;
	}
	public double dew(){
		System.out.println("Rectangle Dew...");
	}
	public double fillColor(String Color){
		System.out.println("Rectangle Color is " + Color);
	}
}