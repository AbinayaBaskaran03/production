package com.production.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.production.entity.Production;

@Repository
public interface ProductionRepository extends JpaRepository<Production , UUID> {


}
