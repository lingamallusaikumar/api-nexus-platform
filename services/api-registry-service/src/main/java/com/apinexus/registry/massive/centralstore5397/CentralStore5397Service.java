package com.apinexus.registry.massive.centralstore5397;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CentralStore5397Service {
    private final CentralStore5397Repository repository;
    
    public CentralStore5397Service(CentralStore5397Repository repository) { this.repository = repository; }
    
    public List<CentralStore5397> findAll() { return repository.findAll(); }
    public CentralStore5397 save(CentralStore5397 entity) { return repository.save(entity); }
    public Optional<CentralStore5397> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for CentralStore5397");
    }
}
