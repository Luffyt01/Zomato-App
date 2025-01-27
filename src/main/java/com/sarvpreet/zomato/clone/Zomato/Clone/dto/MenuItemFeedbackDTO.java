package com.sarvpreet.zomato.clone.Zomato.Clone.dto;


import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Feedback;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.MenuItem;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemFeedbackDTO {

    private Long id;
    private Integer menuItemRating;
    private String menuItemReview;
    private MenuItemDTO menuItem;
    private FeedbackDTO feedback;
}
