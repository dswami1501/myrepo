package org.swami.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.swami.service.TwoService;

@RestController
@RequestMapping("/two")
public class TwoController {

    @Autowired
    private TwoService twoService;
    @GetMapping("/sertwo/{abc}")
    public String getTwoContRes(@PathVariable String abc){
        return twoService.getTwoServiceRes(abc);
    }
}
