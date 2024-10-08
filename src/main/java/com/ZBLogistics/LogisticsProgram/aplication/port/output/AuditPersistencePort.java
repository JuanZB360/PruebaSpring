package com.ZBLogistics.LogisticsProgram.aplication.port.output;

import com.ZBLogistics.LogisticsProgram.aplication.port.crud.ReadAuditByDate;
import com.ZBLogistics.LogisticsProgram.domain.models.AuditModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

public interface AuditPersistencePort extends
        ReadAuditByDate<AuditModel> {}
