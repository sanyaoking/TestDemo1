package com.mengchaob.testDemo.freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: mengchao
 * @Date: 2018-12-25 23:47
 * @Description:
 * @Version 1.0
 * @ClassName FreemarkController
 */
@Controller
@RequestMapping(value="/freemark")
public class FreemarkController {
    @RequestMapping(value = "/first",method = RequestMethod.GET)
    public String fist_freemark(HttpServletRequest request, HttpServletResponse response, Model model){
        model.addAttribute("title","this is test!");
        Map map = new HashMap<>();
        map.put("name","Freemark");
        map.put("sex","男");
        map.put("age","28");
        model.addAttribute("userinfo",map);
        return "first_fm";
    }
}
