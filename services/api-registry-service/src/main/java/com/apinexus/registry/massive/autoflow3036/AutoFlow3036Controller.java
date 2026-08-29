package com.apinexus.registry.massive.autoflow3036;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/autoflow3036")
public class AutoFlow3036Controller {
    private final AutoFlow3036Service service;
    
    public AutoFlow3036Controller(AutoFlow3036Service service) { this.service = service; }
    
    @GetMapping
    public List<AutoFlow3036> getAll() { return service.findAll(); }
    
    @PostMapping
    public AutoFlow3036 create(@RequestBody AutoFlow3036 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AutoFlow3036";
    }
}
