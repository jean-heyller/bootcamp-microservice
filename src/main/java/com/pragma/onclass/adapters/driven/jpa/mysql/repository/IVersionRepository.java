package com.pragma.onclass.adapters.driven.jpa.mysql.repository;

import com.pragma.onclass.adapters.driven.jpa.mysql.entity.BootcampEntity;
import com.pragma.onclass.adapters.driven.jpa.mysql.entity.VersionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

import java.util.Optional;

public interface IVersionRepository extends JpaRepository<VersionEntity, Long> {
   Optional<VersionEntity> findById(Long id);

   VersionEntity findByStartDateAndEndDateAndMaximumQuotaAndBootcamp(LocalDate startDate, LocalDate endDate, Integer maximumQuota, BootcampEntity bootcamp);

}