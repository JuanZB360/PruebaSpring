package com.ZBLogistics.LogisticsProgram.domain.models;

import com.ZBLogistics.LogisticsProgram.utils.PermissionsEnum;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PermissionsModel {
    private Long id;
    private PermissionsEnum name;
}
