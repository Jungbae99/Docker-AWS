package com.jbdocker.docker.jwt;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TokenDto {
    private String accessToken;
    private String refreshToken;
    private String grantType;
    private long accessTokenExpiresIn;

    public TokenDto(String accessToken, String refreshToken, String grantType, long accessTokenExpiresIn) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.grantType = grantType;
        this.accessTokenExpiresIn = accessTokenExpiresIn;
    }
}
