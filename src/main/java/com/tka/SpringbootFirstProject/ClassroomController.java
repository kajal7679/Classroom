package com.tka.SpringbootFirstProject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassroomController {
	
	@Autowired
	@Qualifier("createObjX")
	X x;
	
	@Autowired
	X x11;
	
	@Autowired
	X x12;
	
	@DeleteMapping("deleteclassrooms/{clsId}")
	public void deleteClassrooms(@PathVariable("clsId") int clsId) {
		System.err.println("id of classroom  " + clsId);
	
		x.m1();
	}
	
	
	
	
	

	////// 1
	@PostMapping("insertclassroom")
	public void insertClassroom(@RequestBody Classroom classroom) {
		System.err.println(classroom);

	}

	//// 2

	@DeleteMapping("deleteclassroom/{clsId}")
	public void deleteClassroom(@PathVariable("clsId") int clsId) {
		System.err.println("id of classroom  " + clsId);
		// System.err.println("id of classroom " + teacherId);

	}

	/// 3
	@GetMapping("classroom/{clsid}")
	public Classroom getClassroom(@RequestBody Classroom classroom) {
          System.out.println(classroom);
		return null;
	}

	///// 4
	@PutMapping("classroomupdate/{id}")
	public void updateClassroom( @RequestBody Classroom classroom) {

		int id = 88;
		System.err.println("Updating classroom with ID: " + id);
		System.err.println(classroom);
	}
	
	//////5
	@DeleteMapping("classroom/{id}")
	public void deleteClassroom(@PathVariable Long id) {
	   
	    System.err.println("Deleting classroom with ID: " + id);
	}
     
	/////6
	@PostMapping("classroom/{clsId}/addStudent")
	public void addStudentToClassroom(@PathVariable Long id, @RequestBody Student student) {
	    
	    System.err.println("Adding student to classroom with ID: " + id);
	    System.err.println(student);
	}


	@DeleteMapping("deleteclassroom")
	public void getClassroomasPerId(@RequestParam int clsId) {// ?

	}

	///// 1
	@GetMapping("welcome")
	public String getWelcomemessage() {
		return "welcome to this";
	}

	///// 2
	@GetMapping("getname")
	public String getclassname() {
		return "java";
	}

	///// 3
	@GetMapping("getnumber")
	public int getnumber() {
		return 100000000;
	}

	//// 4
	@GetMapping("getboolean")
	public boolean getboolean() {
		return true;
	}

	//// 5
	@GetMapping("getarray")
	public String[] getArray() {
		return new String[] { "kajal", "viraj", "adii", "appuu" };
	}

	//// 6
	@GetMapping("getlist")
	public List<String> getlist() {
		return List.of("one", "two", "three", "four");
	}

	//// 7
	@GetMapping("getmap")
	public Map<String, String> getmap() {
		Map<String, String> map = new HashMap<>();
		map.put("1", "apple");
		map.put("2", "mango");
		return map;
	}

	//// 8
	@GetMapping("getmessage")
	public String getmessage() {
		return "I LOVE CODING";
	}

	///// 9
	@GetMapping("getdate")
	public LocalDate getDate() {
		return LocalDate.now();
	}

	/// 10
	@GetMapping("getgreetings")
	public String getgreetings() {
		return "Hello World!!!!!!!!!!!";
	}

	/////////////////// 1
	@GetMapping("allclassroom")
	public static ArrayList<Classroom> fetchAllClassrooms() {
		ArrayList<Classroom> allClassroom = new ArrayList<Classroom>();
		allClassroom.add(new Classroom(1, "JavaClassroom"));
		allClassroom.add(new Classroom(2, "PythonClassroom"));
		allClassroom.add(new Classroom(3, "HTMLClassroom"));
		allClassroom.add(new Classroom(4, "HibernateClassroom"));
		allClassroom.add(new Classroom(5, "SQLClassroom"));
		return allClassroom;
	}

	////// 2
	@GetMapping("classroomperSize")
	public static Classroom getClassroomDetailperSize() {
		ArrayList<Classroom> allClassroom = new ArrayList<Classroom>();
		allClassroom.add(new Classroom(1, "JavaClassroom"));
		allClassroom.add(new Classroom(2, "PythonClassroom"));
		allClassroom.add(new Classroom(3, "HTMLClassroom"));
		allClassroom.add(new Classroom(4, "HibernateClassroom"));
		allClassroom.add(new Classroom(5, "SQLClassroom"));

		return new Classroom(1, "JavaClassroom");
	}

	//////////// 3
	@GetMapping("allclassroomteachers")
	public static ArrayList<Classroom> fetchAllClassroomTeachers() {
		//// create one classroom for DS
		Teacher teacherDS1 = new Teacher(1, "Nilesh");
		Teacher teacherDS2 = new Teacher(2, "Megha");
		Teacher teacherDS3 = new Teacher(3, "Sandip");
		ArrayList<Teacher> allTeachers = new ArrayList<Teacher>();
		allTeachers.add(teacherDS1);
		allTeachers.add(teacherDS2);
		allTeachers.add(teacherDS3);
		Classroom classroomDS = new Classroom("datascienceclassroom", allTeachers);

		///// creye one classroom for python
		Teacher teacher1PY = new Teacher(1, "Nilesh");
		Teacher teacher2PY = new Teacher(2, "Megha");
		Teacher teacher3PY = new Teacher(3, "Sandip");
		ArrayList<Teacher> allteachers = new ArrayList<Teacher>();
		allTeachers.add(teacher1PY);
		allTeachers.add(teacher2PY);
		allTeachers.add(teacher3PY);
		Classroom classroomPython = new Classroom("pythonclassroom", allTeachers);

		ArrayList<Classroom> allClassroom = new ArrayList<Classroom>();
		allClassroom.add(classroomPython);
		allClassroom.add(classroomDS);

		return allClassroom;
	}

	////// 4
	@GetMapping("allstudents")
	public List<Student> fetchAllStudents() {
		List<Student> allStudents = new ArrayList<Student>();
		allStudents.add(new Student(1, "kajal"));
		allStudents.add(new Student(2, "viraj"));
		allStudents.add(new Student(3, "addi"));
		allStudents.add(new Student(4, "appu"));

		return allStudents;

	}

	/////////// 5
	@GetMapping("allteachers")
	public List<Teacher> fetchAllTeachers() {
		List<Teacher> allTeachers = new ArrayList<Teacher>();
		allTeachers.add(new Teacher(1, "Mr.smith"));
		allTeachers.add(new Teacher(2, "Mrs.malhotra"));
		return allTeachers;

	}

/////////// 6
	@GetMapping("allcourses")
	public List<Course> fetchAllCourses() {
		List<Course> allCourses = new ArrayList<Course>();
		allCourses.add(new Course(1, "Core Java"));
		allCourses.add(new Course(2, "Advanced Java"));
		allCourses.add(new Course(3, "HTML CSS"));
		return allCourses;
	}

	////// 7
	@GetMapping("endclasswithM")
	public static ArrayList<Classroom> getclassedswithM() {
		ArrayList<Classroom> endsM = new ArrayList<Classroom>();
		for (Classroom classroom : fetchAllClassrooms()) {
			if (classroom.getName().toLowerCase().endsWith("m")) {
				endsM.add(classroom);
			}

		}
		return endsM;
	}
}
