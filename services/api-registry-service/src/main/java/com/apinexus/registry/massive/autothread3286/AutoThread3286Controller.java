package com.apinexus.registry.massive.autothread3286;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/autothread3286")
public class AutoThread3286Controller {
    private final AutoThread3286Service service;
    
    public AutoThread3286Controller(AutoThread3286Service service) { this.service = service; }
    
    @GetMapping
    public List<AutoThread3286> getAll() { return service.findAll(); }
    
    @PostMapping
    public AutoThread3286 create(@RequestBody AutoThread3286 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AutoThread3286";
    }
}
