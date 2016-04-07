/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traveltainment.itea.bernat.jsongreeting.controller;

import com.traveltainment.itea.bernat.jsongreeting.representation.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Bernat
 */
@Controller
@RequestMapping("/hello")
public class GreetingController {
    private static final String template = "Hi, %s";
    private final AtomicLong counter = new AtomicLong();
    
    @RequestMapping(path="xml", method=RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody Greeting sayXmlHello(@RequestParam(value="name", required=false, defaultValue="Stranger")String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    
    @RequestMapping(path="json", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Greeting sayJsonHello(@RequestParam(value="name", required=false, defaultValue="Stranger")String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }    
}
