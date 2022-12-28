package com.fronchak.DSLearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fronchak.DSLearn.entities.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {

}
