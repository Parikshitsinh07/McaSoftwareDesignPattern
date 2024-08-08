public class PositiveHandler implements Handler{
	private Handler positive;
	
	@Override
	public void setNextHandler(Handler positive){
		this.positive = positive;
		
	}
	public String responability(int number){
		if(number>0){
			return "positive number hendled by positivehandaler";	
		}
		return "can't handelr this";
	}
}