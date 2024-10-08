package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.request;

import com.ZBLogistics.LogisticsProgram.domain.models.PalletModel;
import com.ZBLogistics.LogisticsProgram.utils.StateOfCharge;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChargeDtoUpdate {
    private Long id;
    private Float weight;
    private Float dimensions;
    private StateOfCharge status;
    private PalletModel pallet;
    private UserDtoAssign user;
}
