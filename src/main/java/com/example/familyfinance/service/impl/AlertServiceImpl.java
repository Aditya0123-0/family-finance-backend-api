package com.example.familyfinance.service.impl;

import com.example.familyfinance.entity.Alert;
import com.example.familyfinance.repository.AlertRepository;
import com.example.familyfinance.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlertServiceImpl implements AlertService {
    @Autowired
    private AlertRepository alertRepository;

    @Override
    public Alert createAlert(Alert alert) {
        return alertRepository.save(alert);
    }

    @Override
    public Alert getAlertById(Long alertId) {
        return alertRepository.findById(alertId).orElse(null);
    }

    @Override
    public List<Alert> getAllAlert() {
        return alertRepository.findAll();
    }

    @Override
    public Alert updtaeAlert(Long alertId, Alert alert) {
        if(alertRepository.existsById(alertId)){
            alert.setAlertId(alertId);
            return alertRepository.save(alert);
        }
        return null;
    }

    @Override
    public void deleteAlert(Long alertId) {
        alertRepository.deleteById(alertId);

    }
}
