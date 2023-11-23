package com.rentalhive.rentalhive.controller;

import com.rentalhive.rentalhive.model.Estimate;
import com.rentalhive.rentalhive.service.EstimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estimate")
public class EstimateController {

    @Autowired
    private EstimateService estimateService;

    @GetMapping
    public List<Estimate> getAllEstimates() {
        return estimateService.getAllEstimates();
    }

    @GetMapping("/{id}")
    public Estimate getEstimateById(@PathVariable int id) {
        return estimateService.getEstimateById(id);
    }

    @PostMapping
    public Estimate addEstimate(@RequestBody Estimate estimate) {
        return estimateService.addEstimate(estimate);
    }

    @PutMapping("/{id}")
    public Estimate updateEstimate(@PathVariable int id, @RequestBody Estimate estimate) {
        return estimateService.updateEstimate(id, estimate);
    }

    @DeleteMapping("/{id}")
    public void deleteEstimate(@PathVariable int id) {
        estimateService.deleteEstimate(id);
    }
}