package com.example.smarthome.service;

import com.example.smarthome.entities.EnergyReading;
import com.example.smarthome.repository.EnergyReadingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnergyReadingService {

    private final EnergyReadingRepository energyReadingRepository;

    public EnergyReadingService(EnergyReadingRepository energyReadingRepository) {
        this.energyReadingRepository = energyReadingRepository;
    }

    public EnergyReading saveReading(EnergyReading reading) {
        return energyReadingRepository.save(reading);
    }

    public List<EnergyReading> getAllReadings() {
        return energyReadingRepository.findAll();
    }

    public Optional<EnergyReading> getReadingById(Long id) {
        return energyReadingRepository.findById(id);
    }

    public void deleteReading(Long id) {
        energyReadingRepository.deleteById(id);
    }
}
