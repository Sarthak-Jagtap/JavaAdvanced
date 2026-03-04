package com.example;

public class Department {

	private int deptId;
	private String deptName;
	private String deptLoc;

	public Department(int deptId, String deptName, String deptLoc) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
	}

	public int getDeptId() {
		return deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public String getDeptLoc() {
		return deptLoc;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptLoc=" + deptLoc + "]";
	}

}
