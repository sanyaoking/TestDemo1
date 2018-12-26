package com.mengchaob.testDemo.jsp;

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
 * @Date: 2018-12-25 15:11
 * @Description:
 * @Version 1.0
 * @ClassName FirstController
 */
@Controller
@RequestMapping(value = "/jsp")
public class JspController {
    @RequestMapping(value = "/first",method = RequestMethod.GET)
    public String fist_jsp(HttpServletRequest request, HttpServletResponse response, Model model){
        model.addAttribute("title","this is test!");
        Map map = new HashMap<>();
        map.put("name","李四");
        map.put("sex","男");
        map.put("age","28");
        model.addAttribute("userinfo",map);
        return "first";
    }
    @RequestMapping(value = "/second",method = RequestMethod.GET)
    public String second_jsp(HttpServletRequest request, HttpServletResponse response, Model model){
        model.addAttribute("title","this is test!");
        Map map = new HashMap<>();
        map.put("name","李四");
        map.put("sex","男");
        map.put("age","28");
        model.addAttribute("userinfo",map);
        return "second";
    }
}
