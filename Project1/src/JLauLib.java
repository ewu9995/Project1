// Jeffrey Lau Project1
public class JLauLib {
	public static void multiplicationTable (int base, int range)
	{
		for (int i = 0; i <= range; i++)
		{
			int multiplied_num = base * i;
			System.out.println(base + "*" + i + "=" + multiplied_num);
		}
	}
	



	public static void sumUpTo(int integer)
	{
		int sum = 0;
		for(int i = 0; i <= integer; i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);
	}
}