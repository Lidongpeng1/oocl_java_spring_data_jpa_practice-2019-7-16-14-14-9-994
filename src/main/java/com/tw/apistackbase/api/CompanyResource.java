package com.tw.apistackbase.api;

import com.tw.apistackbase.core.Company;
import com.tw.apistackbase.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyResource {

//    List<>

//    @GetMapping(produces = {"application/json"})
//    public Iterable<Company> list() {
//        return null;
//    }
//
//    @PostMapping(produces = {"application/json"})
//    public Company add(@RequestBody Company company) {
//        return null;
//    }


    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping()
    public List<Company> getCompany() {
        return companyRepository.findAll();
    }

    @PostMapping()
    public Company addCompany(@RequestBody Company company){
        companyRepository.saveAndFlush(company);
        return companyRepository.findById(company.getId()).get();
    }

}
