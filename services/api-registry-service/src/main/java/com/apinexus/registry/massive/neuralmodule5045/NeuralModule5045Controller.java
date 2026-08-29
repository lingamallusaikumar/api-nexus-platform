package com.apinexus.registry.massive.neuralmodule5045;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/neuralmodule5045")
public class NeuralModule5045Controller {
    private final NeuralModule5045Service service;
    
    public NeuralModule5045Controller(NeuralModule5045Service service) { this.service = service; }
    
    @GetMapping
    public List<NeuralModule5045> getAll() { return service.findAll(); }
    
    @PostMapping
    public NeuralModule5045 create(@RequestBody NeuralModule5045 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NeuralModule5045";
    }
}
