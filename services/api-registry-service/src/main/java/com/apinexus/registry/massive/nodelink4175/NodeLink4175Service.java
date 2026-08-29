package com.apinexus.registry.massive.nodelink4175;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class NodeLink4175Service {
    private final NodeLink4175Repository repository;
    
    public NodeLink4175Service(NodeLink4175Repository repository) { this.repository = repository; }
    
    public List<NodeLink4175> findAll() { return repository.findAll(); }
    public NodeLink4175 save(NodeLink4175 entity) { return repository.save(entity); }
    public Optional<NodeLink4175> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for NodeLink4175");
    }
}
