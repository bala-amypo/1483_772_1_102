package com.example.demo.service.impl;

import com.example.demo.entity.AlertLog;
import com.example.demo.service.AlertLogService;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;

@Service
public class AlertLogServiceImpl implements AlertLogService {

    @Override
    public AlertLog addLog(Long warrantyId, String message) {
        return new AlertLog();
    }

    @Override
    public List<AlertLog> getLogs(Long warrantyId) {
        return Collections.emptyList();
    }
}
