package springcrud.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
@Setter
@Getter
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String comment;

    public Item() {
    }

    public Item(Long id, String name, String comment) {

        this.id = id;
        this.name = name;
        this.comment = comment;
    }




}