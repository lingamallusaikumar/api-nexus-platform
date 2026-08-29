package com.apinexus.registry.massive.switchinterface732;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/switchinterface732")
public class SwitchInterface732Controller {
    private final SwitchInterface732Service service;
    
    public SwitchInterface732Controller(SwitchInterface732Service service) { this.service = service; }
    
    @GetMapping
    public List<SwitchInterface732> getAll() { return service.findAll(); }
    
    @PostMapping
    public SwitchInterface732 create(@RequestBody SwitchInterface732 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SwitchInterface732";
    }
}
