/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.interfaces;

import com.service.types.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import sun.tools.java.ScannerInputReader;

/**
 *
 * @author osvaldo
 */
    @WebService(serviceName = "EmployeeService", targetNamespace = "http://soportetest.c6digbpdnlhw.us-east-1.rds.amazonaws.com")
public class EmployeeServiceImp {

    private static final List<Employee> EMPLOYEES = new ArrayList<>();
    
    @WebMethod
    @WebResult(name= "employee")
    public List<Employee> getEmployeeList(){
        return EMPLOYEES;
    }
    
    @WebMethod
    public boolean createEmployee(@WebParam(name = "employee") Employee employee){
        EMPLOYEES.add(employee);
        return true;
    }
    @WebMethod
    public int insertHrs(int hrs){
        Scanner sc = new Scanner(System.in);
        hrs = hrs + Integer.valueOf("introducir horas extra trabajadas: " + sc.nextLine()); 
        return hrs;
    }
    @WebMethod
    public boolean consultEmployee(int job_id){		
        for (int i = 0; i < getJob_id().length ; i++) {
            if()
            System.out.println();
	}
        
    }

    
}
