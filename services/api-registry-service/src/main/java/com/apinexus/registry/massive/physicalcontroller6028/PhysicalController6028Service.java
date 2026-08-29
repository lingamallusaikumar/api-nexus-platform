package com.apinexus.registry.massive.physicalcontroller6028;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PhysicalController6028Service {
    private final PhysicalController6028Repository repository;
    
    public PhysicalController6028Service(PhysicalController6028Repository repository) { this.repository = repository; }
    
    public List<PhysicalController6028> findAll() { return repository.findAll(); }
    public PhysicalController6028 save(PhysicalController6028 entity) { return repository.save(entity); }
    public Optional<PhysicalController6028> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for PhysicalController6028");
    }
}
