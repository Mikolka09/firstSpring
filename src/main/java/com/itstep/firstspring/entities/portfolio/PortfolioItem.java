package com.itstep.firstspring.entities.portfolio;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@Table(name="portfolio_items")
public class PortfolioItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name; //Наименование работ
    private String mainImg; //Сссылка на главное изображение
    @Column(columnDefinition="TEXT")
    private String description; //Описание работы
    private Integer price; //Стоимость
    private Integer time; //Затраченое время в часах

    private Date created_at = new Date(); //Дата публикации работы


}
