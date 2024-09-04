package com.tka.SpringbootFirstProject;

public class Course {
	int courseName;
	String courseId;

	public int getCourseName() {
		return courseName;
	}

	public void setCourseName(int courseName) {
		this.courseName = courseName;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseId=" + courseId + "]";
	}

	public Course(int courseName, String courseId) {
		super();
		this.courseName = courseName;
		this.courseId = courseId;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

}
