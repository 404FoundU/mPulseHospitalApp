package com.example.hospital.controller;

import com.example.hospital.dto.HospitalDto;
import com.example.hospital.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;



@RestController
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @GetMapping("/hospital")
    public ResponseEntity<?> getHospitals(
            @RequestParam String year,
            @RequestParam double percentage) {
        try {
            List<HospitalDto> result = hospitalService.getHospitals(Integer.parseInt(year), percentage);
            if (result.isEmpty()) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.ok(result);
        }  catch (Exception e) {
            return ResponseEntity.status(500).body("Error: " + e.getMessage());
        }
    }
}


