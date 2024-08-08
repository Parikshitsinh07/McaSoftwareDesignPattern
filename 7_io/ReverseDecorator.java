public class ReverseDecorator extends IODecorator
{
	public ReverseDecorator(IO io)
	{
		super(io);
	
	
	}
	public void write(String data)
	{
		StringBuilder revdata=new StringBuilder(data);
		io.write(revdata.reverse().toString());
		
	}
	public String read()
	{
		String data=io.read();
		StringBuilder revdata=new StringBuilder(data);
		return revdata.reverse().toString();
		
		
	}



}