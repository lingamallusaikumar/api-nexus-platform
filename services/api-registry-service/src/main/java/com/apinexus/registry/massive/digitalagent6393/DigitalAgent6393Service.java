package com.apinexus.registry.massive.digitalagent6393;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DigitalAgent6393Service {
    private final DigitalAgent6393Repository repository;
    
    public DigitalAgent6393Service(DigitalAgent6393Repository repository) { this.repository = repository; }
    
    public List<DigitalAgent6393> findAll() { return repository.findAll(); }
    public DigitalAgent6393 save(DigitalAgent6393 entity) { return repository.save(entity); }
    public Optional<DigitalAgent6393> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for DigitalAgent6393");
    }
}
