package com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence;

import com.ZBLogistics.LogisticsProgram.aplication.port.output.PalletPersistencePort;
import com.ZBLogistics.LogisticsProgram.domain.models.PalletModel;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.mappers.PalletMapper;
import com.ZBLogistics.LogisticsProgram.infraestructure.adapter.output.persistence.repositories.PalletRepository;
import com.ZBLogistics.LogisticsProgram.utils.StateOfPallet;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PalletPersistenceAdapter implements PalletPersistencePort {

    private PalletRepository repository;
    private PalletMapper mapper;

    @Override
    public PalletModel save(PalletModel entity) {
        entity.setStatus(StateOfPallet.valueOf("AVAILABLE"));
        return mapper.toPalletModel(repository.save(mapper.toPalletEntity(entity)));
    }

    @Override
    public List<PalletModel> readAll() {
        return mapper.toPalletModelList(repository.findAll());
    }

    @Override
    public PalletModel readById(Long id) {
        return mapper.toPalletModel(repository.findById(id).orElseThrow(() -> new RuntimeException("Pallet not found")));
    }

    @Override
    public PalletModel update(Long id, PalletModel palletModel) {
        if(!repository.existsById(id)){
            throw new RuntimeException("pallet not exists");
        }
        return mapper.toPalletModel(repository.save(mapper.toPalletEntity(palletModel)));
    }

    @Override
    public String deletebyId(Long id) {
        repository.deleteById(id);
        return "Delete Successful";
    }
}
