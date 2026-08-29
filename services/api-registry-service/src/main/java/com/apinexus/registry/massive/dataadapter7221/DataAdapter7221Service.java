package com.apinexus.registry.massive.dataadapter7221;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DataAdapter7221Service {
    private final DataAdapter7221Repository repository;
    
    public DataAdapter7221Service(DataAdapter7221Repository repository) { this.repository = repository; }
    
    public List<DataAdapter7221> findAll() { return repository.findAll(); }
    public DataAdapter7221 save(DataAdapter7221 entity) { return repository.save(entity); }
    public Optional<DataAdapter7221> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for DataAdapter7221");
    }
}
