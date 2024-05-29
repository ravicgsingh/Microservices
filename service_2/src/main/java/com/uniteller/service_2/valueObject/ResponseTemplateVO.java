package com.uniteller.service_2.valueObject;

import com.uniteller.service_2.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private Employee employee;
    private Department department;
}
