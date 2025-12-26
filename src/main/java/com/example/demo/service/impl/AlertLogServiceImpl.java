package com.example.demo.service.impl;

import
import com.example.demo.entity.AlertLog;
import com.example.demo.entity.Warranty;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.AlertLogRepository;
import com.example.demo.repository.WarrantyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlertLogServiceImpl
        implements AlertLogService {

    @Autowired
    private AlertLogRepository alertLogRepository;

    @Autowired
    private WarrantyRepository warrantyRepository;

    @Override
    public AlertLog addLog(Long warrantyId, String message) {

        Warranty warranty = warrantyRepository.findById(warrantyId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Warranty not found"));

        AlertLog log = new AlertLog();
        log.setWarranty(warranty);
        log.setMessage(message);

        return alertLogRepository.save(log);
    }

    @Override
    public List<AlertLog> getLogs(Long warrantyId) {
        return alertLogRepository.findByWarrantyId(warrantyId);
    }
}
