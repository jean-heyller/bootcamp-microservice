package com.pragma.OnClass.adapters.driving.http.controller;
import com.pragma.OnClass.adapters.driving.http.dto.request.AddTechnologyRequest;
import com.pragma.OnClass.adapters.driving.http.dto.response.TechnologyResponse;
import com.pragma.OnClass.adapters.driving.http.mapper.ITechnologyRequestMapper;
import com.pragma.OnClass.adapters.driving.http.mapper.ITechnologyResponseMapper;
import com.pragma.OnClass.domain.api.ITechnologyServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/technology")
@RequiredArgsConstructor
@Validated
public class TechnologyRestControllerApdapter {
    private final ITechnologyServicePort technologyServicePort;
    private final ITechnologyRequestMapper technologyRequestMapper;

    private final ITechnologyResponseMapper technologyResponseMapper;

    @PostMapping("/")
    public ResponseEntity<Void>  addTechnology(@Valid @RequestBody AddTechnologyRequest request){
        technologyServicePort.saveTechnology(technologyRequestMapper.addRequestToTechnology(request));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/")
    public ResponseEntity<List<TechnologyResponse>> getAllTechnologies(@RequestParam Integer page, @RequestParam Integer size){
        return ResponseEntity.ok(technologyResponseMapper.
                toTechnologyResponseList(technologyServicePort.getAllTechnology(page, size)));
    }
    @GetMapping("search/{technologyName}")
    public ResponseEntity<TechnologyResponse> getTechnology(@PathVariable String technologyName){
        return ResponseEntity.ok(technologyResponseMapper.
                toTechnologyResponse(technologyServicePort.getTechnology(technologyName)));
    }

}
