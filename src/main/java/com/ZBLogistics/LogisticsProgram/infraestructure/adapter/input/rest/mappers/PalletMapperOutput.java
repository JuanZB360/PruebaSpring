package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.mappers;

import com.ZBLogistics.LogisticsProgram.domain.models.PalletModel;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.request.PalletDtoRequest;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.request.PalletUpdateStatus;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.response.PalletDtoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PalletMapperOutput {

    PalletModel toPalletModel(PalletDtoRequest palletDtoRequest);
    PalletDtoResponse toPalletDtoResponse(PalletModel palletModel);
    PalletModel toPalletModelUpdateStatus(PalletUpdateStatus palletUpdateStatus);
    List<PalletDtoResponse> toPalletDtoResponseList(List<PalletModel> palletModelList);

}
