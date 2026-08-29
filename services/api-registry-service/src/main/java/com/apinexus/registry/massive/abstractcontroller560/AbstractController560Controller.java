package com.apinexus.registry.massive.abstractcontroller560;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractcontroller560")
public class AbstractController560Controller {
    private final AbstractController560Service service;
    
    public AbstractController560Controller(AbstractController560Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractController560> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractController560 create(@RequestBody AbstractController560 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractController560";
    }
}
