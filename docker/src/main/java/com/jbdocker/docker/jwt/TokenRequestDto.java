package com.jbdocker.docker.jwt;

import lombok.Getter;

@Getter
public class TokenRequestDto {

    private String accessToken;
    private String refreshToken;

}
