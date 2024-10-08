package com.ZBLogistics.LogisticsProgram.domain.models;

import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.entities.PalletEntity;
import com.ZBLogistics.LogisticsProgram.utils.StateOfCharge;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChargeModel {
    private Long id;
    private Float weight;
    private Float dimensions;
    private StateOfCharge status;
    private PalletModel pallet;
    private UserModel user;
}
