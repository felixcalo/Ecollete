package com.apiEcollete.apiEcollete.pointsRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.apiEcollete.apiEcollete.pointsModel.Items;

public interface ItemsRepository extends JpaRepository<Items,Long> {

}
