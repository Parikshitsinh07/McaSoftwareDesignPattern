class Rectangle implements Shape{
	private double l;
	private double w;
	
	public Rectangle (){
		l=1.0;
		w=2.0;
	}
	public Rectangle(double l,double w){
		this.l=l;
		this.w=w;
	}
	public double dew(){
		System.out.println("Rectangle Dew...");
	}
	public double fillColor(String Color){
		System.out.println("Rectangle Color is " + Color);
	}
}