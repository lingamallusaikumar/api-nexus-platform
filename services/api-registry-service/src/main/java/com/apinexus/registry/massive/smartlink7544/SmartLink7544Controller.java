package com.apinexus.registry.massive.smartlink7544;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/smartlink7544")
public class SmartLink7544Controller {
    private final SmartLink7544Service service;
    
    public SmartLink7544Controller(SmartLink7544Service service) { this.service = service; }
    
    @GetMapping
    public List<SmartLink7544> getAll() { return service.findAll(); }
    
    @PostMapping
    public SmartLink7544 create(@RequestBody SmartLink7544 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SmartLink7544";
    }
}
