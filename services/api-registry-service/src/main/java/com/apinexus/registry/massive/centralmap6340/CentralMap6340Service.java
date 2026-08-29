package com.apinexus.registry.massive.centralmap6340;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CentralMap6340Service {
    private final CentralMap6340Repository repository;
    
    public CentralMap6340Service(CentralMap6340Repository repository) { this.repository = repository; }
    
    public List<CentralMap6340> findAll() { return repository.findAll(); }
    public CentralMap6340 save(CentralMap6340 entity) { return repository.save(entity); }
    public Optional<CentralMap6340> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for CentralMap6340");
    }
}
