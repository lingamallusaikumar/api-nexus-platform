package com.apinexus.registry.massive.digitalgraph1774;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalgraph1774")
public class DigitalGraph1774Controller {
    private final DigitalGraph1774Service service;
    
    public DigitalGraph1774Controller(DigitalGraph1774Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalGraph1774> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalGraph1774 create(@RequestBody DigitalGraph1774 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalGraph1774";
    }
}
