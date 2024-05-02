package com.library.loans.domainclientlayer.patrons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
public class PatronModel {

    String patronId;
    String firstName;
    String lastName;
}