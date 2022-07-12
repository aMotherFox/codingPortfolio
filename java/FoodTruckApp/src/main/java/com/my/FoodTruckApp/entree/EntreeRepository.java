package com.my.FoodTruckApp.entree;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Arrays;

@Repository
public class EntreeRepository {
    Entree entree1 = new Entree(1, "medium", "spicy", "dinner", 14);
    Entree entree2 = new Entree(2, "large", "sweet", "breakfast", 16);
    ArrayList<Entree> entrees = new ArrayList<>(Arrays.asList(entree1, entree2));

    public ArrayList<Entree> getAllEntrees() {
        return entrees;
    }
}
