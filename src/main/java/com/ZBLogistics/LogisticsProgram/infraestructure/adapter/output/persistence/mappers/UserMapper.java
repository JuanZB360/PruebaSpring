package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.mappers;

import com.ZBLogistics.LogisticsProgram.domain.models.UserModel;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserModel toUserModel(UserEntity userEntity);
    UserEntity toUserEntity(UserModel userModel);

}
