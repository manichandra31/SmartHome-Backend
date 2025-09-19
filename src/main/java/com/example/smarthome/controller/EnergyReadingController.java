package com.example.smarthome.controller;

import com.example.smarthome.entities.EnergyReading;
import com.example.smarthome.service.EnergyReadingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/readings")
@RequiredArgsConstructor
public class EnergyReadingController {

    private final EnergyReadingService energyReadingService;

    @PostMapping
    public ResponseEntity<EnergyReading> saveReading(@RequestBody EnergyReading reading) {
        return ResponseEntity.ok(energyReadingService.saveReading(reading));
    }

    @GetMapping
    public ResponseEntity<List<EnergyReading>> getAllReadings() {
        return ResponseEntity.ok(energyReadingService.getAllReadings());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnergyReading> getReadingById(@PathVariable Long id) {
        return energyReadingService.getReadingById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReading(@PathVariable Long id) {
        energyReadingService.deleteReading(id);
        return ResponseEntity.noContent().build();
    }
}
