package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence;

import com.ZBLogistics.LogisticsProgram.aplication.port.output.AuditPersistencePort;
import com.ZBLogistics.LogisticsProgram.domain.models.AuditModel;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.mappers.AuditMapper;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.repositories.AuditRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AuditPersistenceAdapter implements AuditPersistencePort {

    private AuditRepository auditRepository;
    private AuditMapper auditMapper;

    @Override
    public List<AuditModel> readAuditByDate(AuditModel auditModel) {
        return auditMapper.toAuditModelList(auditRepository.findAuditEntityByDate(auditModel.getDate()));
    }
}
