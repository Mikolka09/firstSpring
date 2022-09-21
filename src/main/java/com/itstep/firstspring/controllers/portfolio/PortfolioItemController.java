package com.itstep.firstspring.controllers.portfolio;

import com.itstep.firstspring.entities.portfolio.PortfolioItem;
import com.itstep.firstspring.repos.portfolio.PortfolioCategoryRepository;
import com.itstep.firstspring.repos.portfolio.PortfolioItemRepository;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class PortfolioItemController {

    private final PortfolioItemRepository portfolioItemRepository;
    private final PortfolioCategoryRepository portfolioCategoryRepository;

    public PortfolioItemController(PortfolioItemRepository portfolioItemRepository, PortfolioCategoryRepository portfolioCategoryRepository) {

        this.portfolioItemRepository = portfolioItemRepository;
        this.portfolioCategoryRepository = portfolioCategoryRepository;
    }

    @GetMapping("/portfolio")
    public String index(Model model) {
        model.addAttribute("portfolios", portfolioItemRepository.findAll());
        return "portfolio/index";

    }

    @GetMapping("/portfolio/create")
    public String create(Model model) {
        model.addAttribute("categories", portfolioCategoryRepository.findAll());
        return "/portfolio/form-create";
    }

    @PostMapping("/portfolio/store")
    public RedirectView store(PortfolioItem portfolio) {
        portfolioItemRepository.save(portfolio);
        return new RedirectView("/portfolio");
    }

    @GetMapping("portfolio/edit/{id}")
    public String edit(Model model, @PathVariable(name = "id") Long id) {

        PortfolioItem p = portfolioItemRepository.findById(id).get();
        model.addAttribute("portfolio", p);
        return "/portfolio/form-update";
    }

    @GetMapping("portfolio/delete/{id}")
    public RedirectView delete(@PathVariable(name = "id") Long id){
        portfolioItemRepository.deleteById(id);
        return new RedirectView("/portfolio");
    }

}
