
import java.io.IOException;

public class Process1 implements Runnable  {
	String state;
	int ID;
	

	
	@Override
	public void run() {
		Kernel.SystemCall3("Process 1 is running");
		Kernel.SystemCall3("Enter File path");
		String path = Kernel.SystemCall4();
		try {
			Kernel.SystemCall1(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Kernel.SystemCall3("Process 1 has ended");
	}


}
