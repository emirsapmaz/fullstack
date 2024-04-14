package com.example.nutribalance.Repositries;

import com.example.nutribalance.Entities.Weight;
import com.example.nutribalance.Entities.WeightId;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WeightRepositry extends JpaRepository<Weight,Long>{
    

}
