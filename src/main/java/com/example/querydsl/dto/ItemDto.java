package com.example.querydsl.dto;

import com.example.querydsl.entity.Item;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ItemDto { // QuerydslProjTests의 Tuple을 Dto로 바꾸기 위한 실습
    private String name;
    private Integer cost;
    private Integer stock;
    private Integer totalCost;

    public ItemDto( // @AllArgsConstructor
            String name,
            Integer cost,
            Integer stock
    ) {
        this.name = name;
        this.cost = cost;
        this.stock = stock;
    }

    public static ItemDto fromEntity(Item entity) {
        return new ItemDto(
                entity.getName(),
                entity.getPrice(),
                entity.getStock()
        );
    }
}
