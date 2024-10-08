package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.request;

import com.ZBLogistics.LogisticsProgram.utils.StateOfCharge;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChargeDtoUpdateState {
    private Long id;
    private StateOfCharge status;
}
