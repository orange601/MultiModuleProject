package kr.chunlima.api.model;

import lombok.Data;

@Data
public class Member {
	private int memberId;
	private String name;
	private String gender;
	private int age;
	private String job;
	
	@Override
	public String toString() {
		return String.format(
				"Member [memberId=%d, name=%s, gender=%s, age=%d, job=%s",
				this.memberId,
				this.name,
				this.gender,
				this.age,
				this.job
				);
	}
	
	public Member() {}
	@java.beans.ConstructorProperties({"memberId", "name", "gender", "age", "job"})
	public Member(int memberId, String name, String gender, int age, String job) {
		this.memberId = memberId;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.job = job;
	}
}
