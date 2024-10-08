package com.ZBLogistics.LogisticsProgram.aplication.port.input;

import com.ZBLogistics.LogisticsProgram.aplication.port.crud.*;
import com.ZBLogistics.LogisticsProgram.domain.models.PalletModel;

public interface PalletServicePort extends
        Create<PalletModel>,
        ReadAll<PalletModel>,
        ReadById<PalletModel, Long>,
        Update<PalletModel,Long>,
        Delete<Long> {}
