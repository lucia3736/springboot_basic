package com.example.memberservice.controller;

import com.example.memberservice.domain.Member;
import com.example.memberservice.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/signup")
    public ResponseEntity<Member> signUp(Member member) {
        Member savedMember = memberService.register(member);
        return new ResponseEntity<>(savedMember, HttpStatus.CREATED);
    }
}
