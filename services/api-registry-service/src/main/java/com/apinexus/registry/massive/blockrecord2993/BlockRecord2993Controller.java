package com.apinexus.registry.massive.blockrecord2993;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blockrecord2993")
public class BlockRecord2993Controller {
    private final BlockRecord2993Service service;
    
    public BlockRecord2993Controller(BlockRecord2993Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockRecord2993> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockRecord2993 create(@RequestBody BlockRecord2993 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockRecord2993";
    }
}
