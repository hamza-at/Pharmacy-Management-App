package com.aitmansour.pharmacymanagementsystem.service;

import com.aitmansour.pharmacymanagementsystem.io.entity.Log;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LogService {
    Log createLog(Log log);
    Log getLogById(String logId);
    Log updateLogDetails(String logId, Log log);
    void deleteLog(String logId);
    List<Log> getLog();
}
