package com.apinexus.registry.massive.dynamicarray1866;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dynamicarray1866")
public class DynamicArray1866Controller {
    private final DynamicArray1866Service service;
    
    public DynamicArray1866Controller(DynamicArray1866Service service) { this.service = service; }
    
    @GetMapping
    public List<DynamicArray1866> getAll() { return service.findAll(); }
    
    @PostMapping
    public DynamicArray1866 create(@RequestBody DynamicArray1866 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DynamicArray1866";
    }
}
