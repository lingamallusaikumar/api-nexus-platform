package com.apinexus.registry.massive.digitalsystem6821;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DigitalSystem6821Service {
    private final DigitalSystem6821Repository repository;
    
    public DigitalSystem6821Service(DigitalSystem6821Repository repository) { this.repository = repository; }
    
    public List<DigitalSystem6821> findAll() { return repository.findAll(); }
    public DigitalSystem6821 save(DigitalSystem6821 entity) { return repository.save(entity); }
    public Optional<DigitalSystem6821> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for DigitalSystem6821");
    }
}
