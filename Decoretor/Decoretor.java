abstract class Decoretor implements Icecream
{
	Icecream icecream;
	Decoretor(Icecream icecream)
	{
		this.icecream = icecream;
	}
	abstract public double getCost();
	abstract public void getDiscription();
}