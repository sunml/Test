package ml.java.interfaces;

public interface TestInterface {

	public static TestInterface getTestInterface(String... names) {
		for (String name : names) {
			System.out.println(name);
		}
		return new TestInterface() {
		};
	}

	public interface InnerInterface {

	}
}
