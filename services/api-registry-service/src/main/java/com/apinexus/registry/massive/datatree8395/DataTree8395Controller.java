package com.apinexus.registry.massive.datatree8395;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/datatree8395")
public class DataTree8395Controller {
    private final DataTree8395Service service;
    
    public DataTree8395Controller(DataTree8395Service service) { this.service = service; }
    
    @GetMapping
    public List<DataTree8395> getAll() { return service.findAll(); }
    
    @PostMapping
    public DataTree8395 create(@RequestBody DataTree8395 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DataTree8395";
    }
}
