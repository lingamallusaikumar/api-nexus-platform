package com.apinexus.registry.massive.autohandler3669;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/autohandler3669")
public class AutoHandler3669Controller {
    private final AutoHandler3669Service service;
    
    public AutoHandler3669Controller(AutoHandler3669Service service) { this.service = service; }
    
    @GetMapping
    public List<AutoHandler3669> getAll() { return service.findAll(); }
    
    @PostMapping
    public AutoHandler3669 create(@RequestBody AutoHandler3669 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AutoHandler3669";
    }
}
