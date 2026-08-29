package com.apinexus.registry.massive.datasystem8311;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/datasystem8311")
public class DataSystem8311Controller {
    private final DataSystem8311Service service;
    
    public DataSystem8311Controller(DataSystem8311Service service) { this.service = service; }
    
    @GetMapping
    public List<DataSystem8311> getAll() { return service.findAll(); }
    
    @PostMapping
    public DataSystem8311 create(@RequestBody DataSystem8311 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DataSystem8311";
    }
}
