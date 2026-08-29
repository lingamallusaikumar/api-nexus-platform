package com.apinexus.registry.massive.autodispatcher6918;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/autodispatcher6918")
public class AutoDispatcher6918Controller {
    private final AutoDispatcher6918Service service;
    
    public AutoDispatcher6918Controller(AutoDispatcher6918Service service) { this.service = service; }
    
    @GetMapping
    public List<AutoDispatcher6918> getAll() { return service.findAll(); }
    
    @PostMapping
    public AutoDispatcher6918 create(@RequestBody AutoDispatcher6918 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AutoDispatcher6918";
    }
}
