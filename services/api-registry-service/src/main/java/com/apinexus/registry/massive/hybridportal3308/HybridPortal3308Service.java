package com.apinexus.registry.massive.hybridportal3308;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HybridPortal3308Service {
    private final HybridPortal3308Repository repository;
    
    public HybridPortal3308Service(HybridPortal3308Repository repository) { this.repository = repository; }
    
    public List<HybridPortal3308> findAll() { return repository.findAll(); }
    public HybridPortal3308 save(HybridPortal3308 entity) { return repository.save(entity); }
    public Optional<HybridPortal3308> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for HybridPortal3308");
    }
}
