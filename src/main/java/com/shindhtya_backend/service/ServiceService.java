package com.shindhtya_backend.service;

import com.shindhtya_backend.model.ServiceModel;
import java.util.List;

public interface ServiceService {
    List<ServiceModel> getAllServices();
    ServiceModel addService(ServiceModel service);
    ServiceModel updateService(Long id, ServiceModel service);
    void deleteService(Long id);
}