package com.ZBLogistics.LogisticsProgram.aplication.port.input;

import com.ZBLogistics.LogisticsProgram.aplication.port.crud.ReadAuditByDate;
import com.ZBLogistics.LogisticsProgram.domain.models.AuditModel;
import org.springframework.stereotype.Service;

public interface AuditServicePort extends
        ReadAuditByDate<AuditModel> {}
