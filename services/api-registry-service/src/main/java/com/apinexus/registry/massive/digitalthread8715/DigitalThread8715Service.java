package com.apinexus.registry.massive.digitalthread8715;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DigitalThread8715Service {
    private final DigitalThread8715Repository repository;
    
    public DigitalThread8715Service(DigitalThread8715Repository repository) { this.repository = repository; }
    
    public List<DigitalThread8715> findAll() { return repository.findAll(); }
    public DigitalThread8715 save(DigitalThread8715 entity) { return repository.save(entity); }
    public Optional<DigitalThread8715> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for DigitalThread8715");
    }
}
