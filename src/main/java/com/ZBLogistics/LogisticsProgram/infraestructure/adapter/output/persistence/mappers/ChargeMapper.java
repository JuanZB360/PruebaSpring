package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.mappers;

import com.ZBLogistics.LogisticsProgram.domain.models.ChargeModel;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.entities.ChargeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ChargeMapper {

    ChargeModel toChargeModel(ChargeEntity chargeEntity);
    ChargeEntity toChargeEntity(ChargeModel chargeModel);
    List<ChargeModel> toChargeModelList(List<ChargeEntity> ChargeList);

}
