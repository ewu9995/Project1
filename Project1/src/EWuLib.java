// Evan Wu Project1
public class EWuLib {

	
	public static void dateStr(String mm, String dd, String yyyy) {
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

	
	public static boolean isFinnobaci(int num) {
				int x = 0;
				while (x<= num)
				{
					int y = x+x;
					int z = y+x;
					if (num == y+z) {
						return true;
					}
					x++;
					
					}
				return false;
					}

		
	

	}
		



