package com.my.FoodTruckApp.entree;

import com.my.FoodTruckApp.appetizer.Appetizer;
import com.my.FoodTruckApp.appetizer.AppetizerRequestBody;
import com.my.FoodTruckApp.appetizer.AppetizerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.ArrayList;


@RestController //API CALL, have to go to POSTMAN and call this API; recieving the API calls is the main job of the controller; creates endpoints with URLS
@RequiredArgsConstructor //looks for all fields but only uses final (required) fields
public class EntreeController {

    private final EntreeService entreeService; //if you want an instance of the service, we ask Spring for it through the private variable, we can use this to tell spring to INJECT it
    //will look through all the variables and see if they have a DEPENDENCY on the service

    @GetMapping("/entrees") //GET ALL ENTREES IN LIST
    public ArrayList<Entree> getListOfEntrees() {
        return entreeService.getListOfEntrees(); //getting instance of the service and calling the method
    }

    //------------------------create an entree through POST and add to list-------------------------------------------
    @PostMapping("/entrees")
    public Entree createEntree(@RequestBody EntreeRequestBody entreeRequestBody) {
        return entreeService.createEntree(entreeRequestBody); //entreeRequestBody is the raw JSON we input on PostMan
    }
    //------------------------get entree by ID-------------------------------------------
    @GetMapping("/entrees/{id}")
    public Entree getEntreeById(@PathVariable Integer id) {
        return entreeService.getEntreeById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    //------------------------PUTMAPPING must enter all fields-------------------------------------------
    @PutMapping("/entrees/{id}")
    public Entree changeObject(@RequestBody Entree requestBody, @PathVariable Integer id) {
        return entreeService.changeObject(requestBody, id);
    }
}
