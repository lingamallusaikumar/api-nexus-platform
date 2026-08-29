package com.apinexus.registry.massive.routerarray1880;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routerarray1880")
public class RouterArray1880Controller {
    private final RouterArray1880Service service;
    
    public RouterArray1880Controller(RouterArray1880Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterArray1880> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterArray1880 create(@RequestBody RouterArray1880 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterArray1880";
    }
}
