package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.entities;


import com.ZBLogistics.LogisticsProgram.utils.AuditListener;
import com.ZBLogistics.LogisticsProgram.utils.PermissionsEnum;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Permissions")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditListener.class)
public class PermissionsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private PermissionsEnum name;

}
