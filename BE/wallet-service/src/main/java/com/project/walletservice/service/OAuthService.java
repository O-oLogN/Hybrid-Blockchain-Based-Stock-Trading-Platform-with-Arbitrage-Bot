package com.project.walletservice.service;

import com.project.walletservice.common.BaseResponse;

public interface OAuthService {
    String getValidAccessToken(String userId);
    BaseResponse<?> exchangeAuthCode(String userId, String authCode);
}
