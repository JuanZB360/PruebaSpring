package com.ZBLogistics.LogisticsProgram.domain.models;

import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.entities.PermissionsEntity;
import com.ZBLogistics.LogisticsProgram.utils.RoleEnum;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoleModel {
    private Long id;
    private RoleEnum name;
    private Set<PermissionsModel> permission;
}
