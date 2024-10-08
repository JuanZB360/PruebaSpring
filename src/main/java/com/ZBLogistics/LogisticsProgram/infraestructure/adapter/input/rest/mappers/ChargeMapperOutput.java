package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.mappers;

import com.ZBLogistics.LogisticsProgram.domain.models.ChargeModel;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.request.ChargeDtoRequest;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.request.ChargeDtoUpdateState;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.response.ChargeDtoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ChargeMapperOutput {

    ChargeModel toChargeModel(ChargeDtoRequest chargeDtoRequet);
    ChargeDtoResponse toChargeDtoResponse(ChargeModel chargeModel);
    List<ChargeDtoResponse> toChargeDtoResponseList(List<ChargeModel> chargeModels);
    ChargeModel toChargeModelUpdateState(ChargeDtoUpdateState chargeDtoUpdateState);
}
