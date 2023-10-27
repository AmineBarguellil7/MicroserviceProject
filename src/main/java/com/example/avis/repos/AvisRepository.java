package com.example.avis.repos;

import com.example.avis.entity.Avis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvisRepository extends JpaRepository<Avis,Integer> {
}
