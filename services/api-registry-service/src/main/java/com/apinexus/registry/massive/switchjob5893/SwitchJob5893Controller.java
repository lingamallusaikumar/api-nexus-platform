package com.apinexus.registry.massive.switchjob5893;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/switchjob5893")
public class SwitchJob5893Controller {
    private final SwitchJob5893Service service;
    
    public SwitchJob5893Controller(SwitchJob5893Service service) { this.service = service; }
    
    @GetMapping
    public List<SwitchJob5893> getAll() { return service.findAll(); }
    
    @PostMapping
    public SwitchJob5893 create(@RequestBody SwitchJob5893 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SwitchJob5893";
    }
}
