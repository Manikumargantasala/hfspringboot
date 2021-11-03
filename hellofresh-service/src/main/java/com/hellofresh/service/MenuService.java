package com.hellofresh.service;

import com.hellofresh.entity.Menu;

import java.util.List;

public interface MenuService {
    void add(List<Menu> menus);

    List<Menu> get();

    Menu get(long id);

    void delete(long id);
}
