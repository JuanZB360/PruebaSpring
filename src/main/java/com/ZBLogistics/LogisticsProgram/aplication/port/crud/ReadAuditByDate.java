package com.ZBLogistics.LogisticsProgram.aplication.port.crud;

import com.ZBLogistics.LogisticsProgram.domain.models.AuditModel;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.entities.AuditEntity;

import java.util.List;

public interface ReadAuditByDate <Entity>{
    public List<AuditModel> readAuditByDate (Entity entity);
}
