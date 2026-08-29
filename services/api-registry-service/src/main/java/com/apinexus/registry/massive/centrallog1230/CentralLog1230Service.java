package com.apinexus.registry.massive.centrallog1230;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CentralLog1230Service {
    private final CentralLog1230Repository repository;
    
    public CentralLog1230Service(CentralLog1230Repository repository) { this.repository = repository; }
    
    public List<CentralLog1230> findAll() { return repository.findAll(); }
    public CentralLog1230 save(CentralLog1230 entity) { return repository.save(entity); }
    public Optional<CentralLog1230> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for CentralLog1230");
    }
}
