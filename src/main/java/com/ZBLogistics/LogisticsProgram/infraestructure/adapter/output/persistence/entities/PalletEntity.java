package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.entities;


import com.ZBLogistics.LogisticsProgram.utils.AuditListener;
import com.ZBLogistics.LogisticsProgram.utils.StateOfPallet;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "Pallet")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditListener.class)
public class PalletEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String material;
    @JoinColumn(name = "maximum_Capacity")
    private Float maximumCapacity;
    private String location;
    @Enumerated(EnumType.STRING)
    private StateOfPallet status;
    @JoinColumn(name = "occupied_Weight")
    private Float occupiedWeight;

    @OneToMany(mappedBy = "pallet", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ChargeEntity> charge;

}
