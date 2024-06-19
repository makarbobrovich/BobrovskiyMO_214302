package com.salesviz.repo;

import com.salesviz.model.Orderings;
import com.salesviz.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepo extends JpaRepository<Products, Long> {
}
