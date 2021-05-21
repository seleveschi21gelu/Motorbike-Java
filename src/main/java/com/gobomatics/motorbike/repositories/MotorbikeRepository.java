package com.gobomatics.motorbike.repositories;

import com.gobomatics.motorbike.models.Motorbike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotorbikeRepository extends JpaRepository<Motorbike,Long> {
}
