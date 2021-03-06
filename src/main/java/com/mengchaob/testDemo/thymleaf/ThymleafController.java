package com.mengchaob.testDemo.thymleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: mengchao
 * @Date: 2018-12-26 14:31
 * @Description:
 * @Version 1.0
 * @ClassName ThymleafController
 */
@Controller
@RequestMapping(value = "/thymleaf")
public class ThymleafController {
    @RequestMapping(value = "/first",method = RequestMethod.GET)
    public String fist_freemark(HttpServletRequest request, HttpServletResponse response, Model model){
        model.addAttribute("title","this is test!");
        Map map = new HashMap<>();
        map.put("name","Freemark");
        map.put("sex","男");
        map.put("age","28");
        model.addAttribute("userinfo",map);
        return "first_thym";
    }
}
