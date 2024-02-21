package GenericLib;

import java.util.Random;

public class WorkLib extends BaseTest{
	
	public int randomNo()
	{
		Random r = new Random();
		int no = r.nextInt(10);
		return no;
		
	}

}
