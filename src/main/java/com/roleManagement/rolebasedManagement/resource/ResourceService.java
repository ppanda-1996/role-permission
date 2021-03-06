package com.roleManagement.rolebasedManagement.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {
    @Autowired
    private ResourceRepository resourceRepository;

    public List<Resource> listAllResource() {
        return resourceRepository.findAll();
    }

    public void saveResource(Resource resource) {
        resourceRepository.save(resource);
    }
}
