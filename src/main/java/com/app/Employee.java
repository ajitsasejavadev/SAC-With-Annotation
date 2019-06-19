package com.app;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("66")
	private int empId;
	
	@Value("#{lstObj}")
	private List<String> empPrjs;
	
	@Value("#{mapObj}")
	private Map<Integer, String> empAddrs;

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empPrjs=" + empPrjs + ", empAddrs=" + empAddrs + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public List<String> getEmpPrjs() {
		return empPrjs;
	}

	public void setEmpPrjs(List<String> empPrjs) {
		this.empPrjs = empPrjs;
	}

	public Map<Integer, String> getEmpAddrs() {
		return empAddrs;
	}

	public void setEmpAddrs(Map<Integer, String> empAddrs) {
		this.empAddrs = empAddrs;
	}
	
	

}
