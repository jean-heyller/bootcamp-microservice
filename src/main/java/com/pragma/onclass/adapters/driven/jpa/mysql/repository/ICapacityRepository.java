package com.pragma.onclass.adapters.driven.jpa.mysql.repository;

import com.pragma.onclass.adapters.driven.jpa.mysql.entity.CapacityEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICapacityRepository extends JpaRepository<CapacityEntity,Long> {
    Optional<CapacityEntity> findByName(String name);

    Optional<CapacityEntity> findById(Long id);

    Page<CapacityEntity> findAll(Pageable pageable);

}
