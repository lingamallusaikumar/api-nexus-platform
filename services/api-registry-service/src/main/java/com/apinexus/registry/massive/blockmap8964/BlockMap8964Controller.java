package com.apinexus.registry.massive.blockmap8964;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blockmap8964")
public class BlockMap8964Controller {
    private final BlockMap8964Service service;
    
    public BlockMap8964Controller(BlockMap8964Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockMap8964> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockMap8964 create(@RequestBody BlockMap8964 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockMap8964";
    }
}
