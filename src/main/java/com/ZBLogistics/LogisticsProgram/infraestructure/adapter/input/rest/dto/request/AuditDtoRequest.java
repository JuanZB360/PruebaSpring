package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.request;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuditDtoRequest {
    private LocalDateTime date;
}
