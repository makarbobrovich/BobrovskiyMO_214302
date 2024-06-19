package com.salesviz.controller.main;

import com.salesviz.model.Users;
import com.salesviz.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class Main {
    @Autowired
    protected UsersRepo usersRepo;
    @Autowired
    protected OrderingsRepo orderingsRepo;
    @Autowired
    protected ProductsRepo productsRepo;
    @Autowired
    protected StatsRepo statsRepo;
    @Autowired
    protected DetailsRepo detailsRepo;

    protected Users getUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if ((!(auth instanceof AnonymousAuthenticationToken)) && auth != null) {
            UserDetails userDetail = (UserDetails) auth.getPrincipal();
            return usersRepo.findByUsername(userDetail.getUsername());
        }
        return null;
    }

    protected String getRole() {
        Users users = getUser();
        if (users == null) return "NOT";
        return users.getRole().toString();
    }
}