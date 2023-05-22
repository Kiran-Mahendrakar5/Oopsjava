import java.io.FileInputStream;

public class checkedRunner {
	
	public static void main(String[] args) {
				
		
		
		// CHECKED BY CAMPILER

		try
		{
			FileInputStream refrence = new FileInputStream("‪‪C:\\Users\\Lenovo\\Desktop\\codes\\Byteloopjava");
			System.out.println("hello");
			
			
			System.out.println("welcome");
		}
		
		catch
		(Exception ref) {
			System.out.println("not found file");
			
			System.out.println("runnering");
		}
	}

}
