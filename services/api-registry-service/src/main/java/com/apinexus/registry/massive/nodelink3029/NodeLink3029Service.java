package com.apinexus.registry.massive.nodelink3029;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class NodeLink3029Service {
    private final NodeLink3029Repository repository;
    
    public NodeLink3029Service(NodeLink3029Repository repository) { this.repository = repository; }
    
    public List<NodeLink3029> findAll() { return repository.findAll(); }
    public NodeLink3029 save(NodeLink3029 entity) { return repository.save(entity); }
    public Optional<NodeLink3029> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for NodeLink3029");
    }
}
