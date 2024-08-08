public class ZeroHandler implements Handler{
	private Handler nagetiv;
	

	public void setNextHandler(Handler nagetiv){
		this.nagetiv = nagetiv;
		
	}
	public String responability(int number){
		if(number == 0){
				return "zero number hendled by zerohandler";
		}
			setNextHandler(new NagetivHandler());
			return nagetiv.responability(number);
		}
}