package com.salesviz.repo;

import com.salesviz.model.Orderings;
import com.salesviz.model.enums.Status;
import org.hibernate.criterion.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderingsRepo extends JpaRepository<Orderings, Long> {
    List<Orderings> findAllByOwner_IdAndStatus(Long id, Status status);

    List<Orderings> findAllByStatus(Status status);

    List<Orderings> findAllByManager_IdAndStatus(Long id, Status status);

    List<Orderings> findAllByManager_Id(Long id);
}
