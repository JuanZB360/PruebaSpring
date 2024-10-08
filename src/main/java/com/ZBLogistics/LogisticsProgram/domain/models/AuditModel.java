package com.ZBLogistics.LogisticsProgram.domain.models;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuditModel {
    private Long id;
    private String name;
    private String operation;
    private String user;
    private LocalDateTime date;
}
