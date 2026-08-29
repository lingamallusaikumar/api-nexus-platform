package com.apinexus.registry.massive.openitem3223;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/openitem3223")
public class OpenItem3223Controller {
    private final OpenItem3223Service service;
    
    public OpenItem3223Controller(OpenItem3223Service service) { this.service = service; }
    
    @GetMapping
    public List<OpenItem3223> getAll() { return service.findAll(); }
    
    @PostMapping
    public OpenItem3223 create(@RequestBody OpenItem3223 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OpenItem3223";
    }
}
