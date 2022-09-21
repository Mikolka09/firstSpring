package com.itstep.firstspring.entities.portfolio;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name="portfolio_items")
public class PortfolioItem {

    //One to Many
    @ManyToOne
    @JoinColumn(name = "category_id")
    private PortfolioCategory portfolioCategory;

    //--------------------------------------------------------------
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

    @CreationTimestamp
    private Date created_at; //Дата публикации работы


}
