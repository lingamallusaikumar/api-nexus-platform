package com.apinexus.registry.massive.blockarray4099;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blockarray4099")
public class BlockArray4099Controller {
    private final BlockArray4099Service service;
    
    public BlockArray4099Controller(BlockArray4099Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockArray4099> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockArray4099 create(@RequestBody BlockArray4099 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockArray4099";
    }
}
