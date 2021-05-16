package com.myalley.junit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class IndexController {

    //@GetMapping("/index")
    //public ModelAndView index(Model model) {
    //    ModelAndView mv = new ModelAndView("index");
    //    model.addAttribute("name", "YOO, JUNGIL");
    //    return mv;
    //}

    @GetMapping("/index")
    public RedirectView index() {
        return new RedirectView("/users");
    }

}
