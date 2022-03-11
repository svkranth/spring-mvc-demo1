package com.mvcdemo;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.mvcdemo.validation.ValidateOS;

public class Student {
	
	@NotNull(message="Name is Mandatory")
	@Size(min=1, max=70, message="Name should be between 1 and 70 characters")
	private String studentName;
	@NotNull(message="Gender is mandatory")
	private char studentGender;
	@NotNull(message="Country is mandatory")
	private String studentCountry;
	@NotNull(message="Choose a Programming language")
	private String studentFavLanguage;
	@NotNull(message="Choose at least one OS")
	@ValidateOS(limit=2, message="Choose atleast 2 OS")
	private String[] studentKnowsOS;
	
	@NotNull(message="GPA can't be empty")
	@Min(value=1, message="GPA must be between 1 and 5")
	@Max(value=5, message="GPA must be between 1 and 5")
	private Integer studentGPA;
	
	@NotNull(message="Zip code is required")
	@Pattern(regexp="[0-9]{5}" , message="Zip code should be numeric and 5 characters")
	private String studentZip;
	
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

	public Integer getStudentGPA() {
		return studentGPA;
	}

	public void setStudentGPA(Integer studentGPA) {
		this.studentGPA = studentGPA;
	}

	public String getStudentZip() {
		return studentZip;
	}

	public void setStudentZip(String studentZip) {
		this.studentZip = studentZip;
	}
	
	
}
