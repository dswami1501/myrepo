package org.swami.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.swami.config.Config;

@Service
public class OneService {

    @Autowired
    private Config config;

    @Autowired
    private RestTemplate restTemplate;

    public String getOneServiceRes(String abc) {
        return restTemplate.getForObject("http://service-two/two/sertwo/{abc}", String.class, abc);
    }


}
