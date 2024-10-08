package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChargeDtoRequest {
    private Long id;
    private Float weight;
    private Float dimensions;
    private PalletDtoCharge pallet;
    private UserDtoAssign user;
}
