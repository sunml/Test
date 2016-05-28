package ml.java;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

import ml.java.interfaces.TestInterface;
import ml.java.interfaces.TestInterface.InnerInterface;

public class NewFeature {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("asdf");
		list.add("1");
		Path path = FileSystems.getDefault().getPath("JAVA_HOME", "");
		System.out.println(path.toString());
		HashMap<String, Object> map = new HashMap<>();
		TreeMap<String, Object> map2 = new TreeMap<>();
		System.out.println(map.put("test", new String("特殊图")));
		System.out.println(map.put("test", new String("特殊图")));
		System.out.println(map.put("test2", new String("特殊图2")));
		map2.put("test", new String("特殊图"));
		Class<InnerInterface> classs = TestInterface.InnerInterface.class;
		int hash = classs.hashCode();
		System.out.println(hash);
		TestInterface testInterface = TestInterface.getTestInterface("asdf");
		System.out.println(testInterface);
	}
}
