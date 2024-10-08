package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.mappers;

import com.ZBLogistics.LogisticsProgram.domain.models.AuditModel;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.entities.AuditEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuditMapper {

    List<AuditModel> toAuditModelList(List<AuditEntity> auditEntities);
}
