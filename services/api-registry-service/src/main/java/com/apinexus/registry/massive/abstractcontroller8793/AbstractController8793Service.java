package com.apinexus.registry.massive.abstractcontroller8793;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AbstractController8793Service {
    private final AbstractController8793Repository repository;
    
    public AbstractController8793Service(AbstractController8793Repository repository) { this.repository = repository; }
    
    public List<AbstractController8793> findAll() { return repository.findAll(); }
    public AbstractController8793 save(AbstractController8793 entity) { return repository.save(entity); }
    public Optional<AbstractController8793> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for AbstractController8793");
    }
}
