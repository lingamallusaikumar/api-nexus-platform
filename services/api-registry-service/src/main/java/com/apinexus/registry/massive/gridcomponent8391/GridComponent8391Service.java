package com.apinexus.registry.massive.gridcomponent8391;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class GridComponent8391Service {
    private final GridComponent8391Repository repository;
    
    public GridComponent8391Service(GridComponent8391Repository repository) { this.repository = repository; }
    
    public List<GridComponent8391> findAll() { return repository.findAll(); }
    public GridComponent8391 save(GridComponent8391 entity) { return repository.save(entity); }
    public Optional<GridComponent8391> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for GridComponent8391");
    }
}
