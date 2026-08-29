package com.apinexus.registry.massive.chainagent6412;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/chainagent6412")
public class ChainAgent6412Controller {
    private final ChainAgent6412Service service;
    
    public ChainAgent6412Controller(ChainAgent6412Service service) { this.service = service; }
    
    @GetMapping
    public List<ChainAgent6412> getAll() { return service.findAll(); }
    
    @PostMapping
    public ChainAgent6412 create(@RequestBody ChainAgent6412 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ChainAgent6412";
    }
}
