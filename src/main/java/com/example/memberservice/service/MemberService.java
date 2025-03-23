package com.example.memberservice.service;

import com.example.memberservice.domain.Member;
import com.example.memberservice.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member register(Member member) {
        return memberRepository.save(member);
    }
}
