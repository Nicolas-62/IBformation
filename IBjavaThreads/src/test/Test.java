package test;

public class Test {

	public static void main(String[] args) {
//		MyThread t1 = new MyThread("thread A", 1000);
//		MyThread t2 = new MyThread("thread B",500);
//		t1.start();
//		t2.start();
		
		MultiThread mt = new MultiThread(new MyThread("A", 1000), new MyThread("B", 500), new MyThread("C", 100));
		mt.t1.start();
		mt.t2.start();
		mt.t3.start();
		
	}

}
