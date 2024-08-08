public class X{
	private static X x= null;
	private static int CountInstence = 0;
	private X(){
		System.out.println("Class X ");
	} 
	public static X getClassX(){
		if(CountInstence < 2){
			CountInstence = CountInstence +1;
			return new X();
		}
		else{
			System.out.println("You can't Create Instence");
			return x;
		}
		
	}
	
}
