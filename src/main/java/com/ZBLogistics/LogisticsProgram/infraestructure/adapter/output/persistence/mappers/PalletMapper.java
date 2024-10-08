package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.mappers;

import com.ZBLogistics.LogisticsProgram.domain.models.PalletModel;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.entities.PalletEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PalletMapper {

    PalletModel toPalletModel(PalletEntity palletEntity);
    PalletEntity toPalletEntity(PalletModel palletModel);
    List<PalletModel> toPalletModelList(List<PalletEntity> palletEntities);

}
