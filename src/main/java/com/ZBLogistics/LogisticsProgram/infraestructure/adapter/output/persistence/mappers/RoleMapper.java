package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.mappers;

import com.ZBLogistics.LogisticsProgram.domain.models.RoleModel;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.entities.RoleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleMapper {

    RoleModel toRoleModel(RoleEntity roleEntity);
    RoleEntity toRoleEntity(RoleModel roleModel);

}
