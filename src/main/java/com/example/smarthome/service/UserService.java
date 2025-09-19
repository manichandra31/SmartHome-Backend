package com.example.smarthome.service;

import com.example.smarthome.entities.User;
import com.example.smarthome.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    // Constructor Injection
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Create or Update User
    public User saveUser(User user) {
        if (user.getDevices() != null) {
            user.getDevices().forEach(device -> {
                device.setUser(user); // set reverse mapping
                if (device.getEnergyReadings() != null) {
                    device.getEnergyReadings().forEach(reading -> reading.setDevice(device));
                }
            });
        }
        return userRepository.save(user);
    }


    // Get All Users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get User by Id
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Delete User
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
