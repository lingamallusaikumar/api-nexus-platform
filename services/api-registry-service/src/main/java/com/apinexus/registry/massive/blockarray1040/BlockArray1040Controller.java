package com.apinexus.registry.massive.blockarray1040;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blockarray1040")
public class BlockArray1040Controller {
    private final BlockArray1040Service service;
    
    public BlockArray1040Controller(BlockArray1040Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockArray1040> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockArray1040 create(@RequestBody BlockArray1040 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockArray1040";
    }
}
