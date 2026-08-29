package com.apinexus.registry.massive.chainvertex6977;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/chainvertex6977")
public class ChainVertex6977Controller {
    private final ChainVertex6977Service service;
    
    public ChainVertex6977Controller(ChainVertex6977Service service) { this.service = service; }
    
    @GetMapping
    public List<ChainVertex6977> getAll() { return service.findAll(); }
    
    @PostMapping
    public ChainVertex6977 create(@RequestBody ChainVertex6977 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ChainVertex6977";
    }
}
