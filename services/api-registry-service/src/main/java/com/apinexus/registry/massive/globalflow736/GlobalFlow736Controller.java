package com.apinexus.registry.massive.globalflow736;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/globalflow736")
public class GlobalFlow736Controller {
    private final GlobalFlow736Service service;
    
    public GlobalFlow736Controller(GlobalFlow736Service service) { this.service = service; }
    
    @GetMapping
    public List<GlobalFlow736> getAll() { return service.findAll(); }
    
    @PostMapping
    public GlobalFlow736 create(@RequestBody GlobalFlow736 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GlobalFlow736";
    }
}
