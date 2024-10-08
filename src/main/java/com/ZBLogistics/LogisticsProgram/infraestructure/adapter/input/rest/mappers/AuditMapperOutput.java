package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.mappers;

import com.ZBLogistics.LogisticsProgram.domain.models.AuditModel;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.request.AuditDtoRequest;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.response.AuditDtoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuditMapperOutput {

    AuditModel toAuditModel(AuditDtoRequest auditDtoRequest);
    List<AuditDtoResponse> toAuditDtoResponseList(List<AuditModel> auditModel);

}
