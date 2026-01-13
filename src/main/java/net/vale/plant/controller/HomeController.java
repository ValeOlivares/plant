package net.vale.plant.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import net.vale.plant.model.Plant;

import org.springframework.ui.Model;

@Controller
public class HomeController {

  @GetMapping("/plantTable")
  public String showTable(Model model) {
    List<Plant> plants = getPlants();
    model.addAttribute("plants", plants);
    return "plantTable";
  }

  @GetMapping("/plant")
  public String showPlant(Model model) {
    Plant plant = new Plant();
    plant.setName("Ipomea");
    plant.setDescription("Enredadera con flores moradas");
    plant.setPrice(15.99);
    plant.setAvailable(true);
    model.addAttribute("plant", plant);
    return "plant";
  }
  
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

  private List<Plant> getPlants() {
   List<Plant> plants = new LinkedList<Plant>();
    try{
      Plant plant1 = new Plant();
      plant1.setName("Monstera");
      plant1.setDescription("Plantas con hojas grandes");
      plant1.setPrice(17.99);
      plant1.setAvailable(true);
      plants.add(plant1);

      Plant plant2 = new Plant();
      plant2.setName("Singonio");
      plant2.setDescription("Plantas con hojas verdes");
      plant2.setPrice(10.99);
      plant2.setAvailable(true);
      plants.add(plant2);
      
      plants.add(plant1);
      plants.add(plant2);
    }

    catch(Exception e){
      e.printStackTrace();
    }
   return plants; 
  }

}
