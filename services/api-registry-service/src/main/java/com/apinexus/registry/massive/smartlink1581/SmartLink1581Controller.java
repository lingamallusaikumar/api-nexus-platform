package com.apinexus.registry.massive.smartlink1581;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/smartlink1581")
public class SmartLink1581Controller {
    private final SmartLink1581Service service;
    
    public SmartLink1581Controller(SmartLink1581Service service) { this.service = service; }
    
    @GetMapping
    public List<SmartLink1581> getAll() { return service.findAll(); }
    
    @PostMapping
    public SmartLink1581 create(@RequestBody SmartLink1581 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SmartLink1581";
    }
}
