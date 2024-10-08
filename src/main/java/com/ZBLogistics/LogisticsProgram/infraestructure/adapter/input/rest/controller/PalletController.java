package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.controller;

import com.ZBLogistics.LogisticsProgram.aplication.port.input.PalletServicePort;
import com.ZBLogistics.LogisticsProgram.domain.models.PalletModel;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.request.PalletDtoRequest;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.request.PalletUpdateStatus;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.dto.response.PalletDtoResponse;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.input.rest.mappers.PalletMapperOutput;

import com.ZBLogistics.LogisticsProgram.utils.StateOfPallet;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class PalletController {

    private PalletServicePort palletServicePort;
    private PalletMapperOutput palletMapper;

    @GetMapping("/api/pallets")
    public ResponseEntity<List<PalletDtoResponse>> readAll(){
        return ResponseEntity.status(HttpStatus.OK).body(palletMapper.toPalletDtoResponseList(palletServicePort.readAll()));
    }

    @GetMapping("/api/pallets/{id}")
    public ResponseEntity<PalletDtoResponse> readById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(palletMapper.toPalletDtoResponse(palletServicePort.readById(id)));
    }

    @PostMapping("/api/pallets")
    public ResponseEntity<PalletDtoResponse> create(@RequestBody PalletDtoRequest pallet){
        return ResponseEntity.status(HttpStatus.CREATED).body(palletMapper.toPalletDtoResponse(palletServicePort.save(palletMapper.toPalletModel(pallet))));
    }

    @PutMapping("/api/pallets/{id}")
    public ResponseEntity<PalletDtoResponse> update(@RequestBody PalletDtoRequest pallet, @PathVariable Long id){
        return ResponseEntity.status(HttpStatus.CREATED).body(palletMapper.toPalletDtoResponse(palletServicePort.update(id,palletMapper.toPalletModel(pallet))));
    }

    @DeleteMapping("/api/pallets/{id} ")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(palletServicePort.deletebyId(id));
    }

    @PatchMapping("/api/loads/{id}/damage")
    public ResponseEntity<PalletDtoResponse> updatePalletStatus( @PathVariable Long id){
        PalletUpdateStatus palletUpdateStatus = new PalletUpdateStatus(StateOfPallet.valueOf("DAMAGED"));
        return ResponseEntity.status(HttpStatus.CREATED).body(palletMapper.toPalletDtoResponse(palletServicePort.update(id,palletMapper.toPalletModelUpdateStatus(palletUpdateStatus))));
    }


}
