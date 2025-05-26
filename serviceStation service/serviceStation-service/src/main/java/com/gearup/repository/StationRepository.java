package com.gearup.repository;

import com.gearup.model.serviceStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StationRepository extends JpaRepository<serviceStation,Long> {
    serviceStation findByOwnerId(Long id);

    @Query(
            "select s from serviceStation s where" +
                    "(lower(s.city) like lower(concat('%', :keyword, '%')) OR " +
                    "lower(s.name) like lower(concat('%', :keyword, '%')) OR " +
                    "lower(s.address) like lower(concat('%', :keyword, '%')) )"
    )
    List<serviceStation> searchStations(@Param("keyword") String keyword);


}
