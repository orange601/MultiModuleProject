package kr.chunlima.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import kr.chunlima.api.model.Member;
import kr.chunlima.api.service.IMemberService;

@RestController
@RequestMapping(value="/Members")
public class MemberController {
	@Autowired
	IMemberService memberService;
	
	@ApiOperation(value="멤버 전체 목록 조회", notes="멤버들의 전체 목록을 조회한다.")
	@RequestMapping(method=RequestMethod.GET, produces= {"application/json;charset=utf-8"})
	public ResponseEntity<List<Member>> getAllMembers() {
		return new ResponseEntity<>(memberService.getAllMembers(), HttpStatus.OK);
	}

}
