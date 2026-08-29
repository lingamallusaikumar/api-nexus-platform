package com.apinexus.registry.massive.autothread2112;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/autothread2112")
public class AutoThread2112Controller {
    private final AutoThread2112Service service;
    
    public AutoThread2112Controller(AutoThread2112Service service) { this.service = service; }
    
    @GetMapping
    public List<AutoThread2112> getAll() { return service.findAll(); }
    
    @PostMapping
    public AutoThread2112 create(@RequestBody AutoThread2112 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AutoThread2112";
    }
}
