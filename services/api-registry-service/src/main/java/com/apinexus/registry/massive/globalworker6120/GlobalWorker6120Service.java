package com.apinexus.registry.massive.globalworker6120;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class GlobalWorker6120Service {
    private final GlobalWorker6120Repository repository;
    
    public GlobalWorker6120Service(GlobalWorker6120Repository repository) { this.repository = repository; }
    
    public List<GlobalWorker6120> findAll() { return repository.findAll(); }
    public GlobalWorker6120 save(GlobalWorker6120 entity) { return repository.save(entity); }
    public Optional<GlobalWorker6120> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for GlobalWorker6120");
    }
}
