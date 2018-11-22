package lec04collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Student> stdList = new ArrayList<>();
		Student s1 = new Student("First");
		Student s2 = new Student("Second");
		Student s3 = new Student("Third");

		stdList.add(s1);
		stdList.add(s2);
		stdList.add(s3);
		stdList.add(s3);

		System.out.println("------ Check for elements using contains()");
		System.out.println(stdList.contains(s1));
		System.out.println(stdList.contains(new Student("First")));

		System.out.println("------ Access a list using get(i)");
		for (int i = 0; i < stdList.size(); i++) {
			Student student = stdList.get(i);
			String name = student.getName();
			System.out.println("Name: "+name);
		}
		
		System.out.println("------ Access a list using for-each loop");
		for (Student student : stdList) {
			String name = student.getName();
			System.out.println("Name: "+name);
		}

		System.out.println("------ Access a set using iterator");
		Iterator<Student> stdItr = stdList.iterator();
		while (stdItr.hasNext()) {
			Student student = stdItr.next();
			String name = student.getName();
			System.out.println("Name: "+name);
		}
		


	}

}
