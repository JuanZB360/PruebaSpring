package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.response;

import com.ZBLogistics.LogisticsProgram.domain.models.ChargeModel;
import com.ZBLogistics.LogisticsProgram.utils.StateOfPallet;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PalletDtoResponse {

    private Long id;
    private String material;
    private Float maximumCapacity;
    private String location;
    private StateOfPallet status;
    private Float occupiedWeight;
    private List<ChargeModel> charge;

}
