package com.hellofresh.service.impl;

import com.hellofresh.entity.Menu;
import com.hellofresh.repository.MenuRepository;
import com.hellofresh.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuRepository repository;

    @Override
    public void add(List<Menu> menus) {
        repository.saveAll(menus);
    }

    @Override
    public List<Menu> get() {
        return repository.findAll();
    }

    @Override
    public Menu get(long id) {
        return repository.getById(id);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }
}
