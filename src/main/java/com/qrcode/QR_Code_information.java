package com.qrcode;

import lombok.Data;

@Data
public class QR_Code_information {

	String name;
	String address;
	String degree;
	String mobile;
	String age;

	public QR_Code_information(String name, String address, String degree, String mobile, String age) {
		super();
		this.name = name;
		this.address = address;
		this.degree = degree;
		this.mobile = mobile;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
