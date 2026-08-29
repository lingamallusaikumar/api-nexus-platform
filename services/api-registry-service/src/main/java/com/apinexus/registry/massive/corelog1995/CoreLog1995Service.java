package com.apinexus.registry.massive.corelog1995;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CoreLog1995Service {
    private final CoreLog1995Repository repository;
    
    public CoreLog1995Service(CoreLog1995Repository repository) { this.repository = repository; }
    
    public List<CoreLog1995> findAll() { return repository.findAll(); }
    public CoreLog1995 save(CoreLog1995 entity) { return repository.save(entity); }
    public Optional<CoreLog1995> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for CoreLog1995");
    }
}
