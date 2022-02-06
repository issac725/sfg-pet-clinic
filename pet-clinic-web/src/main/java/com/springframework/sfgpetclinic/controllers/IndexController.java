package com.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by @author issaclee725 on 6/02/2022
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index(){

        return "index";
    }
}
