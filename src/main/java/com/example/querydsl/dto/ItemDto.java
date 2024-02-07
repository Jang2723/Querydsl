package com.example.querydsl.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
public class ItemDto { // QuerydslProjTests의 Tuple을 Dto로 바꾸기 위한 실습
    private String name;
    private Integer cost;
    private Integer stock;
    private Integer totalCost;

    public ItemDto( // @AllArgsConstructor
            Integer cost,
            String name,
            Integer stock
    ) {
        this.name = name;
        this.cost = cost;
        this.stock = stock;
        this.totalCost = cost * stock;
    }
}
