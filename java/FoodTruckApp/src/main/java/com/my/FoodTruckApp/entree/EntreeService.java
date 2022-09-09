package com.my.FoodTruckApp.entree;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class EntreeService {

    private final EntreeRepository entreeRepository;

    public ArrayList<Entree> getListOfEntrees() {
        return entreeRepository.getListOfEntrees();
    }

    public Entree createEntree(EntreeRequestBody entreeRequestBody) {
        return entreeRepository.createEntree(entreeRequestBody);
    }

    public Entree getEntreeById(Integer id) {
        return entreeRepository.getEntreeById(id);
    }

    public void deleteEntreeById(Integer id) {
        entreeRepository.deleteEntreeById(id);
    }

}
