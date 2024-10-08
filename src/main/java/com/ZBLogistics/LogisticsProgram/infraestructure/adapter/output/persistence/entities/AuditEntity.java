package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Audit")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String operation;
    private String user;
    private LocalDateTime date;

}
