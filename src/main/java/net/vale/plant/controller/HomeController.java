package net.vale.plant.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;

@Controller
public class HomeController {
  @GetMapping("/plantList")
  public String showList(Model model) {
    List<String> list = new LinkedList<String>();
    list.add("Rosa");
    list.add("Tulipan");
    list.add("Margarita");
    list.add("Lirio");

    model.addAttribute("plants", list);
    return "plantList";
  }

  @GetMapping("/")
  public String showHome(Model model) {
    // model.addAttribute("message", "Welcome to the Plant Application");
    // model.addAttribute("date", new Date());
    String name = "Ipomea";
    Date createdAt = new Date();
    double price = 15.99;
    boolean available = true;

    model.addAttribute("name", name);
    model.addAttribute("createdAt", createdAt);
    model.addAttribute("price", price);
    model.addAttribute("available", available);

    return "home";
  }

}
