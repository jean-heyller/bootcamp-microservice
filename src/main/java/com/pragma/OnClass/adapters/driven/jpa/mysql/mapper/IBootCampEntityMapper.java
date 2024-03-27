package com.pragma.OnClass.adapters.driven.jpa.mysql.mapper;

import com.pragma.OnClass.adapters.driven.jpa.mysql.entity.BootCampEntity;

import com.pragma.OnClass.domain.model.BootCamp;

import org.mapstruct.Mapper;



@Mapper(componentModel = "spring")
public interface IBootCampEntityMapper {
    BootCamp toModel(BootCampEntity bootCampEntity);
    BootCampEntity toEntity(BootCamp bootCamp);
}