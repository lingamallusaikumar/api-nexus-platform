package com.apinexus.registry.massive.digitalheap5901;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DigitalHeap5901Service {
    private final DigitalHeap5901Repository repository;
    
    public DigitalHeap5901Service(DigitalHeap5901Repository repository) { this.repository = repository; }
    
    public List<DigitalHeap5901> findAll() { return repository.findAll(); }
    public DigitalHeap5901 save(DigitalHeap5901 entity) { return repository.save(entity); }
    public Optional<DigitalHeap5901> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for DigitalHeap5901");
    }
}
