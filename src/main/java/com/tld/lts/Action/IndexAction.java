package com.tld.lts.Action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexAction {

    @GetMapping
    public String to(){
        System.out.println("haveTest");
        return "views/index/index";
    }

}
