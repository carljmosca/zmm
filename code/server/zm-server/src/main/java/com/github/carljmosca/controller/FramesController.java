/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.carljmosca.controller;

import com.github.carljmosca.repository.FramesRepository;
import com.github.carljmosca.zmv.entity.Frames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author moscac
 */
@RestController
@RequestMapping(value = "/frames", produces = {MediaType.APPLICATION_JSON_VALUE})
public class FramesController {

    @Autowired
    FramesRepository framesRepository;
    
    /**
     *
     * @return
     */
    @RequestMapping(method = GET)
    public HttpEntity<PagedResources<Frames>> findAll(Pageable pageable,
            PagedResourcesAssembler assembler) {
        
        Page<Frames> frames = framesRepository.findAll(pageable);
        
        //PageRequest pageRequest = new PageRequest(page, limit, orders.isEmpty() ? null : new Sort(orders));
        return new ResponseEntity<>(assembler.toResource(frames), HttpStatus.OK);
    }

//    public Integer count() {
//        return Math.toIntExact(framesRepository.count());
//    }
}