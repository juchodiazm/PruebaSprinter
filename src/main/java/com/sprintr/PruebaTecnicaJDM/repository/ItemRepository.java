package com.sprintr.PruebaTecnicaJDM.repository;

import com.sprintr.PruebaTecnicaJDM.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {
    List<Item> findByName(String name);
    List<Item> findByDescriptionContaining(String description);
    List<Item> findByPrice(Double price);
}
