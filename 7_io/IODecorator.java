public abstract class IODecorator implements IO
{
	public IO io;
	public IODecorator(IO io)
	{
		this.io=io;
		
		
	}
	public void write(String data)
	{
		io.write(data);
		
		
	}
	public String read()
	{
		return io.read();
		
	}


}