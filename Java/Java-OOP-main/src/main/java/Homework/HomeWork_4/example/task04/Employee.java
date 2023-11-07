package Homework.HomeWork_4.example.task04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String fio;
    private Double salary;
    private String jobTitle;
}