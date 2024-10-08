package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.entities;


import com.ZBLogistics.LogisticsProgram.utils.AuditListener;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "User_Entity")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditListener.class)
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    @JoinColumn(name = "is_Enable")
    private boolean isEnable;
    @JoinColumn(name = "account_Not_Expired")
    private boolean accountNotExpired;
    @JoinColumn(name = "account_Not_Locked")
    private boolean accountNoLocked;
    @JoinColumn(name = "credential_No_Expired")
    private boolean credentialNoExpired;
    @ManyToOne
    @JoinColumn(name = "role")
    private RoleEntity role;
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private Set<ChargeEntity> charge;

}
