package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.repositories;

import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.entities.PalletEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PalletRepository extends JpaRepository<PalletEntity,Long> {
}
