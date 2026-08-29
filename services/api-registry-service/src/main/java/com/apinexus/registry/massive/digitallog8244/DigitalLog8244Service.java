package com.apinexus.registry.massive.digitallog8244;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DigitalLog8244Service {
    private final DigitalLog8244Repository repository;
    
    public DigitalLog8244Service(DigitalLog8244Repository repository) { this.repository = repository; }
    
    public List<DigitalLog8244> findAll() { return repository.findAll(); }
    public DigitalLog8244 save(DigitalLog8244 entity) { return repository.save(entity); }
    public Optional<DigitalLog8244> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for DigitalLog8244");
    }
}
