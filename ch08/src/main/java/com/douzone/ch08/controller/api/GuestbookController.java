package com.douzone.ch08.controller.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.douzone.ch08.dto.JSONResult;
import com.douzone.ch08.vo.GuestbookVo;

@RestController
@RequestMapping("/api/guestbook")
public class GuestbookController {

	@PostMapping("")
	public JSONResult ex01(@RequestBody GuestbookVo vo) {
		System.out.println(vo);
		// guestbookService.addMessage(vo);
		
		return JSONResult.success("ok");
	}
}
