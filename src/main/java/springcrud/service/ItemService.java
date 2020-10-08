package springcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springcrud.model.Item;
import springcrud.repository.ItemRepository;

import java.util.List;

@Service
public class ItemService implements IItemsService{
    @Autowired
    private ItemRepository repository;

    @Override
    public List<Item> findAll() {
        var items = (List<Item>) repository.findAll();
        return items;
    }
}
