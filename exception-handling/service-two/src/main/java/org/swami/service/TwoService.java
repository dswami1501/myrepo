package org.swami.service;

import org.springframework.stereotype.Service;
import org.swami.exception.TwoTestNotFound;

import java.util.logging.Logger;

@Service
public class TwoService {
    Logger seriveTwoLog = Logger.getLogger(TwoService.class.getName());

    public String getTwoServiceRes(String abc) {
        if(abc.equals("test1")){
            return abc+"working fine";
        } else if (abc.equals("test2")) {
            return abc+"working fine";
        }else {
            seriveTwoLog.severe("Test not found "+abc);
            throw new TwoTestNotFound("Test not found "+abc);
        }
    }
}
