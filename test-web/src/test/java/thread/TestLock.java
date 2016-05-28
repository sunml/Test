package thread;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

import ml.services.CarService;
import ml.services.impl.CarServiceImpl;

public class TestLock {

	protected Object data = null;// 缓存数据
	protected ReentrantLock reentrantLock = new ReentrantLock();// 排它锁
	protected CountDownLatch countDownLatch = new CountDownLatch(2);// 共享锁
	protected ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();// 复合排它锁和共享锁
	protected static Long millis = 3000L;
	protected static TestLock testLock = new TestLock();

	public static void main(String[] args) {
		testWriteLock();
		// testReadLock();
		new Thread("synData") {
			public void run() {
				testLock.synData();
			}
		}.start();
	}

	protected void synData() {
		synchronized (rwl.writeLock()) {
			try {
				System.out.println("synData starting");
				Thread.sleep(millis);
				System.out.println("synData ending");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	protected static void testReadLock() {
		for (int i = 0; i < 3; i++) {
			new Thread("getData") {
				public void run() {
					testLock.getData();
				}
			}.start();
		}
	}

	protected static void testWriteLock() {
		for (int i = 0; i < 3; i++) {
			new Thread("setData") {
				public void run() {
					testLock.setData(new Random().nextInt(10000));
				}
			}.start();
		}
	}

	protected Object getData() {
		ReadLock readLock = rwl.readLock();
		readLock.lock();// 上读锁，其他线程只能读不能写
		try {
			System.out.println(Thread.currentThread().getName() + "starting!");
			Thread.sleep(millis);
			System.out.println(Thread.currentThread().getName() + " have read data :" + data);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			readLock.unlock(); // 释放读锁
		}
		return data;
	}

	protected void setData(Object data) {
		WriteLock writeLock = rwl.writeLock();
		writeLock.lock();// 上写锁，不允许其他线程读也不允许写
		try {
			System.out.println(Thread.currentThread().getName() + "starting!");
			Thread.sleep(millis);
			this.data = data;
			System.out.println(Thread.currentThread().getName() + " have write data: " + data);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (writeLock.isHeldByCurrentThread()) {
				int num = writeLock.getHoldCount();
				for (int i = 0; i < num; i++) {
					writeLock.unlock(); // 释放写锁
				}
			}
		}
	}
}
