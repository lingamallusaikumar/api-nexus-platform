package com.apinexus.registry.massive.blockthread4228;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blockthread4228")
public class BlockThread4228Controller {
    private final BlockThread4228Service service;
    
    public BlockThread4228Controller(BlockThread4228Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockThread4228> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockThread4228 create(@RequestBody BlockThread4228 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockThread4228";
    }
}
