package com.my.FoodTruckApp.appetizer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class AppetizerService {
    private final AppetizerRepository appetizerRepository;
    public ArrayList<Appetizer> getListOfAppetizers() {
        return appetizerRepository.getListOfAppetizers();
    }

    public Appetizer createAppetizer(AppetizerRequestBody appRequestBody) {
        return appetizerRepository.createAppetizer(appRequestBody);
    }

    public Appetizer getAppById(Integer id) {
        return appetizerRepository.getAppById(id);
    }

    public void deleteAppetizerById(Integer id) {
        appetizerRepository.deleteAppetizerById(id);
    }

}

