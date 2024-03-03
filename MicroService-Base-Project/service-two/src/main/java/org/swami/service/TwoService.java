package org.swami.service;

import org.springframework.stereotype.Service;

@Service
public class TwoService {

    public String getTwoServiceRes(String abc) {
        if(abc.equals("test1")){
            return abc+" working fine";
        } else if (abc.equals("test2")) {
            return abc+" working fine";
        }else {
            return "no test found";
        }
    }
}
