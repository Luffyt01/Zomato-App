package com.sarvpreet.zomato.clone.Zomato.Clone.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SimpleFeedbackDTO {
    private String review;
    private Integer rating;
}
