package com.my.FoodTruckApp.entree;
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
            } //TODO: can be done in one loop
            //should recieve whole entree every time
            //if __ is null, OR if ___ is null, OR if ___ is null, etc, throw exception
            return foundEntree; //if app existed AND all field requirements were met
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        // throwing exception if no item by id exists
    }
    //---------------------------------------------------------------------------------------------------------------------------------
    public Entree changeField(@RequestBody Entree requestBody, @PathVariable Integer id) {
        ArrayList<Entree> entrees = entreeRepository.getAllEntrees();
        Optional<Entree> optionalEntreeById = entrees.stream().filter(entree -> entree.getId().equals(id)).findFirst();

        //figure out if field is set to null
        //IF field == null, do not change field
        //else, set field
        //cannot return or loop will stop

        if (optionalEntreeById.isPresent()) { //isPresent ensures we are entering object that exists, if the ID (ID we found above) exists, it will be plugged in here
            Entree foundEntree = optionalEntreeById.get();
            if (requestBody.getPrice() == null) { //only GETTING price to check if null, not setting it
                System.out.println("before change" + foundEntree);
                return foundEntree; //this is incorrect because it stops the code when the field is null, so rest of fields don't run
            }
            foundEntree.setPrice(requestBody.getPrice()); //price was NOT NULL so moved to this ELSE, which is where we set price
            System.out.println("after change" + foundEntree);

            if (requestBody.getFlavor() == null) {//only GETTING flavor to check if null, not setting it
                System.out.println("before change" + foundEntree);
                return foundEntree;
            }
            foundEntree.setFlavor(requestBody.getFlavor());//flavor was NOT NULL so moved to this ELSE, which is where we set price
            System.out.println("after change" + foundEntree);

            if (requestBody.getSize() == null) {//only GETTING size to check if null, not setting it
                System.out.println("before change" + foundEntree);
                return foundEntree;
            }
            foundEntree.setSize(requestBody.getSize());//size was NOT NULL so moved to this ELSE, which is where we set price
            System.out.println("after change" + foundEntree);

            if (requestBody.getPairedMeal() == null) {//only GETTING pairedMeal to check if null, not setting it
                System.out.println("before change" + foundEntree);
                return foundEntree;
            }
            foundEntree.setPairedMeal(requestBody.getPairedMeal());//pairedMeal was NOT NULL so moved to this ELSE, which is where we set price
            System.out.println("after change" + foundEntree);
            return foundEntree;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        // throwing exception if no item by id exists
        //TODO: fix from stopping early
    }
    //---------------------------------------------------------------------------------------------------------------------------------
//    public String deleteEntreeById(@PathVariable Integer id) {
//        entreeRepository.deleteById(id);
//        return null;
//    }
    public void deleteEntreeById(@PathVariable Integer id) {
        ArrayList<Entree> entrees = entreeRepository.getAllEntrees(); //getting all entrees from the repo and putting it in arrayList
        entrees.removeIf(entree -> entree.getId().equals(id)); //if the entree id entered matches the id of an entree on our list, remove it
        //removeIf() is an ArrayList method that removes elements that pass through the filter, in this case by id
    }
}
