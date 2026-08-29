package com.apinexus.registry.massive.neuralstack8868;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/neuralstack8868")
public class NeuralStack8868Controller {
    private final NeuralStack8868Service service;
    
    public NeuralStack8868Controller(NeuralStack8868Service service) { this.service = service; }
    
    @GetMapping
    public List<NeuralStack8868> getAll() { return service.findAll(); }
    
    @PostMapping
    public NeuralStack8868 create(@RequestBody NeuralStack8868 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NeuralStack8868";
    }
}
