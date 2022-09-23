package com.example.iteration2.controller;

import com.example.iteration2.model.Character;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class Characters {
    public static List<Character> charactersList = new ArrayList<>();
    public static int id = 0;

    static {
        charactersList.add(new Character(id++, "Mar", "Magicien", 10));
        charactersList.add(new Character(id++, "Aid", "Magicien", 8));
        charactersList.add(new Character(id++, "Zel", "Guerrier", 15));
    }

//    @GetMapping("characters/add")
//    public String characterForm(Model model) {
//        model.addAttribute("player", new Character());
//        return "add-characters";
//    }

//    @PostMapping("/characters")
//    public String characterSubmit(@ModelAttribute Character character, Model model) {
//        character.setId(id++);
//        this.charactersList.add(character);
//        model.addAttribute("players", charactersList);
//        return "characters";
//    }
}
