package com.apinexus.registry.massive.blockcache5322;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blockcache5322")
public class BlockCache5322Controller {
    private final BlockCache5322Service service;
    
    public BlockCache5322Controller(BlockCache5322Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockCache5322> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockCache5322 create(@RequestBody BlockCache5322 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockCache5322";
    }
}
