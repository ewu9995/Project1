// Evan Wu and Jeffrey Lau
// Project 1
public class MainMethod {
	
  // Evan Wu
	
	public static void dateStr(String mm, String dd, String yyyy) {
		//Input is mm,dd,yyyy (mm/dd/yyyy) and output is (dd-mm-yyyy)
		System.out.println(dd + "-" + mm +"-" + yyyy);
	}

	
	
	public static void cutOut(String mainStr, String subStr) {
		 //first is the first half of the output
		 String first = mainStr.substring(0, mainStr.length()*1/2); 
		 //last is the last half of the output
		 String last = subStr.substring(subStr.length()*1/2); 
		 // below will return the two halves
		 System.out.println(first + last);
	}

	// A finnobaci sequence is true if and only if one or both of (5x^2 + 4) or (5x^2 - 4) is a perfect square.
	// Source: Wikipedia
	public static void isFinnobaci(int integer) {
		// below checks whether the plugged in input is a perfect square
		//i^2 is i*i
		if (perfectSquare(5*integer*integer + 4) || perfectSquare(5*integer*integer - 4))
			{
			System.out.println(true);
		} else
			System.out.println(false);
		}
		
	

	//this method determines whether a number is a perfect square
	public static boolean perfectSquare(int num) {
	//the statement below is used to find the square root of a given number
	int x  = (int) Math.sqrt(num);
	//if the number is a perfect square it returns true
	if (num/x == x && x*x ==num) {
	return true;}
	return false;
	}
	
	
	// Jeffrey Lau
	
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