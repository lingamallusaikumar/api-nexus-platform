package com.apinexus.registry.massive.chainjob9541;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/chainjob9541")
public class ChainJob9541Controller {
    private final ChainJob9541Service service;
    
    public ChainJob9541Controller(ChainJob9541Service service) { this.service = service; }
    
    @GetMapping
    public List<ChainJob9541> getAll() { return service.findAll(); }
    
    @PostMapping
    public ChainJob9541 create(@RequestBody ChainJob9541 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ChainJob9541";
    }
}
