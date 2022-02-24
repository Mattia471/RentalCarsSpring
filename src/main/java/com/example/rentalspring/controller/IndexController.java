package com.example.rentalspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController
{
    @RequestMapping(value="index")
    public String getWelcome(Model model)
    {
        model.addAttribute("intestazione", "Benvenuti nel sito Alpha Shop 2");
        model.addAttribute("saluti", "Seleziona i prodotti da acquistare");

        return "welcome";
    }

    @RequestMapping
    public String getWelcome2(Model model)
    {
        model.addAttribute("intestazione", "Benvenuti nel sito Alpha Shop");
        model.addAttribute("saluti", "Seleziona i prodotti da acquistare");

        return "index";
    }

}
