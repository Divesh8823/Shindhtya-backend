package com.shindhtya_backend.service;

import com.shindhtya_backend.model.ServiceModel;
import com.shindhtya_backend.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public List<ServiceModel> getAllServices() {
        return serviceRepository.findAll();
    }

    @Override
    public ServiceModel addService(ServiceModel service) {
        return serviceRepository.save(service);
    }

    @Override
    public ServiceModel updateService(Long id, ServiceModel service) {
        ServiceModel existing = serviceRepository.findById(id).orElseThrow();
        existing.setName(service.getName());
        existing.setDescription(service.getDescription());
        return serviceRepository.save(existing);
    }

    @Override
    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }
}