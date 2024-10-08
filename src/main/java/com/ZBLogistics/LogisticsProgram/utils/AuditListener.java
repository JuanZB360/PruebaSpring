package com.ZBLogistics.LogisticsProgram.utils;

import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.entities.AuditEntity;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.repositories.AuditRepository;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreRemove;
import jakarta.persistence.PreUpdate;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class AuditListener<T> {
    @Lazy
    private AuditRepository auditRepository;

    @PrePersist
    public void prePersist(T entity){
        //String user = SecurityContextHolder().getContext().getAuthentication();
        AuditEntity auditEntity = new AuditEntity();
        auditEntity.setName(entity.getClass().getName());
        auditEntity.setOperation("CREATE");
        //auditEntity.setUser(user);
        auditEntity.setDate(LocalDateTime.now());
        auditRepository.save(auditEntity);
    }

    @PreUpdate
    public void preUpdate(T entity){
        //String user = SecurityContextHolder().getContext().getAuthentication();
        AuditEntity auditEntity = new AuditEntity();
        auditEntity.setName(entity.getClass().getName());
        auditEntity.setOperation("UPDATE");
        //auditEntity.setUser(user);
        auditEntity.setDate(LocalDateTime.now());
        auditRepository.save(auditEntity);
    }

    @PreRemove
    public void preRemove (T entity){
        AuditEntity auditEntity = new AuditEntity();
        auditEntity.setName(entity.getClass().getName());
        auditEntity.setOperation("DELETE");
        //auditEntity.setUser(user);
        auditEntity.setDate(LocalDateTime.now());
        auditRepository.save(auditEntity);
    }

}
