package advanceJavaExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class DrinkProblem  {
	public static void main(String args[]) {
		   HashMap h = new HashMap();
		   h.put("coke", 5);
		   h.put("pepsi", 5);
		   h.put("sprite", 105);
		   h.put("fanta", 3);
		   h.put("maza", 75);
		   h.put("mirinda", 2);
		   h.put("tea", 5);
		   
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   String input = "";
		   System.out.println("please enter the drink to serve");
		   try {
			while((input = (String)br.readLine() ) != null) {
				if(input.equals("Exit")) System.exit(0);
				   String[] data = input.split(" ");
				   
				   int storedValue =  h.get(data[0]) != null ? (int) h.get(data[0]) : 0;
				   int  inputValue = Integer.valueOf(data[1]);
				   
				   if(inputValue < storedValue) {
					   System.out.println(data[0] + " is served");
					   storedValue--;
					   h.put(data[0],storedValue);
					   System.out.println("please enter the drink to serve Exit to exit the program");

				   }else {
					   System.out.println("quanity is more than available so put one more choice");
                       continue;   
				   }
				   
			   }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   
	}
   
   
}
