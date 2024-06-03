package com.binary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping("/welcome")
    public ModelAndView welcome(){
       ModelAndView homepageModel = new ModelAndView();
       homepageModel.setViewName("homepage");
       return homepageModel;
    }

    @PostMapping("/user")
    public ModelAndView user(@RequestParam ("username") String username){
        ModelAndView homepageModel = new ModelAndView();
        homepageModel.setViewName("momepage3");
        homepageModel.addObject("username", username);

        return homepageModel;
    }
    @RequestMapping("/hi")
    public ModelAndView nathy(){
        ModelAndView homepageModel = new ModelAndView();
        homepageModel.setViewName("momepage3");
        return homepageModel;
    }

}
