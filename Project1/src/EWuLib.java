// Evan Wu Project1
public class EWuLib {
	
	public static String dateStr(String mm, String dd, String yyyy) {
		return (dd + "-" + mm +"-" + yyyy);
		
		
		
	}

	public static String cutOut(String mainStr, String subStr) {
		 //first is the first half of the output
		 String first = mainStr.substring(0, mainStr.length()*1/2); 
		 //last is the last half of the output
		 String last = subStr.substring(subStr.length()*1/2); 
		 // below will return the two halves
		 return(first + last);
	}

	
	public static void isFibonnaci() {
		int x = 0;
		int y = x+1;
		int z = y+1;
	
		while (x<=1) {
		if (x == y + z)
		{
		System.out.println(x);
		}
		x++;
		}
	}
	}
		

