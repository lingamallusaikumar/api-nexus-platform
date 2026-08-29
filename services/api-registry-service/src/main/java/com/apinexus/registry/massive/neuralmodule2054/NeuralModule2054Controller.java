package com.apinexus.registry.massive.neuralmodule2054;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/neuralmodule2054")
public class NeuralModule2054Controller {
    private final NeuralModule2054Service service;
    
    public NeuralModule2054Controller(NeuralModule2054Service service) { this.service = service; }
    
    @GetMapping
    public List<NeuralModule2054> getAll() { return service.findAll(); }
    
    @PostMapping
    public NeuralModule2054 create(@RequestBody NeuralModule2054 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NeuralModule2054";
    }
}
