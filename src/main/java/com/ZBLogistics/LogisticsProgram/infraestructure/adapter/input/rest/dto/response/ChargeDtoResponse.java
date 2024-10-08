package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.response;

import com.ZBLogistics.LogisticsProgram.domain.models.PalletModel;
import com.ZBLogistics.LogisticsProgram.utils.StateOfCharge;

public class ChargeDtoResponse {
    private Long id;
    private Float weight;
    private Float dimensions;
    private StateOfCharge status;
    private PalletModel pallet;

}
