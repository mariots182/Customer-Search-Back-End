package com.fakecompany.customers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


@RestController
public class CustomerController {
    private final CustomerRepository repository;

    CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/customers")
    @CrossOrigin(origins = "http://localhost:4200")
    List<Customer> all() {
        return repository.findAll();
    }

    @GetMapping("/customer")
	@CrossOrigin(origins = "http://localhost:4200")
    public Customer getCustomerByCedula(@RequestParam("docType") String docType, @RequestParam("docNumber") String docNumber) {
 
        Customer customer = new Customer();
        
        if(!docType.equals("C") && !docType.equals("P") ) {
              throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "HTTP Status will be BAD REQUEST (CODE 400)\n");  
        }
   
        if(docType.equals("C")) {
            try {
                customer = this.repository.findByCedula(docNumber);
            } catch (Exception e) {
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "HTTP Status will be INTERNAL SERVER ERROR (CODE 500)\n");
            }

            if(customer == null){
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "HTTP Status will be NOT FOUND (CODE 404)\n");
            }
            
            return customer;
        } else {
            try {
                customer = this.repository.findByPasaporte(docNumber);
            } catch (Exception e) {
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "HTTP Status will be INTERNAL SERVER ERROR (CODE 500)\n");
            }
            
            if(customer == null){
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "HTTP Status will be NOT FOUND (CODE 404)\n");
            }

            return customer;
        }
        
    }

}
