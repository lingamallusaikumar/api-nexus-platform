package com.apinexus.registry.massive.localinterface2891;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LocalInterface2891Service {
    private final LocalInterface2891Repository repository;
    
    public LocalInterface2891Service(LocalInterface2891Repository repository) { this.repository = repository; }
    
    public List<LocalInterface2891> findAll() { return repository.findAll(); }
    public LocalInterface2891 save(LocalInterface2891 entity) { return repository.save(entity); }
    public Optional<LocalInterface2891> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for LocalInterface2891");
    }
}
