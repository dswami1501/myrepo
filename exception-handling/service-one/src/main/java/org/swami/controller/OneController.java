package org.swami.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.swami.service.OneService;

@RestController
@RequestMapping("/one")
public class OneController {

    @Autowired
    private OneService oneService;
    @GetMapping("/serone/{abc}")
    public String getOneContRes(@PathVariable String abc){
        return oneService.getOneServiceRes(abc);
    }

    @GetMapping("/test")
    public String test(){
        return "ok";
    }
}
