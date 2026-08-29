package com.apinexus.registry.massive.digitalstore6347;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DigitalStore6347Service {
    private final DigitalStore6347Repository repository;
    
    public DigitalStore6347Service(DigitalStore6347Repository repository) { this.repository = repository; }
    
    public List<DigitalStore6347> findAll() { return repository.findAll(); }
    public DigitalStore6347 save(DigitalStore6347 entity) { return repository.save(entity); }
    public Optional<DigitalStore6347> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for DigitalStore6347");
    }
}
