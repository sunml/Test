package thread;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

public class TestTread implements Runnable {

	private static Long num = 0L;
	private Long count = 0L;
	private static ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

	public static void main(String[] args) {
		ReadLock readLock = rwl.readLock();
		readLock.lock();
		System.out.println(TestTread.class);
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new TestTread());
			thread.start();
		}
	}

	@Override
	public void run() {
		int i = 0;
		do {
			plusOne();
			plusTwo();
			// removeOne();
			i++;
		} while (i < 10);
		System.out.println(num + "-" + count);
	}

	public synchronized static void plusOne() {
		num++;
	}

	public synchronized void plusTwo() {
		count++;
	}

	public void removeOne() {
		synchronized (count) {
			num--;
		}
	}
}
