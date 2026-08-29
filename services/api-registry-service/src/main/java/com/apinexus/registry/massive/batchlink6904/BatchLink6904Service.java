package com.apinexus.registry.massive.batchlink6904;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BatchLink6904Service {
    private final BatchLink6904Repository repository;
    
    public BatchLink6904Service(BatchLink6904Repository repository) { this.repository = repository; }
    
    public List<BatchLink6904> findAll() { return repository.findAll(); }
    public BatchLink6904 save(BatchLink6904 entity) { return repository.save(entity); }
    public Optional<BatchLink6904> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for BatchLink6904");
    }
}
