package com.ZBLogistics.LogisticsProgram.aplication.port.crud;

import java.util.List;

public interface ReadChargeByUserId<Entity, ID>{
    List<Entity> readChargeByUserId(ID id);
}
