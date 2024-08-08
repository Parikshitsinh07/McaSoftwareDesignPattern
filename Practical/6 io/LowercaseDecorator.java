public class LowercaseDecorator extends IODecorator
{

	public LowercaseDecorator(IO io)
	{
		
		super(io);
		
	}
	public void write(String data)
	{
		
		io.write(data.toLowerCase());
		
	}
	public String read()
	{
		return io.read().toLowerCase();
		
		
	}



}