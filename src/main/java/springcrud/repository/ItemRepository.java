package springcrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springcrud.model.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
}
