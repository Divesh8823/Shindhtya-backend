package com.shindhtya_backend.controller;

import com.shindhtya_backend.model.ServiceModel;
import com.shindhtya_backend.service.ServiceService; // ये लाइन missing थी

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
@CrossOrigin(origins = "*")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    @GetMapping
    public List<ServiceModel> getAllServices() {
        return serviceService.getAllServices();
    }

    @PostMapping
    public ServiceModel addService(@RequestBody ServiceModel service) {
        return serviceService.addService(service);
    }

    @PutMapping("/{id}")
    public ServiceModel updateService(@PathVariable Long id, @RequestBody ServiceModel service) {
        return serviceService.updateService(id, service);
    }

    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable Long id) {
        serviceService.deleteService(id);
    }
}
