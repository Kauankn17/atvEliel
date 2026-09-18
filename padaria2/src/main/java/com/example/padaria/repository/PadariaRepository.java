package com.example.padaria.repository;

import com.example.padaria.models.PadariaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PadariaRepository extends JpaRepository<PadariaModel, Long> {
}
