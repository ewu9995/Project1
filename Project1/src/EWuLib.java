// Evan Wu Project1
public class EWuLib {

	//input is mm/dd/yyyy
	public static void dateStr(String date) {
		//below is mm
		String mm = date.substring(0,2);
		//below is dd
		String dd = date.substring(3,5);
		//below is yyyy
 		String yyyy = date.substring(6);
		//below prints out dd-mm-yyyy
		System.out.println(dd + "-" + mm +"-" + yyyy);
	}

	
	
		public static void cutOut(String mainStr, String subStr) {
		// Checks the whole string
		for(int i =0; i < mainStr.length()-subStr.length(); i++){
		// checks the string for characters equal to subStr	
		 if (mainStr.substring(i, i+ subStr.length()).equals(subStr))
		// if it finds subStr, then it does not include it when printed/returned, instead it only includes the characters immediately preceding and following it	 
		 System.out.println(mainStr.substring(0,i) + mainStr.substring(i + subStr.length()));
		}
		}
	

	// A fibonacci sequence is true if and only if one or both of (5x^2 + 4) or (5x^2 - 4) is a perfect square.
	// Source: Wikipedia
	public static void isFibonacci(int integer) {
		// below checks whether the plugged in input is a perfect square when it is plugged in with the mentioned formulas
		//i^2 is i*i
		if (perfectSquare(5*integer*integer + 4) || perfectSquare(5*integer*integer - 4))
			{
			System.out.println(true);
		} else
			System.out.println(false);
		}
		
	

	//this method determines whether a number is a perfect square for isFibonacci to work
	public static boolean perfectSquare(int num) {
	//the statement below is used to find the square root of a given number
	int x  = (int) Math.sqrt(num);
	//if the number is a perfect square it returns true
	if (num/x == x && x*x ==num) {
	return true;}
	return false;
	}


}
