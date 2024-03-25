package com.pragma.OnClass.adapters.driven.jpa.mysql.mapper;

import com.pragma.OnClass.adapters.driven.jpa.mysql.entity.CapacityEntity;
import com.pragma.OnClass.domain.model.Capacity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICapacityEntityMapper {
    Capacity toModel(CapacityEntity capacityEntity);
    CapacityEntity toEntity(Capacity capacity);
}