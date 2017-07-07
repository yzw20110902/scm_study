package scm.entity;

import java.io.Serializable;

public class Dept implements Serializable {

	private Integer deptId;
	private String deptName;
	private String deptAdress;

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptAdress() {
		return deptAdress;
	}

	public void setDeptAdress(String deptAdress) {
		this.deptAdress = deptAdress;
	}

	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", deptName=" + deptName
				+ ", deptAdress=" + deptAdress + "]";
	}

}
