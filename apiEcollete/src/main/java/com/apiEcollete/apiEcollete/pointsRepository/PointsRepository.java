package com.apiEcollete.apiEcollete.pointsRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiEcollete.apiEcollete.pointsModel.Points;

public interface PointsRepository extends JpaRepository<Points, Long> {

	Points findById(long id);

	Points deleteById(long id);
	

	@SuppressWarnings("unchecked")
	Points save(Points point);
}
