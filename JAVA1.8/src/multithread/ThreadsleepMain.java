package multithread;

public class ThreadsleepMain {

	public static void main(String[] args) {
		try {  
			for (int j = 0; j < 5; j++)  
			{  
			  
			// The main thread sleeps for the 1000 milliseconds, which is 1 sec  
			// whenever the loop runs  
			Thread.sleep(1000);  
			
			  
			// displaying the value of the variable  
			System.out.println(j);  
			//Thread.sleep(-1000); //java.lang.IllegalArgumentException: timeout value is negative
			//System.out.println(2/0);
			}  
			}  
			catch (Exception expn)   
			{  
			// catching the exception  
			System.out.println(expn);  
			}  

	}

}
