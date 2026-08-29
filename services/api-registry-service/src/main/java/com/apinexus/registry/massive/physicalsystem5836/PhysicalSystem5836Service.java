package com.apinexus.registry.massive.physicalsystem5836;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PhysicalSystem5836Service {
    private final PhysicalSystem5836Repository repository;
    
    public PhysicalSystem5836Service(PhysicalSystem5836Repository repository) { this.repository = repository; }
    
    public List<PhysicalSystem5836> findAll() { return repository.findAll(); }
    public PhysicalSystem5836 save(PhysicalSystem5836 entity) { return repository.save(entity); }
    public Optional<PhysicalSystem5836> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for PhysicalSystem5836");
    }
}
