
public class OS   
{

	public static void main(String[] args) {
		
		Thread a = new Thread(new Process1());
		Thread b = new Thread(new Process2());
		Thread c = new Thread(new Process3());
		Thread d = new Thread(new Process4());
		Thread e = new Thread(new Process5());
		//a.start();
		//b.start();
		c.start();
		d.start();
		//e.start();
		
		
	}
	
  
} 