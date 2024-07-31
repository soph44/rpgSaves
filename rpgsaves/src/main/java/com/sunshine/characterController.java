package com.sunshine;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/character")
public class characterController {

    private Map<String, character> characterMap = new HashMap<>();

    @GetMapping("/{id}")
    public character getCharacter(@PathVariable String id) {
        return characterMap.get(id);
    }

    @PostMapping("/new")
    public void createCharacter(@RequestBody character newCharacter, @RequestParam String id) {
        characterMap.put(id, newCharacter);
    }

    @PutMapping("/{id}/setlevel")
    public void setLevel(@PathVariable String id, @RequestBody int newLevel) {
        character character = characterMap.get(id);
        if (character != null) {
            character.setLevel(newLevel);
        }
    }

    @PutMapping("/{id}/levelup")
    public void updateLevel(@PathVariable String id) {
        character character = characterMap.get(id);
        if (character != null) {
            character.levelUp();
        }
    }

    @PutMapping("/{id}/weapon")
    public void updateWeapon(@PathVariable String id, @RequestBody String newWeapon) {
        character character = characterMap.get(id);
        if (character != null) {
            character.updateWeapon(newWeapon);
        }
    }

    @PutMapping("/{id}/secondary")
    public void updateSecondary(@PathVariable String id, @RequestBody String newSecondary) {
        character character = characterMap.get(id);
        if (character != null) {
            character.updateSecondary(newSecondary);
        }
    }

    @PutMapping("/{id}/armor")
    public void updateArmor(@PathVariable String id, @RequestBody String newArmor) {
        character character = characterMap.get(id);
        if (character != null) {
            character.updateArmor(newArmor);
        }
    }

    @GetMapping("/{id}/details")
    public character getCharacterDetails(@PathVariable String id) {
        return characterMap.get(id);
    }

}
