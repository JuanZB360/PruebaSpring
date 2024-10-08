package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.mappers;

import com.ZBLogistics.LogisticsProgram.domain.models.PermissionsModel;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.entities.PermissionsEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PermissionsMapper {

    PermissionsModel toPermissionsModel(PermissionsEntity permissionsEntity);
    PermissionsEntity toPermissionsEntity(PermissionsModel permissionsModel);

}
