/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.carljmosca.repository;

import com.github.carljmosca.zmv.entity.Frames;
import com.github.carljmosca.zmv.entity.FramesPK;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author moscac
 */
@Repository
public interface FramesRepository extends JpaRepository<Frames, FramesPK> {
    
    @Query(value = "select * from Frames where EventId = :eventId order by timeStamp desc limit :offset, :rowcount", nativeQuery = true)
    List<Frames> findByEventId(@Param("offset") int offset, @Param("rowcount") int rowcount, @Param("eventId") int eventId);

}
