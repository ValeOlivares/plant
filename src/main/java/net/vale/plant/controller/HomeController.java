package net.vale.plant.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;

@Controller
public class HomeController {

  @GetMapping("/")
  public String showHome(Model model) {
    // model.addAttribute("message", "Welcome to the Plant Application");
    // model.addAttribute("date", new Date());
    String name = "Ipomea";
    Date pubDate = new Date();
    double price = 15.99;
    boolean available = true;

    model.addAttribute("name", name);
    model.addAttribute("pubDate", pubDate);
    model.addAttribute("price", price);
    model.addAttribute("available", available);

    return "home";
  }

}
