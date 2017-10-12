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
	
	
	
	
	public static boolean isPalindrome(char[] checked_word)
	{
		int forward = 0;
		int backward = checked_word.length- 1;
		
		while(backward > forward)
		{
			if(checked_word[forward] != checked_word[backward])
			{
				return false;
			}
				
			backward--;
			forward--;
		}
		return true;
	}
}
