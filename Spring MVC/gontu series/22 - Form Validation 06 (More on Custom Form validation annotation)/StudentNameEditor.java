package com.neeraj.controller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport{
	@Override
	public void setAsText(String studentName) throws IllegalArgumentException {
		if(studentName.contains("Mr.") || studentName.contains("Mx.")) {
			setValue(studentName);
		}else {
			studentName = "Ms."+studentName;
			setValue(studentName);
		}
	}
}
