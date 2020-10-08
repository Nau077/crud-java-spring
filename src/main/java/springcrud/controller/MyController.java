package springcrud.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springcrud.model.Item;
import springcrud.service.IItemsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private IItemsService itemsService;

    @GetMapping(value = "/showItems", consumes = "application/json")
    public ResponseEntity<ItemsListJson> findItems(@RequestBody Model model) {
        var items = itemsService.findAll();

        model.addAttribute("items", items);

        return new ResponseEntity<>(new ItemsListJson(items), HttpStatus.OK);
    }

    /**
     * DTO для описания items
     */
    private static class ItemsListJson {

        @JsonProperty(value = "access_token")
        private final List items;

        private ItemsListJson(List items) {
            this.items = items;
        }
    }
}
