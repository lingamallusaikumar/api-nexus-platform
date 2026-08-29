package com.apinexus.registry.massive.physicalportal2524;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PhysicalPortal2524Service {
    private final PhysicalPortal2524Repository repository;
    
    public PhysicalPortal2524Service(PhysicalPortal2524Repository repository) { this.repository = repository; }
    
    public List<PhysicalPortal2524> findAll() { return repository.findAll(); }
    public PhysicalPortal2524 save(PhysicalPortal2524 entity) { return repository.save(entity); }
    public Optional<PhysicalPortal2524> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for PhysicalPortal2524");
    }
}
