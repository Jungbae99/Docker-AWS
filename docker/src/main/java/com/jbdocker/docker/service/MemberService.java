package com.jbdocker.docker.service;

import com.jbdocker.docker.domain.Member;
import com.jbdocker.docker.dto.response.MemberResponseDto;
import com.jbdocker.docker.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberResponseDto findMemberInfoById(Long memberId) {

        return memberRepository.findById(memberId)
                .map(MemberResponseDto::fromEntity)
                .orElseThrow(() -> new RuntimeException("로그인 유저 정보가 없습니다."));
    }

    public MemberResponseDto findMemberInfoByEmail(String email) {
        return memberRepository.findByEmail(email)
                .map(MemberResponseDto::fromEntity)
                .orElseThrow(() -> new RuntimeException("유저 정보가 없습니다."));
    }

}
