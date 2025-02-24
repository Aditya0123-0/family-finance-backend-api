package com.example.familyfinance.controller;

import com.example.familyfinance.entity.Alert;
import com.example.familyfinance.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alerts")
public class AlertController {
    @Autowired
    private AlertService alertService;

    @PostMapping
    public Alert createAlert(@RequestBody Alert alert){
        return alertService.createAlert(alert);
    }
    @GetMapping("/{alertId}")
    public Alert getAlertById(@PathVariable Long alertId){
        return alertService.getAlertById(alertId);
    }
    @GetMapping
    public List<Alert> getAllAlert(){
        return alertService.getAllAlert();
    }
    @PutMapping("/{alterId}")
    public Alert updtaeAlert(@PathVariable Long alertId, @RequestBody Alert alert){
        return alertService.updtaeAlert(alertId,alert);
    }
    @DeleteMapping("/{alterId}")
    void deleteAlert(@PathVariable Long alertId){
        alertService.deleteAlert(alertId);
    }

}
