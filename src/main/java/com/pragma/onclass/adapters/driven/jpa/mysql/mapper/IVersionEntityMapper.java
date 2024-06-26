package com.pragma.onclass.adapters.driven.jpa.mysql.mapper;


import com.pragma.onclass.adapters.driven.jpa.mysql.entity.VersionEntity;

import com.pragma.onclass.domain.model.Version;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface IVersionEntityMapper {


    Version toModel(VersionEntity versionEntity);


    VersionEntity toEntity(Version version);

    List<Version> toModelList(List<VersionEntity> versionEntities);




}