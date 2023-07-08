package com.gassion.onlinestoremagazine.repository;

import com.gassion.onlinestoremagazine.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Long, Product> {
}
