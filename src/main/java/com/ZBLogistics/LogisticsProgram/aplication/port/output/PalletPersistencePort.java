package com.ZBLogistics.LogisticsProgram.aplication.port.output;

import com.ZBLogistics.LogisticsProgram.aplication.port.crud.*;
import com.ZBLogistics.LogisticsProgram.domain.models.PalletModel;

public interface PalletPersistencePort extends
        Create<PalletModel>,
        ReadAll<PalletModel>,
        ReadById<PalletModel,Long>,
        Update<PalletModel,Long>,
        Delete<Long> {}
