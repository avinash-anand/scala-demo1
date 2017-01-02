package com.demo.one.interop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InteroperabilityDemo {

	public static void main(String... s) {
		List<Student> studentList = createStudentsList();
		System.out.println(studentList);
		Collections.sort(studentList);
		System.out.println(studentList);
	}

	private static List<Student> createStudentsList() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("name5", 5));
		list.add(new Student("name6", 6));
		list.add(new Student("name1", 1));
		list.add(new Student("name2", 2));
		list.add(new Student("name4", 4));
		list.add(new Student("name3", 3));
		list.add(new Student("name7", 7));
		return list;
	}

}
