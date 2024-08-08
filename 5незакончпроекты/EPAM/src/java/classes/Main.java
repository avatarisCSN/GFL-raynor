package java.classes;

import java.util.ArrayList;

public class Main {
	public static void facultyStudents( Student[] students, String faculty)
	{
		ArrayList<Student> result = new ArrayList<Student>();
		for (int i=0;i< students.length;i++)
		{
			if(students[i].getFaculty()==faculty)
			{
				result.add(students[i]);
			}
		}
	}

}
