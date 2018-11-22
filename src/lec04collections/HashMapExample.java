package lec04collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, Student> stdMap = new HashMap<String, Student>();
		Student s1 = new Student("First", 1);
		Student s2 = new Student("Second", 2);
		Student s3 = new Student("Third", 3);

		stdMap.put("First", s1);
		stdMap.put("Second", s2);
		stdMap.put("Third", s3);
		stdMap.put("Third", new Student("YYYY", 4));

		System.out.println("------ Check for elements using contains()");
		System.out.println(stdMap.containsKey("First"));
		System.out.println(stdMap.containsValue(s1));
		System.out.println(stdMap.containsValue(new Student("First", 1)));

		System.out.println("------ Access a map with known key");
		Student myStd = stdMap.get("Second");
		System.out.println("Name: "+myStd.getName()+" Score: "+myStd.getScore());
		
		System.out.println("------ Looping a map using keys with keySet() method");
		Set<String> keys = stdMap.keySet();
		for (String name : keys) {
			Student student = stdMap.get(name);
			System.out.println("Name: "+student.getName()+" Score: "+student.getScore());
		}

		System.out.println("------ Looping a map using values with values() method");
		Collection<Student> values = stdMap.values();
		for (Student student : values) {
			System.out.println("Name: "+student.getName()+" Score: "+student.getScore());
		}

		System.out.println("------ Looping a map using both keys and values");
		Set<Map.Entry<String, Student>> entries = stdMap.entrySet();
		for (Map.Entry<String, Student> entry : entries) {
			String key = entry.getKey();
			Student student = entry.getValue();
			System.out.println("Name: "+student.getName()+" Score: "+student.getScore());
		}

		System.out.println("------ Access a map using iterator");
		Iterator<Student> stdItr = stdMap.values().iterator();
		while (stdItr.hasNext()) {
			Student student = stdItr.next();
			String name = student.getName();
			System.out.println("Name: "+name);
		}
		


	}

}
