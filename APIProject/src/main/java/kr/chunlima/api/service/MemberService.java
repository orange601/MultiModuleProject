package kr.chunlima.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kr.chunlima.api.model.Member;

@Service(value="memberService")
public class MemberService implements IMemberService {
	private List<Member> members = new ArrayList<>();
	{
		int id = 0;
		members.add(new Member(id++, "Jack", "male", 32, "Programmer"));
		members.add(new Member(id++, "Scarlett", "female", 28, "Movie Actor"));
		members.add(new Member(id++, "Hanson", "male", 22, "College Student"));
		members.add(new Member(id++, "Peter", "male", 28, "Programmer"));
		members.add(new Member(id++, "Jimmy", "male", 35, "Police"));
		members.add(new Member(id++, "Alice", "female", 30, "Doctor"));
	}

	@Override
	public List<Member> getAllMembers() {
		return members;
	}

}
