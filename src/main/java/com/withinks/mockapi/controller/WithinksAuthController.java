package com.withinks.mockapi.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.withinks.mockapi.dto.AccessInformation;
import com.withinks.mockapi.dto.AccessTokenDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mofizhaider
 * @since 4/13/23
 */
@Controller
public class WithinksAuthController {

    @PostMapping("/v2/oauth2")
    public ResponseEntity getRefreshedAccessInfo(@RequestBody MultiValueMap<String, String> formData){
        AccessInformation accessInformation = new AccessInformation(32132325,
                4,
                1,
                "d560354f552335ff7abfee6ba7d60e99bc8ee9b6",
                new Date(),
                "053a0ebf4345027b91569f5489c5dba1bcaa9269",
                10000);

        AccessTokenDto accessTokenDto = new AccessTokenDto(accessInformation);

        return  new ResponseEntity<>(accessTokenDto, HttpStatus.OK);
    }
}
