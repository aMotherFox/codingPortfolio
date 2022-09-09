package com.my.FoodTruckApp.entree;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


@RestController
@RequiredArgsConstructor
public class EntreeController {

    private final EntreeService entreeService;

    @GetMapping("/entrees")
    public ArrayList<Entree> getListOfEntrees() {
        return entreeService.getListOfEntrees();
    }

    @PostMapping("/entrees")
    public Entree createEntree(@RequestBody EntreeRequestBody entreeRequestBody) {
        return entreeService.createEntree(entreeRequestBody);
    }

    @GetMapping("/entrees/{id}")
    public Entree getEntreeById(@PathVariable Integer id) {
        return entreeService.getEntreeById(id);
    }

    @DeleteMapping("/entrees/{id}")
    public void deleteEntreeById(@PathVariable Integer id) {
        entreeService.deleteEntreeById(id);
    }

}
