package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.entities;

import com.ZBLogistics.LogisticsProgram.utils.AuditListener;
import com.ZBLogistics.LogisticsProgram.utils.RoleEnum;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "Roles")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditListener.class)
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private RoleEnum name;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "role_Permission", joinColumns = @JoinColumn(name = "role_Id"), inverseJoinColumns = @JoinColumn(name = "permission_Id"))
    private Set<PermissionsEntity> permission;

}
