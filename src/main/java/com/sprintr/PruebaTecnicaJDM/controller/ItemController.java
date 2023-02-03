package com.sprintr.PruebaTecnicaJDM.controller;

import com.sprintr.PruebaTecnicaJDM.model.Item;
import com.sprintr.PruebaTecnicaJDM.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sprintr")
public class ItemController {

    @Autowired
    ItemService itemService;
@GetMapping("/items")
    public ResponseEntity<List<Item>> getAllItems(){
        return new ResponseEntity<>(itemService.getAllItems(), HttpStatus.OK);
    }

    @GetMapping("/items/item/{id}")
    public ResponseEntity<List<Item>> getItemById(@PathVariable long id){
        return new ResponseEntity<>(itemService.getItemById(id), HttpStatus.OK);
    }

    @GetMapping("/items/item/name/{name}")
    public ResponseEntity<List<Item>> getItemByName(@PathVariable String name){
        return new ResponseEntity<>(itemService.getItemByName(name), HttpStatus.OK);
    }
    @GetMapping("/items/item/desc/{desc}")
    public ResponseEntity<List<Item>> getItemByDescriptionContaining(@PathVariable String desc){
        return new ResponseEntity<>(itemService.getItemByDescriptionContaining(desc), HttpStatus.OK);
    }
    @GetMapping("/items/item/price/{price}")
    public ResponseEntity<List<Item>> getItemByPrice(@PathVariable Double price){
        return new ResponseEntity<>(itemService.getItemByPrice(price), HttpStatus.OK);
    }
    @PostMapping("/items/item")
    public void addItem(@RequestBody Item item){
        itemService.addItem(item);
    }
    @DeleteMapping("/items/item/{id}")
    public void deleteItemById(@PathVariable long id){
        itemService.deleteItemById(id);
    }
    @PutMapping("/items/item")
    public void updateItem(@RequestBody Item item){
        itemService.updateItem(item);
    }
}
