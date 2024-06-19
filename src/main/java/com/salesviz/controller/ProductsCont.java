package com.salesviz.controller;

import com.salesviz.controller.main.Attributes;
import com.salesviz.model.Details;
import com.salesviz.model.Products;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductsCont extends Attributes {

    @GetMapping
    public String products(Model model) {
        AddAttributesProducts(model);
        return "products";
    }

    @GetMapping("/add")
    public String productAdd(Model model) {
        AddAttributes(model);
        return "productAdd";
    }

    @GetMapping("/edit/{id}")
    public String productEdit(Model model, @PathVariable Long id) {
        AddAttributesProductEdit(model, id);
        return "productEdit";
    }

    @GetMapping("/delete/{id}")
    public String productDelete(@PathVariable Long id) {
        productsRepo.deleteById(id);
        return "redirect:/products";
    }

    @PostMapping("/add")
    public String productAdd(@RequestParam String name, @RequestParam int quantity, @RequestParam int price) {
        productsRepo.save(new Products(name, quantity, price));
        return "redirect:/products";
    }

    @PostMapping("/edit/{id}")
    public String productEdit(@RequestParam String name, @RequestParam int quantity, @RequestParam int price, @PathVariable Long id) {
        Products product = productsRepo.getReferenceById(id);
        product.setName(name);
        product.setQuantity(quantity);
        product.setPrice(price);
        productsRepo.save(product);
        return "redirect:/products";
    }
}
