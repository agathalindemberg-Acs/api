package com.example.demo.interfaces.incoming;

import com.example.demo.domain.TravelRequest;
import com.example.demo.domain.TravelService;
import com.example.demo.interfaces.incoming.input.TravelRequestInput;
import com.example.demo.interfaces.incoming.mapping.TravelRequestMapper;
import com.example.demo.interfaces.incoming.output.TravelRequestOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.hateoas.EntityModel;

import javax.validation.Valid;
import java.util.List;

@Service
@RestController
@RequestMapping(path = "/travelRequests", produces = MediaType.APPLICATION_JSON_VALUE)
public class TravelRequestAPI {

    @Autowired
    TravelService travelService;

    @Autowired
    TravelRequestMapper mapper;

    @PostMapping
    public EntityModel<TravelRequestOutput> makeTravelRequest (@RequestBody @Valid TravelRequestInput travelRequestInput) {
        TravelRequest request = travelService.saveTravelRequest(mapper.map(travelRequestInput));
        TravelRequestOutput output = mapper.map(request);
        return mapper.buildOutputModel(request, output);
    }

    @GetMapping("/nearby")
    public List<EntityModel<TravelRequestOutput>> listNearbyRequests(@RequestParam String currentAddress){
        return null;
    }
}
