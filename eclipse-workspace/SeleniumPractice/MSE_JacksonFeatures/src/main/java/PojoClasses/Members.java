package PojoClasses;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)

public class Members {
	
	private String name;
	private int age;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private boolean married;
	@JsonInclude(JsonInclude.Include.NON_DEFAULT)
	private String address;
	private String mobileNo;
	private List<String> skillsets;
	public List<String> getSkillsets() {
		return skillsets;
	}
	public void setSkillsets(List<String> skillsets) {
		this.skillsets = skillsets;
	}
	public Map<String, String> getFamilytree() {
		return Familytree;
	}
	public void setFamilytree(Map<String, String> familytree) {
		Familytree = familytree;
	}
	private Map<String,String> Familytree;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	


}
