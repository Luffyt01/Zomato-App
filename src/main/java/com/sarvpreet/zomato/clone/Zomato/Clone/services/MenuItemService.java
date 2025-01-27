package com.sarvpreet.zomato.clone.Zomato.Clone.services;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Menu;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.MenuItem;

public interface MenuItemService {

    MenuItem addNewItemToMenu(MenuItem menuItem, Menu menu);

    void deleteItemFromMenu(Long menuItemId, Menu menu);

    MenuItem updateItemInMenu(MenuItem menuItem, Menu menu);

    MenuItem updateMenuItemAvailabilityStatus(MenuItem menuItem, Boolean status);

    MenuItem getMenuItemById(Long menuItemId);
}
