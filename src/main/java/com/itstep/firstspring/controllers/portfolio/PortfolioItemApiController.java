package com.itstep.firstspring.controllers.portfolio;

import com.itstep.firstspring.entities.portfolio.PortfolioItem;

import com.itstep.firstspring.repos.portfolio.PortfolioItemRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PortfolioItemApiController {

    private final PortfolioItemRepository itemRepository;

    public PortfolioItemApiController(
            PortfolioItemRepository itemRepository
    ) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/api/portfolio")
    public ResponseEntity<List<PortfolioItem>> index(){
        // return itemRepository.findAll();

        List<PortfolioItem> items = new ArrayList<PortfolioItem>();

        itemRepository.findAll().forEach(items::add);

        return new ResponseEntity<>(items, HttpStatus.OK);

    }

}
