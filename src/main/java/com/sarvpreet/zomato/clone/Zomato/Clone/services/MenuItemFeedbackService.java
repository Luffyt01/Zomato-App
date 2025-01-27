package com.sarvpreet.zomato.clone.Zomato.Clone.services;


import com.sarvpreet.zomato.clone.Zomato.Clone.entities.MenuItem;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.MenuItemFeedback;

public interface MenuItemFeedbackService {

    MenuItem giveFeedbackToMenuItem(MenuItemFeedback menuItemFeedback, Integer rating, String review);
}
