import java.io.*;
public class ConsoleIO implements IO
{
	public void write(String data)
	{
		System.out.println(data);
		
		
	}
	
	public String read()
	{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			try
			{
				return br.readLine();
				
				
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
				
				
			}
			return null;
		
		
	}
	



}