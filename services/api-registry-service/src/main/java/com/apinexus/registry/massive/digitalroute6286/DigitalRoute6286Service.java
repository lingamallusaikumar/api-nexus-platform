package com.apinexus.registry.massive.digitalroute6286;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DigitalRoute6286Service {
    private final DigitalRoute6286Repository repository;
    
    public DigitalRoute6286Service(DigitalRoute6286Repository repository) { this.repository = repository; }
    
    public List<DigitalRoute6286> findAll() { return repository.findAll(); }
    public DigitalRoute6286 save(DigitalRoute6286 entity) { return repository.save(entity); }
    public Optional<DigitalRoute6286> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for DigitalRoute6286");
    }
}
