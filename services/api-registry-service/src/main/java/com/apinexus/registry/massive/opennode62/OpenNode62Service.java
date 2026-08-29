package com.apinexus.registry.massive.opennode62;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OpenNode62Service {
    private final OpenNode62Repository repository;
    
    public OpenNode62Service(OpenNode62Repository repository) { this.repository = repository; }
    
    public List<OpenNode62> findAll() { return repository.findAll(); }
    public OpenNode62 save(OpenNode62 entity) { return repository.save(entity); }
    public Optional<OpenNode62> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for OpenNode62");
    }
}
