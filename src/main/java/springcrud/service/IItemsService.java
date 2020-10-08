package springcrud.service;
import springcrud.model.Item;
import java.util.List;

public interface IItemsService {
    List<Item> findAll();
}
