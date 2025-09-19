package com.example.smarthome.entities;

import com.example.smarthome.entities.EnergyReading;
import jakarta.persistence.*;
import lombok.*;
import com.example.smarthome.entities.User;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "device", cascade = CascadeType.ALL)
    private List<EnergyReading> energyReadings;
}
