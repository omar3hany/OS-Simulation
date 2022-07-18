
public class Process3 implements Runnable{
	String state;
	int ID;
	


	@Override
	public void run() {
		Kernel.SystemCall3("Process 3 is running");
		for(int i = 0 ; i<301;i++) {
			Kernel.SystemCall3(i+"");
		}
		Kernel.SystemCall3("Process 3 has ended");
	}

}
