package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.request;

import com.ZBLogistics.LogisticsProgram.utils.StateOfPallet;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PalletUpdateStatus {
    private StateOfPallet stateOfPallet;
}
