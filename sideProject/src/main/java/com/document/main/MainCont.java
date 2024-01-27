package com.document.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/mainfghfgh")
public class MainCont {
    public String urlTest() {
        
        return "/dashboard";    // JSP 경로
    }
}
