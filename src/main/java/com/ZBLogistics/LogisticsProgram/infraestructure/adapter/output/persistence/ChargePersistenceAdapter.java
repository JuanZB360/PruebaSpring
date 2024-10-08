package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence;

import com.ZBLogistics.LogisticsProgram.aplication.port.output.ChargePersistencePort;
import com.ZBLogistics.LogisticsProgram.domain.models.ChargeModel;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.mappers.ChargeMapper;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.repositories.ChargeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ChargePersistenceAdapter implements ChargePersistencePort {

    private ChargeRepository chargeRepository;
    private ChargeMapper chargeMapper;

    @Override
    public List<ChargeModel> readAll() {
        return chargeMapper.toChargeModelList(chargeRepository.findAll());
    }

    @Override
    public ChargeModel readById(Long id) {
        return chargeMapper.toChargeModel(chargeRepository.findById(id).orElseThrow(() -> new RuntimeException("Charge Noy Found")));
    }

    @Override
    public ChargeModel save(ChargeModel entity) {
        return chargeMapper.toChargeModel(chargeRepository.save(chargeMapper.toChargeEntity(entity)));
    }

    @Override
    public ChargeModel update(Long id, ChargeModel chargeModel) {
        if(!chargeRepository.existsById(id)){
            throw new RuntimeException("The Charge Not Exists");
        }
        return chargeMapper.toChargeModel(chargeRepository.save(chargeMapper.toChargeEntity(chargeModel)));
    }

    @Override
    public List<ChargeModel> readChargeByUserId(Long id) {
        return chargeMapper.toChargeModelList(chargeRepository.findChargeEntityByUserId(id));
    }

    @Override
    public List<ChargeModel> readChargeByPalletId(Long id) {
        return chargeMapper.toChargeModelList(chargeRepository.findChargeEntityByPalletId(id));
    }
}
