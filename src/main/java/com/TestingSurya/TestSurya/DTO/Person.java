package com.TestingSurya.TestSurya.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
public class Person {

    private int id;
    private String name;
    private String city;
    private String mobile;



}
