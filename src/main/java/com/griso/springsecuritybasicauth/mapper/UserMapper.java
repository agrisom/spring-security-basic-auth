package com.griso.springsecuritybasicauth.mapper;

import com.griso.springsecuritybasicauth.dto.UserDto;
import com.griso.springsecuritybasicauth.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

}
