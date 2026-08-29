package com.apinexus.registry.massive.blockdispatcher3961;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blockdispatcher3961")
public class BlockDispatcher3961Controller {
    private final BlockDispatcher3961Service service;
    
    public BlockDispatcher3961Controller(BlockDispatcher3961Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockDispatcher3961> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockDispatcher3961 create(@RequestBody BlockDispatcher3961 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockDispatcher3961";
    }
}
