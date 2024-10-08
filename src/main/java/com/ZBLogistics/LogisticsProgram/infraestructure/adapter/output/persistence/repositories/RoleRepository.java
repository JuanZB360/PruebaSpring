package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.repositories;

import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity,Long> {
}
