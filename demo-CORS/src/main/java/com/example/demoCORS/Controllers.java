package com.example.demoCORS;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class Controllers {

    @GetMapping("/name")
    public String getName(@RequestParam String name) {
        return "Nome: " + name;
    }

    @PostMapping("/reverseName")
    public String reverseName(@RequestBody String name) {
        StringBuilder reversedName = new StringBuilder(name).reverse();
        return "Nome al contrario: " + reversedName.toString();
    }
}