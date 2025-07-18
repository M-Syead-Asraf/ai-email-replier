package com.email.writer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.email.writer.service.EmailGeneratorService;
import com.email.writer.util.EmailRequest;

@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins = "*")
public class EmailGeneratorController {
	@Autowired
	private EmailGeneratorService emailGeneratorService;
	
	@PostMapping("/generate")
	public ResponseEntity<?> generateEmailReply(@RequestBody EmailRequest emailRequest) {
		return emailGeneratorService.generateEmailReply(emailRequest);
	}
}
