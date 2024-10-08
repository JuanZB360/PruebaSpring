package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.request;

import com.ZBLogistics.LogisticsProgram.domain.models.ChargeModel;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PalletDtoRequest {
    private Long id;
    private String material;
    private Float maximumCapacity;
    private String location;
    private Float occupiedWeight;
    private List<ChargeModel> charge;
}
