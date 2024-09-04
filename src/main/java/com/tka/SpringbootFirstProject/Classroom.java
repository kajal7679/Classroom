package com.tka.SpringbootFirstProject;

import java.util.List;

public class Classroom {
	String name;
	List<Teacher> lstTeacherClassroom;

	public Classroom(String name, List<Teacher> lstTeacherClassroom) {
		super();
		this.name = name;
		this.lstTeacherClassroom = lstTeacherClassroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Teacher> getLstTeacherClassroom() {
		return lstTeacherClassroom;
	}

	public void setLstTeacherClassroom(List<Teacher> lstTeacherClassroom) {
		this.lstTeacherClassroom = lstTeacherClassroom;
	}

	private int clsId;
	private String clsName;

	public int getClsId() {
		return clsId;
	}

	public void setClsId(int clsId) {
		this.clsId = clsId;
	}

	public String getClsName() {
		return clsName;
	}

	public void setClsName(String clasName) {
		this.clsName = clasName;

	}

	public Classroom() {
		super();
	}

	public Classroom(int clsId, String clsName) {
		super();
		this.clsId = clsId;
		this.clsName = clsName;
	}

	@Override
	public String toString() {
		return "Classroom [clsId=" + clsId + ", clsName=" + clsName + "]";
	}

}
