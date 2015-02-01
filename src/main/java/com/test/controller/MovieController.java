package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MovieController {

    public static final String MOVIE = "movie";
    public static final String LIST = "list";

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String getMovie(@PathVariable String name, ModelMap model) {
        System.out.println("Spring Rest webservice called ===> name "+name);
        model.addAttribute(MOVIE,name);
        return LIST;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getDefaultMovie(ModelMap model) {
        model.addAttribute(MOVIE,"This is default movie.");
        return LIST;
    }

}
