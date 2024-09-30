package com.cleanChoice.cleanChoice.domain.member.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class JwtToken {

    private String grantType;

    private String accessToken;

    private String refreshToken;

}
