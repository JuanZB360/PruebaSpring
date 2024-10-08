package com.ZBLogistics.LogisticsProgram.aplication.port.crud;

public interface ReadById<Entity, ID>{
    public Entity readById(ID id);
}
