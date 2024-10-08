package com.ZBLogistics.LogisticsProgram.domain.models;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    private Long id;
    private String name;
    private String password;
    private boolean isEnable;
    private boolean accountNotExpired;
    private boolean accountNoLocked;
    private boolean credentialNoExpired;
    private RoleModel role;
    private Set<ChargeModel> charge;
}
