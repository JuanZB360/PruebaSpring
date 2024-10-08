package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.repositories;

import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.entities.PermissionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionsRepository extends JpaRepository<PermissionsEntity,Long> {
}
