import java.io.IOException;

public class Process2 implements Runnable {
	String state;
	int ID;
	

	@Override
	public void run() {
		Kernel.SystemCall3("Process 2 is running");
		Kernel.SystemCall3("Enter Content of the File");
		String content = Kernel.SystemCall4();
		Kernel.SystemCall3("Enter File path");
		String path = Kernel.SystemCall4();
		try {
			Kernel.SystemCall2(content, path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Kernel.SystemCall3("Process 2 has ended");
	}


}
