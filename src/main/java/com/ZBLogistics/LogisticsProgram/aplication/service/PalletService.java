package com.ZBLogistics.LogisticsProgram.aplication.service;

import com.ZBLogistics.LogisticsProgram.aplication.port.input.PalletServicePort;
import com.ZBLogistics.LogisticsProgram.aplication.port.output.PalletPersistencePort;
import com.ZBLogistics.LogisticsProgram.domain.models.PalletModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PalletService implements PalletServicePort {

    private PalletPersistencePort palletPersistencePort;

    @Override
    public PalletModel save(PalletModel entity) {
        return palletPersistencePort.save(entity);
    }

    @Override
    public List<PalletModel> readAll() {
        return palletPersistencePort.readAll();
    }

    @Override
    public PalletModel readById(Long id) {
        return palletPersistencePort.readById(id);
    }

    @Override
    public PalletModel update(Long id, PalletModel palletModel) {
        return palletPersistencePort.update(id,palletModel);
    }

    @Override
    public String deletebyId(Long id) {
        return palletPersistencePort.deletebyId(id);
    }
}
