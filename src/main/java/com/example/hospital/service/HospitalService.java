package com.example.hospital.service;

import com.example.hospital.dto.HospitalDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
import org.springframework.http.HttpMethod;
import org.springframework.core.ParameterizedTypeReference;

@Service
public class HospitalService {

    private final RestTemplate restTemplate = new RestTemplate();

    private static final String API_URL = "https://www.healthit.gov/data/open-api?source=Meaningful-Use-Acceleration-Scorecard.csv";


    public List<HospitalDto> getHospitals(int year, double percentage) {
        List<HospitalDto> response = fetchHospitalList();

        List<HospitalDto> hospitalDtoList = response.stream()
                .filter(h -> yearFilter(h, year, percentage))
                .sorted(Comparator.comparing(hospitalDto -> hospitalDto.getRegion(), String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
        return hospitalDtoList;

    }

    private List<HospitalDto> fetchHospitalList() {
        ResponseEntity<List<HospitalDto>> responseEntity = restTemplate.exchange(
                API_URL,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<HospitalDto>>() {}
        );

        List<HospitalDto> response = responseEntity.getBody();

        if (response == null) {
            throw new RuntimeException("Received null response from API");
        }

        return response;
    }

    private boolean yearFilter(HospitalDto h, int year, double percentage) {
            if (h.getPeriod()==null || h.getPctHospitalsMu()==null) {
                return false;
            }
            int recordYear = Integer.parseInt(h.getPeriod().trim());
            double recordPercentage = Double.parseDouble(h.getPctHospitalsMu().trim());
            return recordYear == year && recordPercentage >= percentage;
    }
}





