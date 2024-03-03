package org.swami.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.swami.config.Config;
import org.swami.exception.OneTestNotFound;

import java.util.logging.Logger;

@Service
public class OneService {
    Logger seriveOneLog = Logger.getLogger(OneService.class.getName());

    @Autowired
    private Config config;

    @Autowired
    private RestTemplate restTemplate;

    public String getOneServiceRes(String abc) {
        String res =null;
        try{
            res = restTemplate.getForObject("http://service-two/two/sertwo/{abc}", String.class, abc);
        } catch (HttpServerErrorException errorException) {
            seriveOneLog.severe("Test not found "+abc);
            throw new OneTestNotFound(errorException.getResponseBodyAsString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return res;
    }


}
