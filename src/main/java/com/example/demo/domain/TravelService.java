package com.example.demo.domain;

import com.example.demo.interfaces.outcoming.GMapsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TravelService {
    @Autowired
    TravelRequestRepository travelRequestRepository;

    @Autowired
    GMapsService gMapsService;

    private static final int MAX_TRAVEL_TIME = 600;

    public List<TravelRequest> listNearbyTravelRequests(String currentAddress) {
        List<TravelRequest> requests = travelRequestRepository.findByStatus(TravelRequestStatus.CREATED);
        return requests
                .stream()
                .filter(tr -> gMapsService.getDistanceBetweenAddresses(currentAddress, tr.getOrigin()) < MAX_TRAVEL_TIME)
                .collect(Collectors.toList());
    }

    public TravelRequest saveTravelRequest(TravelRequest travelRequest){
        travelRequest.setStatus(TravelRequestStatus.CREATED);
        travelRequest.setCreationDate(new Date());
        return travelRequestRepository.save(travelRequest);
    }
}
