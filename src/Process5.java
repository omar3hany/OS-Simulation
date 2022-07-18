import java.io.IOException;
import java.util.Date;

public class Process5 implements Runnable {
	String state;
	int ID;
	
	@Override
	public void run() {
		Kernel.SystemCall3("Process 5 is running");
		Kernel.SystemCall3("Enter start number");
		int start = Integer.parseInt(Kernel.SystemCall4());
		Kernel.SystemCall3("Enter end number");
		int  end = Integer.parseInt(Kernel.SystemCall4());
		Date x = new Date();
		String path = x.getTime() + ".csv";
		for(int i = start ; i< end + 1;i++) {
			Kernel.SystemCall3(i+"");
			try {
				Kernel.SystemCall2(i+"", path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}	
		Kernel.SystemCall3("Process 5 has ended");

	}

}
