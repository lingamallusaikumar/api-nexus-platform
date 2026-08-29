package com.apinexus.registry.massive.corethread3206;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/corethread3206")
public class CoreThread3206Controller {
    private final CoreThread3206Service service;
    
    public CoreThread3206Controller(CoreThread3206Service service) { this.service = service; }
    
    @GetMapping
    public List<CoreThread3206> getAll() { return service.findAll(); }
    
    @PostMapping
    public CoreThread3206 create(@RequestBody CoreThread3206 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CoreThread3206";
    }
}
