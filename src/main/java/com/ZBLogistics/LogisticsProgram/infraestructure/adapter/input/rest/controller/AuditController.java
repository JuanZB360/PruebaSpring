package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.controller;

import com.ZBLogistics.LogisticsProgram.aplication.port.input.AuditServicePort;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.request.AuditDtoRequest;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.response.AuditDtoResponse;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.mappers.AuditMapperOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/audit-logs")
@RequiredArgsConstructor
public class AuditController {

    private AuditServicePort auditServicePort;
    private AuditMapperOutput auditMapperOutput;

    @GetMapping
    public ResponseEntity<List<AuditDtoResponse>> readAuditByDate(@RequestBody AuditDtoRequest auditDto){
        return ResponseEntity.status(HttpStatus.OK).body(auditMapperOutput.toAuditDtoResponseList(auditServicePort.readAuditByDate(auditMapperOutput.toAuditModel(auditDto))));
    }
}
