public class Calculate
{
	public static void main(String[] arg)
	{
		System.out.println("Calculate...");
		double first = Double.valueOf(arg[0]);
		double second = Double.valueOf(arg[1]);
		double summ = first + second;
		double dir = first / second;	
		System.out.println("Sum " + summ);	
		System.out.println("Dir " + dir);
	}
}