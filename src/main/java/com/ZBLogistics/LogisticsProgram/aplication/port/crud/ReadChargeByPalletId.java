package com.ZBLogistics.LogisticsProgram.aplication.port.crud;

import java.util.List;

public interface ReadChargeByPalletId <Entity, ID>{
    List<Entity> readChargeByPalletId(ID id);
}
