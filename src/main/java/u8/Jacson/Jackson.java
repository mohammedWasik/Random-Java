package u8.Jacson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Jackson {
    public static void main(String[] args) throws IOException {

        //serialize
        ObjectMapper objectMapper = new ObjectMapper();

        Employee employee = new Employee("Paul","Dhaka","IT","QA");

        employee.setName("Beyonce");

        objectMapper.writeValue(new File("src/main/resources/Employee.json"),employee);

        //deserialize
        Employee newEmp= objectMapper.readValue(new File("src/main/resources/Employee.json"),Employee.class);

        System.out.println(newEmp.getName());


    }
}
