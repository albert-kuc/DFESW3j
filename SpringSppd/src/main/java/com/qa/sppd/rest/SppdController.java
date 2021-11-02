package com.qa.sppd.rest;

import org.springframework.web.bind.annotation.*;

import com.qa.sppd.domain.SppdCharacter;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SppdController {

    private List<SppdCharacter> SppdCharacters = new ArrayList<>();

    @GetMapping("/hello")
    public String hello() {
        return """
                Hello, World!
                I am The Great Cornholio!
                Are you threatening me?""";  // sends response
    }

    @PostMapping("/create")
    public SppdCharacter createSppdCharacter(@RequestBody SppdCharacter newSppdCharacter) {
        this.SppdCharacters.add(newSppdCharacter);
        return this.SppdCharacters.get(this.SppdCharacters.size() - 1);
    }

    @GetMapping("/getAll")
    public List<SppdCharacter> getAllSppdCharacters() {
        return this.SppdCharacters;
    }

    @GetMapping("/get/{id}")
    public SppdCharacter getSppdCharacter(@PathVariable Integer id) {
        return this.SppdCharacters.get(id);
    }

    @PutMapping("/replace/{id}")
    public SppdCharacter replaceSppdCharacter(@PathVariable Integer id, @RequestBody SppdCharacter newSppdCharacter) {
        this.SppdCharacters.set(id, newSppdCharacter);
        return this.SppdCharacters.get(id);
    }

    @DeleteMapping("/remove/{id}")
    public SppdCharacter removeSppdCharacter(@PathVariable int id) {
        SppdCharacter removedSppdCharacter = this.SppdCharacters.remove(id);
        return removedSppdCharacter;
    }
}
