package com.sprintr.PruebaTecnicaJDM.service;

import com.sprintr.PruebaTecnicaJDM.model.Item;

import java.util.ArrayList;
import java.util.List;

public interface InterfaceItemService {
    public List<Item> getAllItems();
    public List<Item> getItemById(long id) ;
    public List<Item> getItemByName(String name) ;
    public List<Item> getItemByDescriptionContaining(String desc) ;
    public List<Item> getItemByPrice(Double price) ;
    public void addItem(Item item) ;
    public void deleteItemById(long id) ;
    public void updateItem(Item item);
}
