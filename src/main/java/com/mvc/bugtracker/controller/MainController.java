package com.mvc.bugtracker.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {
    @GetMapping("/")
    public String getAllSongs(){
        return "This is Main Page";
      }
}
