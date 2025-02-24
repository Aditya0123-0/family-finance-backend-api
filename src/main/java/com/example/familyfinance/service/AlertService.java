package com.example.familyfinance.service;

import com.example.familyfinance.entity.Alert;

import java.util.List;

public interface AlertService {
    Alert createAlert(Alert alert);
    Alert getAlertById(Long alertId);
    List<Alert> getAllAlert();
    Alert updtaeAlert(Long alertId, Alert alert);
    void deleteAlert(Long alertId);
}
