package com.hellofresh.controller;

import com.hellofresh.entity.Menu;
import com.hellofresh.model.ResponseMessage;
import com.hellofresh.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menus")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @PutMapping(produces = "application/json")
    public ResponseMessage add(@RequestBody List<Menu> menus) {
        menuService.add(menus);
        return new ResponseMessage("Menus added");
    }
    @GetMapping(value = "/{id}")
    public Menu get(@PathVariable("id") long id) {
        return menuService.get(id);
    }

    @GetMapping
    public List<Menu> getAll() {
        return menuService.get();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseMessage deleteById(@PathVariable("id") long id) {
        menuService.delete(id);
        return new ResponseMessage("Menu deleted");
    }

}
