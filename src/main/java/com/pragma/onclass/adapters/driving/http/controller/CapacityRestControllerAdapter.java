package com.pragma.onclass.adapters.driving.http.controller;
import com.pragma.onclass.adapters.driving.http.dto.request.AddCapacityRequest;
import com.pragma.onclass.adapters.driving.http.dto.response.CapacityResponse;
import com.pragma.onclass.adapters.driving.http.mapper.ICapacityRequestMapper;

import com.pragma.onclass.adapters.driving.http.mapper.ICapacityResponseMapper;
import com.pragma.onclass.domain.api.ICapacityServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/capacity")
@RequiredArgsConstructor
@Validated
public class CapacityRestControllerAdapter {
    private final ICapacityServicePort capacityServicePort;
    private final ICapacityRequestMapper capacityRequestMapper;

    private final ICapacityResponseMapper capacityResponseMapper;

    @PostMapping("/")
    public ResponseEntity<Void> addCapacity(@Valid @RequestBody AddCapacityRequest request){
        capacityServicePort.saveCapacity(capacityRequestMapper.addRequestToCapacity(request));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @GetMapping("/")
    public ResponseEntity<List<CapacityResponse>> getAllCapacities(@RequestParam Integer page, @RequestParam Integer size, @RequestParam(defaultValue = "true")  boolean isAscName,
                                                                   @RequestParam(defaultValue = "true")  boolean isAscTechnology) {
        return ResponseEntity.ok(capacityResponseMapper.toCapacityResponseList(capacityServicePort.getAllCapacities(page, size, isAscName, isAscTechnology)));
    }

}
