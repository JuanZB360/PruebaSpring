package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.entities;


import com.ZBLogistics.LogisticsProgram.utils.AuditListener;
import com.ZBLogistics.LogisticsProgram.utils.StateOfCharge;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Charge")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditListener.class)
public class ChargeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Float weight;
    private Float dimensions;
    @Enumerated(EnumType.STRING)
    private StateOfCharge status;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private PalletEntity pallet;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private UserEntity user;

}
