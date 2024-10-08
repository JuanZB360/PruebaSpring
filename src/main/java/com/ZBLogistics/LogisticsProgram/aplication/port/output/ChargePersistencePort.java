package com.ZBLogistics.LogisticsProgram.aplication.port.output;

import com.ZBLogistics.LogisticsProgram.aplication.port.crud.*;
import com.ZBLogistics.LogisticsProgram.domain.models.ChargeModel;

public interface ChargePersistencePort extends
        ReadAll<ChargeModel>,
        ReadById<ChargeModel, Long>,
        Create<ChargeModel>,
        Update<ChargeModel,Long>,
        ReadChargeByUserId<ChargeModel, Long>,
        ReadChargeByPalletId<ChargeModel, Long> {}
