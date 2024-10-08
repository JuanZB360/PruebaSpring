package com.ZBLogistics.LogisticsProgram.aplication.service;

import com.ZBLogistics.LogisticsProgram.aplication.port.input.ChargeServicePort;
import com.ZBLogistics.LogisticsProgram.aplication.port.output.ChargePersistencePort;
import com.ZBLogistics.LogisticsProgram.domain.models.ChargeModel;
import com.ZBLogistics.LogisticsProgram.domain.models.PalletModel;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.repositories.PalletRepository;
import com.ZBLogistics.LogisticsProgram.utils.StateOfCharge;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChargeService implements ChargeServicePort {

    private ChargePersistencePort chargePersistencePort;

    @Override
    public List<ChargeModel> readAll() {
        return chargePersistencePort.readAll();
    }

    @Override
    public ChargeModel readById(Long id) {
        return chargePersistencePort.readById(id);
    }

    @Override
    public ChargeModel save(ChargeModel entity) {
        return chargePersistencePort.save(entity);
    }

    @Override
    public ChargeModel update(Long id, ChargeModel chargeModel) {
        return chargePersistencePort.update(id, chargeModel);
    }

    @Override
    public List<ChargeModel> readChargeByUserId(Long id) {
        return chargePersistencePort.readChargeByUserId(id);
    }

    @Override
    public List<ChargeModel> readChargeByPalletId(Long id) {
        return chargePersistencePort.readChargeByPalletId(id);
    }
}
