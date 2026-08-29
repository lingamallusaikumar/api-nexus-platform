package com.apinexus.registry.massive.blockrecord2993;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BlockRecord2993Service {
    private final BlockRecord2993Repository repository;
    
    public BlockRecord2993Service(BlockRecord2993Repository repository) { this.repository = repository; }
    
    public List<BlockRecord2993> findAll() { return repository.findAll(); }
    public BlockRecord2993 save(BlockRecord2993 entity) { return repository.save(entity); }
    public Optional<BlockRecord2993> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for BlockRecord2993");
    }
}
