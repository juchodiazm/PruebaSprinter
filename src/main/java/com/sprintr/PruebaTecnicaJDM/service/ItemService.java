package com.sprintr.PruebaTecnicaJDM.service;

import com.sprintr.PruebaTecnicaJDM.model.Item;
import com.sprintr.PruebaTecnicaJDM.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ItemService implements InterfaceItemService{
   @Autowired
    private ItemRepository itemRepository;
    public List<Item> getAllItems() {
        List<Item> items = new ArrayList<Item>();
        itemRepository.findAll().forEach(item->items.add(item));
        return items;
    }

    public List<Item> getItemById(long id) {
        List<Item> items = new ArrayList<Item>();
        //TODO Manejar Optional en todos los returns O devolver el item directamente
        itemRepository.findById(id);
        return items;
    }
    public List<Item> getItemByName(String name) {
        //TODO Manejar Optional en todos los returns O devolver el item directamente

        List<Item> items = new ArrayList<Item>();
        itemRepository.findByName(name);
        return items;
    }
    public List<Item> getItemByDescriptionContaining(String desc) {
        //TODO Manejar Optional en todos los returns O devolver el item directamente

        List<Item> items = new ArrayList<Item>();
        itemRepository.findByDescriptionContaining(desc);
        return items;
    }
    public List<Item> getItemByPrice(Double price) {
        //TODO Manejar Optional en todos los returns O devolver el item directamente

        List<Item> items = new ArrayList<Item>();
        itemRepository.findByPrice(price);
        return items;
    }

    public void addItem(Item item) {
        itemRepository.save(item);
    }
    public void deleteItemById(long id) {
        itemRepository.deleteById(id);
    }
    public void updateItem(Item item){
        itemRepository.save(item);
    }
}
