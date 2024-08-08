public class NagetivHandler implements Handler{
	private Handler positive;
	

	public void setNextHandler(Handler positive){
		this.positive = positive;
		
	}
	public String responability(int number){
		if(number<0){
			return "nagetiv number hendled by NagetivHandler";
			
		}
		setNextHandler(new PositiveHandler());
			return positive.responability(number);
	}
}