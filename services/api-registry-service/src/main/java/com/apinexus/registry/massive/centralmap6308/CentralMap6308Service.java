package com.apinexus.registry.massive.centralmap6308;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CentralMap6308Service {
    private final CentralMap6308Repository repository;
    
    public CentralMap6308Service(CentralMap6308Repository repository) { this.repository = repository; }
    
    public List<CentralMap6308> findAll() { return repository.findAll(); }
    public CentralMap6308 save(CentralMap6308 entity) { return repository.save(entity); }
    public Optional<CentralMap6308> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for CentralMap6308");
    }
}
