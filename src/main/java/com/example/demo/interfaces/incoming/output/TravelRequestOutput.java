package com.example.demo.interfaces.incoming.output;

import com.example.demo.domain.TravelRequestStatus;
import lombok.Data;
import java.util.Date;

@Data
public class TravelRequestOutput {

    Long id;
    String origin;
    String destination;
    TravelRequestStatus status;
    Date creationDate;
}