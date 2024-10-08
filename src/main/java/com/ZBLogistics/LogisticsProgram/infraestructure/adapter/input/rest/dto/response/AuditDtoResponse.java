package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.response;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuditDtoResponse {
    private Long id;
    private String name;
    private String operation;
    private String user;
    private LocalDateTime date;
}
