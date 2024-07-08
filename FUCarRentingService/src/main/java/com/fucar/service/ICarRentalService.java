package com.fucar.service;

import com.fucar.pojo.CarRental;

import java.time.LocalDate;
import java.util.List;

public interface ICarRentalService {
    void save(CarRental carRental);
    void update(CarRental carRental);
    void delete(int rentalID);
    CarRental findById(int rentalID);
    List<CarRental> findAll();
    List<CarRental> findByCustomerIdOrderByPickupDateDesc(int customerID);
    List<CarRental> findByPeriodDate(LocalDate startDate, LocalDate endDate);
    boolean checkCarIsRentedInThisDate(int carID, LocalDate startDate, LocalDate endDate);
    boolean checkCarIsRent(int carID);
}