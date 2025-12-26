package com.example.demo.service;

import com.example.demo.entity.AlertLog;
import com.example.demo.entity.Warranty;

public interface AlertLogService {
    AlertLog create(Warranty warranty, String message);
}
