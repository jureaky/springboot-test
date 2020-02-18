package com.example.restapi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/member")
public class MemberController {

	@PostMapping("/test")
	public Member memberTest() {
		return new Member(0L, "Wickies", 20, "Jeju", new Date());
	}

}
