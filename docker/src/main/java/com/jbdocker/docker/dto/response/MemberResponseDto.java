package com.jbdocker.docker.dto.response;

import com.jbdocker.docker.domain.Member;
import lombok.Getter;

@Getter
public class MemberResponseDto {
    private String email;

    public static MemberResponseDto fromEntity(Member member) {
        MemberResponseDto dto = new MemberResponseDto();
        dto.email = member.getEmail();
        return dto;
    }
}
