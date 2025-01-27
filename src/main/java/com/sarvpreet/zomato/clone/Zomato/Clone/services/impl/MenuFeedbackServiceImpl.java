package com.sarvpreet.zomato.clone.Zomato.Clone.services.impl;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.MenuItem;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.MenuItemFeedback;
import com.sarvpreet.zomato.clone.Zomato.Clone.services.MenuItemFeedbackService;
import org.springframework.stereotype.Service;

@Service
public class MenuFeedbackServiceImpl implements MenuItemFeedbackService {
    @Override
    public MenuItem giveFeedbackToMenuItem(MenuItemFeedback menuItemFeedback, Integer rating, String review) {
        return null;
    }
}
