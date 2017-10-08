// Evan Wu Project1
import java.util.Date
public class EWuLib {
	
	public String dateStr () {
		SimpleDateFormat sdf1 = new SimpleDateFormat("E mm/dd/yyyy")
		SimpleDateFormat sdf1 = new SimpleDateFormat("E dd-mm-yyyy")
	
	}

	public String cutOut(String mainStr, String subStr) {
		 String first = mainStr.substring(0, mainStr.length()*1/2); 
		 String last = subStr.substring(subStr.length()*1/2); 
		 return(first + last);
	}

	
	public static void isFibonnaci() {
		int x = 0;
		int y = 0;
		int z = 0;
	
		while (x<=1) {
		if (x == y + z)
		{
		System.out.println(x);
		}
		x++;
		}
	}
	}
		
		
