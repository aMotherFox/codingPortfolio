package com.my.FoodTruckApp.entree;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.ArrayList;


@RestController //API CALL, have to go to POSTMAN and call this API; recieving the API calls is the main job of the controller; creates endpoints with URLS
@RequiredArgsConstructor //looks for all fields but only uses final (required) fields, NEEDED FOR DEPENDENCY INJECTION
public class EntreeController {

    private final EntreeService entreeService; //if you want an instance of the service, we ask Spring for it through the private variable, we can use this to tell spring to INJECT it
    //will look through all the variables and see if they have a DEPENDENCY on the service

    @GetMapping("/entrees") //GET ALL ENTREES IN LIST
    public ResponseEntity<ArrayList<Entree>> getListOfEntrees() {
        ArrayList<Entree> entrees = entreeService.getListOfEntrees();
        return new ResponseEntity<>(entrees, HttpStatus.OK); //getting instance of the service and calling the method
    } //this API isn't returning an ArrayList, it is returning a HTTP response whose BODY is anarraylist of entrees
    //ALL APIs return HTTP response aka response entity ALWAYS
    //returning HHTP response who's body has data, spring is already making the HTTP status
    //spring HANDLES the response entity, whether we manually do it or not you ARE returning a HTTP status

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

    //------------------------PATCHMAPPING one or multiple fields-------------------------------------------
    @PatchMapping("/entrees/{id}")
    public Entree changeField(@RequestBody Entree requestBody, @PathVariable Integer id) {
        return entreeService.changeField(requestBody, id);
    }

    //------------------------DELETE-------------------------------------------
    @DeleteMapping("/entrees/{id}")
//    public void deleteEntreeById(@PathVariable Integer id) {
//        entreeService.deleteEntreeById(id); //calling deleteEntreeById from our dependency entreeService
//    }
    public String deleteEntreeById(@PathVariable Integer id) {
        entreeService.deleteEntreeById(id); //calling deleteEntreeById from our dependency entreeService
        return "we have deleted something!";
    }
//    public ResponseEntity<Integer> deleteEntreeById(@PathVariable Integer id) {
//        return ResponseEntity.ok(id);
//    }
//    public String deleteEntreeById(@PathVariable Integer id) {
//        return entreeService.deleteEntreeById(id);
//        /*
//        public ResponseEntity<Long> deleteEntreeById(@PathVariable Long id) {
//        String isRemoved = entreeSer
//        }
//         */
//
//      //ResponseEntity represents a whole HTTP response - it has a status code, header, and body
        //must return from the endpoint
//      //ResponseEntity.noContent().build(); means code was correctly ran but no content found because it was deleted
    //

    // CRUD repository is a Spring Data interface for generic CRUD operations on a repository of a specific type
    //CRUD repository has methods deleteById and deleteAll
    //JPA repository is built on top of CRUD
    //it can do things in the database and that's what it's used for
//    }
}
