package com.onetool.server.global.exception.howToUse.service;


import com.onetool.server.global.exception.howToUse.temp.TempRequest;

public interface TempService {
    String logic(TempRequest.TempLoginRequest data);
    void errorCheck(TempRequest.TempLoginRequest data);
    String searchEngine(String keyword);
    void errorCheck(String keyword);
}