public class UppercaseDecorator extends IODecorator
{
	public UppercaseDecorator(IO io)
	{
		super(io);
		
		
	}
	public void write(String data)
	{
		io.write(data.toUpperCase());
		
		
	}
	public String read()
	{
		
		
		return io.read().toUpperCase();
		
	}


}