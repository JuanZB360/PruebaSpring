package com.ZBLogistics.LogisticsProgram.domain.models;

import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.entities.ChargeEntity;
import com.ZBLogistics.LogisticsProgram.utils.StateOfPallet;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PalletModel {
    private Long id;
    private String material;
    private Float maximumCapacity;
    private String location;
    private StateOfPallet status;
    private Float occupiedWeight;
    private List<ChargeModel> charge;
}
