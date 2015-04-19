package com.example.commonadapter.bo;

public class Person {
	private String name;

	private String age;

	private String sex;

	private String add;

	private String phone;

	private String imgURL;

	private boolean click;

	public Person(String name, String age, String sex, String add,
			String phone, String imgurl, boolean click) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.add = add;
		this.phone = phone;
		this.imgURL=imgurl;
		this.click = click;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isClick() {
		return click;
	}

	public void setClick(boolean click) {
		this.click = click;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}

}
