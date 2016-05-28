package thread;

public class TestSync {

	private Long num = 1L;

	private static Long millis = 3000L;

	public void attribute() {
		synchronized (num) {
			System.out.println("attribute");
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void staticAttribute() {
		synchronized (millis) {
			System.out.println("staticAttribute");
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void onLong() {
		synchronized (millis.getClass()) {
			System.out.println("onLong");
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void method() {
		System.out.println("method");
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static synchronized void staticMethod() {
		System.out.println("staticMethod");
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void staticClass() {
		synchronized (TestSync.class) {
			System.out.println("staticClass");
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void onThis() {
		synchronized (this) {
			System.out.println("onThis");
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void testOne() {
		// onThis,attribute,staticMethod,staticAttribute,onLong使用的不是同一个锁
		// method,staticClass使用的不是同一个锁
		final TestSync t1 = new TestSync();
		new Thread(new Runnable() {
			public void run() {
				t1.onThis();
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				t1.method();
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				t1.attribute();
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				TestSync.staticMethod();
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				TestSync.staticClass();
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				TestSync.staticAttribute();
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				TestSync.onLong();
			}
		}).start();
	}

	public static void testTwo() {
		// onThis和method使用的是同一个锁
		final TestSync t1 = new TestSync();
		new Thread(new Runnable() {
			public void run() {
				t1.onThis();
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				t1.method();
			}
		}).start();
	}

	public static void testThree() {
		// staticClass和staticMethod使用的是同一个锁
		new Thread(new Runnable() {
			public void run() {
				TestSync.staticClass();
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				TestSync.staticMethod();
			}
		}).start();
	}

	public static void main(String[] args) {
		/**
		 * 通过三个test方法分别测试,可以得出:
		 * 1.synchronized用在普通方法,普通属性,静态属性,静态方法都用的不同的锁(testOne得出)
		 * 2.synchronized用在普通方法和this上是同一把锁(testTwo得出)
		 * 3.synchronized用在静态方法和Class对象上是同一把锁(testThree得出)
		 */
		testOne();
		// testTwo();
		// testThree();
	}
}