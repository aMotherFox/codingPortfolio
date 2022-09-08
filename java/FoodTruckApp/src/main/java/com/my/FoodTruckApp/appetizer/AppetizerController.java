package com.my.FoodTruckApp.appetizer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
public class AppetizerController {

    private final AppetizerService appetizerService;

    @GetMapping("/appetizers")
    public ArrayList<Appetizer> getListOfAppetizers() {
        return appetizerService.getListOfAppetizers();
    }

    @PostMapping("/appetizers")
    public Appetizer createAppetizer(@RequestBody AppetizerRequestBody appRequestBody) {
        return appetizerService.createAppetizer(appRequestBody);
    }

    @GetMapping("/appetizers/{id}")
    public Appetizer getAppById(@PathVariable Integer id) {
        return appetizerService.getAppById(id);
    }

    @DeleteMapping("/appetizers/{id}")
    public void deleteAppetizerById(@PathVariable Integer id) {
        appetizerService.deleteAppetizerById(id);
    }
}
