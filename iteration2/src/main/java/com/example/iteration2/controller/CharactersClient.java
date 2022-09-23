package com.example.iteration2.controller;

import com.example.iteration2.model.Character;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class CharactersClient {
    private static final String URL = "http://localhost:8080/characters/";
    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/characters")
    private String getCharactersList(Model model) {
        List charactersList= restTemplate.getForObject(URL, List.class);
        model.addAttribute("players", charactersList);
        return "characters";
    }

    @GetMapping("/characters/{id}")
    public String displayCharacter(@PathVariable("id") int id, Model model) {
        String URL_GET_CHARACTER = URL + id;
        Character character= restTemplate.getForObject(URL_GET_CHARACTER, Character.class);
        System.out.println(character);
        model.addAttribute("character", character);
        return "character";
    }

    @GetMapping("characters/add")
    public String characterForm(Model model) {
        model.addAttribute("character", new Character());
        System.out.println(model.getAttribute("character"));
        return "add-characters";
    }

    @PostMapping("/characters/add")
        public String addCharacter(@ModelAttribute Character newCharacter) {
        String URL_ADD_CHARACTER = URL + "add";
        System.out.println(newCharacter);
        restTemplate.postForObject(URL_ADD_CHARACTER, newCharacter, Character.class);
        return "redirect:/characters";
    }
}
