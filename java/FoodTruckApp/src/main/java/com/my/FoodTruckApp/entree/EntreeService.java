package com.my.FoodTruckApp.entree;
import com.my.FoodTruckApp.appetizer.Appetizer;
import com.my.FoodTruckApp.appetizer.AppetizerRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;
import java.util.ArrayList;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EntreeService {

    private final EntreeRepository entreeRepository;//creating a NULL entreeRepository, just a field
    //final means cannot be changed, only instantiated once
    //picked up by @RequiredArgsConstructor

    //---------------------------------------------------------------------------------------------------------------------------------
    public ArrayList<Entree> getListOfEntrees() {
        ArrayList<Entree> entrees = entreeRepository.getAllEntrees();
        System.out.println("These are the entrees: " + entrees);
        return entrees;
    }
    //---------------------------------------------------------------------------------------------------------------------------------
    public Entree createEntree(@RequestBody EntreeRequestBody entreeRequestBody) {
        ArrayList<Entree> entrees = entreeRepository.getAllEntrees();
        System.out.println("Creating an entree with requestBody: " + entreeRequestBody);
        Integer id = entrees.get(entrees.size() - 1).getId() + 1; //getting the ID # of the last object in the list and adding +1 to it so it becomes the next ID

        Entree entree = new Entree(
                id, //+1 from last ID in list to become new ID
                entreeRequestBody.getEntreeSize(),
                entreeRequestBody.getEntreeFlavor(),
                entreeRequestBody.getEntreePairedMeal(),
                entreeRequestBody.getEntreePrice()
        );
        entrees.add(entree); //adding new appetizer to list
        return entree;
    }
    //---------------------------------------------------------------------------------------------------------------------------------
    public Optional<Entree> getEntreeById(@PathVariable Integer id) {
        ArrayList<Entree> entrees = entreeRepository.getAllEntrees();
        System.out.println("getting entree by id: " + id);
        Optional<Entree> entreeById = entrees.stream().filter(entree -> entree.getId() == id).findFirst();
        return entreeById;
    } //TODO: make 404 error instead of optional, 404 goes on controller
    //---------------------------------------------------------------------------------------------------------------------------------
    public Entree changeObject(@RequestBody Entree requestBody, @PathVariable Integer id) {
        ArrayList<Entree> entrees = entreeRepository.getAllEntrees();

        Optional<Entree> optionalEntreeById = entrees.stream().filter(entree -> entree.getId().equals(id)).findFirst();
        //find entree by ID

        if (optionalEntreeById.isPresent()) { //isPresent ensures we are entering object that exists, if the ID (ID we found above) exists, it will be plugged in here
            Entree foundEntree = optionalEntreeById.get();
            foundEntree.setPrice(requestBody.getPrice());
            foundEntree.setFlavor(requestBody.getFlavor());
            foundEntree.setPairedMeal(requestBody.getPairedMeal());
            foundEntree.setSize(requestBody.getSize());
            //will set field if new value is inputted on PostMan
            //if field is NULL aka not changed on PostMan, throw exception
            if (requestBody.getPrice() == null) {
                System.out.println("The price is null");
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
            } if (requestBody.getFlavor() == null) {
                System.out.println("The flavor is null");
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
            } if (requestBody.getPairedMeal() == null) {
                System.out.println("The meal is null");
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
            } if (requestBody.getSize() == null) {
                System.out.println("The size is null");
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
            }
            return foundEntree; //if app existed AND all field requirements were met
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        // throwing exception if no item by id exists
    }
}
