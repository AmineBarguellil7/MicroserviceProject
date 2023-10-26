package controller;

import entity.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.StoreRepo;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {
    @Autowired
    StoreRepo storeRepo;


    @PostMapping("/addStore")
    public Store addStore(@RequestBody Store store) {
        return storeRepo.save(store);
    }

    @GetMapping("")
    public List<Store> ListStores () {
        return storeRepo.findAll();
    }

    @GetMapping("/{id}")
    public Store storeById (@PathVariable Integer id) {
        return storeRepo.findById(id).orElse(null);
    }


    @PutMapping("/updatestore")
    public Store updateStore(@RequestBody Store store) {
        return storeRepo.save(store);
    }

    @DeleteMapping("/{id}")
    public void deleteStore (@PathVariable Integer id) {
        if (storeRepo.findById(id).isPresent())
            storeRepo.deleteById(id);
    }

}
