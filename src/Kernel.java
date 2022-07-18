import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Kernel {
	
	public static void SystemCall1(String path) throws IOException 
	{
		BufferedReader br = new BufferedReader(new FileReader(path));
		String line = br.readLine();
		while (line != null) 
		{
			String[] info = line.split(",");
			for(int i = 0 ; i < info.length;i++) 
			{
				SystemCall3(info[i] + " ");
			}
			line = br.readLine();
		}
		br.close();
		
	}
	
	public static void SystemCall2(String content , String path) throws IOException 
	{

        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content + ",");
        bw.close();
		
	}
	
	public static void SystemCall3(String content)
	{
		System.out.println(content);
	}
	public static String SystemCall4() 
	{
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}



}
