package com.apinexus.registry.massive.switchjob9176;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/switchjob9176")
public class SwitchJob9176Controller {
    private final SwitchJob9176Service service;
    
    public SwitchJob9176Controller(SwitchJob9176Service service) { this.service = service; }
    
    @GetMapping
    public List<SwitchJob9176> getAll() { return service.findAll(); }
    
    @PostMapping
    public SwitchJob9176 create(@RequestBody SwitchJob9176 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SwitchJob9176";
    }
}
