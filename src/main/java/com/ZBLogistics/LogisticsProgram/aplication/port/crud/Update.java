package com.ZBLogistics.LogisticsProgram.aplication.port.crud;

public interface Update <Entity, ID>{
    public Entity update(ID id,Entity entity);
}
