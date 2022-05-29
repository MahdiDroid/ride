package com.mehdi.ride.Repository;


import com.mehdi.ride.Entity.ThemeParkRide;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThemeParkRideRepository extends CrudRepository<ThemeParkRide,Long> {

    ThemeParkRide findByName(String name);
}
