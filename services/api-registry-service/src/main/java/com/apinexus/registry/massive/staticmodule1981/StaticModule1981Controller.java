package com.apinexus.registry.massive.staticmodule1981;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/staticmodule1981")
public class StaticModule1981Controller {
    private final StaticModule1981Service service;
    
    public StaticModule1981Controller(StaticModule1981Service service) { this.service = service; }
    
    @GetMapping
    public List<StaticModule1981> getAll() { return service.findAll(); }
    
    @PostMapping
    public StaticModule1981 create(@RequestBody StaticModule1981 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StaticModule1981";
    }
}
