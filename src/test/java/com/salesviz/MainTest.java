package com.salesviz;

import com.salesviz.repo.DetailsRepo;
import com.salesviz.repo.OrderingsRepo;
import com.salesviz.repo.ProductsRepo;
import com.salesviz.repo.StatsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MainTest {

    @Autowired
    private DetailsRepo detailsRepo;
    @Autowired
    private OrderingsRepo orderingsRepo;
    @Autowired
    private ProductsRepo productsRepo;
    @Autowired
    private StatsRepo statsRepo;




}
