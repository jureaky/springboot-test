package com.example.restapi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletResponse;

import java.util.Date;

@RestController
@RequestMapping("/member")
public class MemberController {

	@ModelAttribute
	public void setResponseHeader(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Credentials", "false");
		response.setHeader("Access-Control-Allow-Methods", "POST");
		response.setHeader("Access-Control-Allow-Origin", "*");
	}
	@PostMapping("/test")
	public Member memberTest() {
		return new Member(0L, "Wickies", 20, "Jeju", new Date());
	}

}
