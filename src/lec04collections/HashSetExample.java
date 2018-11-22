package lec04collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Student> stdSet = new HashSet<>();
		Student s1 = new Student("First");
		Student s2 = new Student("Second");
		Student s3 = new Student("Third");
				
		stdSet.add(s1);
		stdSet.add(s2);
		stdSet.add(s3);
		stdSet.add(s3);
		stdSet.add(s1);
		
		System.out.println("------ Check for elements using contains()");
		System.out.println(stdSet.contains(s1));
		System.out.println(stdSet.contains(new Student("First")));

		System.out.println("------ Access a set using for-each loop");
		for (Student student : stdSet) {
			String name = student.getName();
			System.out.println("Name: "+name);
		}

		System.out.println("------ Access a set using iterator");
		Iterator<Student> stdItr = stdSet.iterator();
		while (stdItr.hasNext()) {
			Student student = stdItr.next();
			String name = student.getName();
			System.out.println("Name: "+name);
		}
	}

}
