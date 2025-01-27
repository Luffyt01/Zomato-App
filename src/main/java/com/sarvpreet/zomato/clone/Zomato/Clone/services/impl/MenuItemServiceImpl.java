package com.sarvpreet.zomato.clone.Zomato.Clone.services.impl;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Menu;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.MenuItem;
import com.sarvpreet.zomato.clone.Zomato.Clone.services.MenuItemService;
import org.springframework.stereotype.Service;

@Service
public class MenuItemServiceImpl implements MenuItemService {
    @Override
    public MenuItem addNewItemToMenu(MenuItem menuItem, Menu menu) {
        return null;
    }

    @Override
    public void deleteItemFromMenu(Long menuItemId, Menu menu) {

    }

    @Override
    public MenuItem updateItemInMenu(MenuItem menuItem, Menu menu) {
        return null;
    }

    @Override
    public MenuItem updateMenuItemAvailabilityStatus(MenuItem menuItem, Boolean status) {
        return null;
    }

    @Override
    public MenuItem getMenuItemById(Long menuItemId) {
        return null;
    }
}
