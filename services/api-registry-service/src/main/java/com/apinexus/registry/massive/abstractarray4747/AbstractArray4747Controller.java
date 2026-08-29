package com.apinexus.registry.massive.abstractarray4747;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractarray4747")
public class AbstractArray4747Controller {
    private final AbstractArray4747Service service;
    
    public AbstractArray4747Controller(AbstractArray4747Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractArray4747> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractArray4747 create(@RequestBody AbstractArray4747 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractArray4747";
    }
}
