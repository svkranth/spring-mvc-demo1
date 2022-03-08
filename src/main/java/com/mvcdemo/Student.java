package com.mvcdemo;

import java.util.LinkedHashMap;

public class Student {
	
	private String studentName;
	private char studentGender;
	private String studentCountry;
	private String studentFavLanguage;
	private String[] studentKnowsOS;
	
	private LinkedHashMap<String, String> studentCountryList;
	
	public Student() {
		studentCountryList = new LinkedHashMap<>();
		studentCountryList.put("PK","Pakistan");
		studentCountryList.put("IN","India");
		studentCountryList.put("AF","Afghanistan");
		studentCountryList.put("BG","Bangladesh");
		studentCountryList.put("SL","Srilanka");
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public char getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(char studentGender) {
		this.studentGender = studentGender;
	}

	public String getStudentCountry() {
		return studentCountry;
	}

	public void setStudentCountry(String studentCountry) {
		this.studentCountry = studentCountry;
	}

	public LinkedHashMap<String, String> getStudentCountryList() {
		return studentCountryList;
	}

	public String getStudentFavLanguage() {
		return studentFavLanguage;
	}

	public void setStudentFavLanguage(String studentFavLanguage) {
		this.studentFavLanguage = studentFavLanguage;
	}

	public String[] getStudentKnowsOS() {
		return studentKnowsOS;
	}

	public void setStudentKnowsOS(String[] studentKnowsOS) {
		this.studentKnowsOS = studentKnowsOS;
	}
	
	
}
