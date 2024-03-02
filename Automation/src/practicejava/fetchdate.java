package practicejava;

import java.sql.Driver;
import java.util.Date;

public class fetchdate {
	
	public static void main(String[] args) {
		
		
		String date1 = new Date().toString().replace(" ", "_").replace(":", "_");
		
		System.out.println(date1);
		
		
		
	}

}
