package test;

public class MyThread extends Thread{
	
	
	public String threadName;
	public int sleepTime;
	
	public MyThread(String name, int sleepTime) {
		this.threadName = name;
		this.sleepTime = sleepTime;
		
	}
	public void run(){
	    for(int i = 0; i < 5; i++) {
	    	System.out.print(this.threadName+" "+i+"\t|");
			try {
				Thread.sleep(this.sleepTime);
				}catch(Exception e) {
					e.printStackTrace();
			}
	    }
	}    	
}
