package com.kodilla.patterns2.adapter.company.newhrsystem;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.math.BigDecimal;
import java.util.List;

public class CompanySalaryProcessor implements SalaryProcessor {
    @Override
    public BigDecimal calculatesSalaries(List<Employee> employees) {
        BigDecimal sum = BigDecimal.ZERO;
        for(Employee employee : employees) {
            System.out.println(employee);
            sum = sum.add(employee.getBaseSalary());
        }
        return sum;
    }
}
