package com.apinexus.registry.massive.physicalinterface2091;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PhysicalInterface2091Service {
    private final PhysicalInterface2091Repository repository;
    
    public PhysicalInterface2091Service(PhysicalInterface2091Repository repository) { this.repository = repository; }
    
    public List<PhysicalInterface2091> findAll() { return repository.findAll(); }
    public PhysicalInterface2091 save(PhysicalInterface2091 entity) { return repository.save(entity); }
    public Optional<PhysicalInterface2091> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for PhysicalInterface2091");
    }
}
