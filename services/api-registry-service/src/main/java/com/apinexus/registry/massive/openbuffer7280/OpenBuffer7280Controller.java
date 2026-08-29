package com.apinexus.registry.massive.openbuffer7280;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/openbuffer7280")
public class OpenBuffer7280Controller {
    private final OpenBuffer7280Service service;
    
    public OpenBuffer7280Controller(OpenBuffer7280Service service) { this.service = service; }
    
    @GetMapping
    public List<OpenBuffer7280> getAll() { return service.findAll(); }
    
    @PostMapping
    public OpenBuffer7280 create(@RequestBody OpenBuffer7280 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OpenBuffer7280";
    }
}
