package com.ZBLogistics.LogisticsProgram.aplication.service;

import com.ZBLogistics.LogisticsProgram.aplication.port.input.AuditServicePort;
import com.ZBLogistics.LogisticsProgram.aplication.port.output.AuditPersistencePort;
import com.ZBLogistics.LogisticsProgram.domain.models.AuditModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuditService implements AuditServicePort {

    private AuditPersistencePort auditPersistencePort;

    @Override
    public List<AuditModel> readAuditByDate(AuditModel auditModel) {
        return auditPersistencePort.readAuditByDate(auditModel);
    }
}
