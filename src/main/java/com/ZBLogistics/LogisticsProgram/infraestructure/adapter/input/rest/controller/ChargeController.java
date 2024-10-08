package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.controller;

import com.ZBLogistics.LogisticsProgram.aplication.port.input.ChargeServicePort;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.request.ChargeDtoRequest;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.request.ChargeDtoUpdateState;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.request.UserDtoAssign;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.response.ChargeDtoResponse;

import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.mappers.ChargeMapperOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ChargeController {

    private ChargeServicePort chargeServicePort;
    private ChargeMapperOutput chargeMapper;

    @GetMapping("/api/loads")
    public ResponseEntity<List<ChargeDtoResponse>> readAll(){
        return ResponseEntity.status(HttpStatus.OK).body(chargeMapper.toChargeDtoResponseList(chargeServicePort.readAll()));
    }

    @GetMapping("/api/loads/{id}")
    public ResponseEntity<ChargeDtoResponse> readById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(chargeMapper.toChargeDtoResponse(chargeServicePort.readById(id)));
    }

    @PostMapping("/api/loads")
    public ResponseEntity<ChargeDtoResponse> create(@RequestBody ChargeDtoRequest chargeDtoRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(chargeMapper.toChargeDtoResponse(chargeServicePort.save(chargeMapper.toChargeModel(chargeDtoRequest))));
    }

    @PutMapping("/api/loads/{id}")
    public ResponseEntity<ChargeDtoResponse> update(@RequestBody ChargeDtoRequest chargeDtoRequest, @PathVariable Long id){
        return ResponseEntity.status(HttpStatus.CREATED).body(chargeMapper.toChargeDtoResponse(chargeServicePort.update(id, chargeMapper.toChargeModel(chargeDtoRequest))));
    }

    @PatchMapping("/api/loads/{id}/status")
    public ResponseEntity<ChargeDtoResponse> updateState(@RequestBody ChargeDtoUpdateState chargeDtoUpdateState, @PathVariable Long id){
        return ResponseEntity.status(HttpStatus.CREATED).body(chargeMapper.toChargeDtoResponse(chargeServicePort.update(id, chargeMapper.toChargeModelUpdateState(chargeDtoUpdateState))));
    }

    @GetMapping("/api/carriers/loads")
    public ResponseEntity<List<ChargeDtoResponse>> readChargeByUserId(@RequestBody UserDtoAssign userDtoAssign){
        Long id = userDtoAssign.getId();
        return ResponseEntity.status(HttpStatus.OK).body(chargeMapper.toChargeDtoResponseList(chargeServicePort.readChargeByUserId(id)));
    }

    @GetMapping("/api/pallets/{id}/loads")
    public ResponseEntity<List<ChargeDtoResponse>> readChargeByPalletId (@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(chargeMapper.toChargeDtoResponseList(chargeServicePort.readChargeByPalletId(id)));
    }
}
