package com.sunshine;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
import com.sunshine.Player.JobType;
import com.sunshine.Player.Spell;

@RestController
@RequestMapping("/player")
public class PlayerController {

    private Map<String, Player> playerMap = new HashMap<>();

    @GetMapping("/{id}")
    public Player getCharacter(@PathVariable String id) {
        return playerMap.get(id);
    }

    @PostMapping("/new")
    public void createPlayer(@RequestBody Player newPlayerCharacter, @RequestParam String id) {
        playerMap.put(id, newPlayerCharacter);
    }

    @PutMapping("/{id}/setlevel")
    public void setLevel(@PathVariable String id, @RequestBody int newLevel) {
        Player player = playerMap.get(id);
        if (player != null) {
            player.setLevel(newLevel);
        }
    }

    @PutMapping("/{id}/levelup")
    public String updateLevel(@PathVariable String id) {
        Player player = playerMap.get(id);
        if (player != null) {
            player.levelUp();
        }
        return "Player not found.";
    }

    @PutMapping("/{id}/weapon")
    public String updateWeapon(@PathVariable String id, @RequestBody String newWeapon) {
        Player player = playerMap.get(id);
        if (player != null) {
            player.updateWeapon(newWeapon);
        }
        return "Player not found.";
    }

    @PutMapping("/{id}/secondary")
    public String updateSecondary(@PathVariable String id, @RequestBody String newSecondary) {
        Player player = playerMap.get(id);
        if (player != null) {
            player.updateSecondary(newSecondary);
        }
        return "Player not found.";
    }

    @PutMapping("/{id}/armor")
    public String updateArmor(@PathVariable String id, @RequestBody String newArmor) {
        Player player = playerMap.get(id);
        if (player != null) {
            player.updateArmor(newArmor);
        }
        return "Player not found.";
    }

    @GetMapping("/{id}/spellslot")
    public String getSpellSlotDetails(@PathVariable String id) {
        Player player = playerMap.get(id);
        if (player != null) {
            return player.getSpellSlot().getSpells().toString();
        }
        return "Player not found.";
    }

    @GetMapping("/{id}/details")
    public Player getPlayerDetails(@PathVariable String id) {
        return playerMap.get(id);
    }

}
