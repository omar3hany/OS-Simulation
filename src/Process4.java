
public class Process4 implements Runnable{
	String state;
	int ID;
	

	@Override
	public void run() {
		Kernel.SystemCall3("Process 4 is running");
		for(int i = 500 ; i<1001;i++) {
			Kernel.SystemCall3(i+"");
		}
		Kernel.SystemCall3("Process 4 has ended");
	}

}
