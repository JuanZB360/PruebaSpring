package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.repositories;

import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.entities.ChargeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChargeRepository extends JpaRepository<ChargeEntity,Long> {
    @Query("SELECT c FROM ChargeEntity c JOIN c.user u WHERE u.id = :id")
    List<ChargeEntity> findChargeEntityByUserId(@Param("id") Long id);

    @Query("SELECT c FROM ChargeEntity c JOIN c.pallet p WHERE p.id = :id")
    List<ChargeEntity> findChargeEntityByPalletId(@Param("id") Long id);
}
