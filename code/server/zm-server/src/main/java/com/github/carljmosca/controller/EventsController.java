/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.carljmosca.controller;

import com.github.carljmosca.repository.EventsRepository;
import com.github.carljmosca.zmv.entity.Events;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
@RequestMapping(value = "/events", produces = {MediaType.APPLICATION_JSON_VALUE})
public class EventsController {

    @Autowired
    EventsRepository eventsRepository;

//    @RequestMapping(method = GET)
//    public List<Events> findAll(@RequestParam(value = "page", required = false, defaultValue = "0") int page,
//            @RequestParam(value = "size", required = false, defaultValue = "20") int size,
//            Map<String, Boolean> sortOrders) {
//        List<Sort.Order> orders = sortOrders.entrySet().stream()
//                .map(e -> new Sort.Order(e.getValue() ? Sort.Direction.ASC : Sort.Direction.DESC, e.getKey()))
//                .collect(Collectors.toList());
//
//        PageRequest pageRequest = new PageRequest(page, size, orders.isEmpty() ? null : new Sort(orders));
//        return eventsRepository.findAll(pageRequest).getContent();
//    }
    /**
     *
     * @param pageable
     * @param assembler
     * @return
     */
    @RequestMapping(method = GET)
    public HttpEntity<PagedResources<Events>> findAll(Pageable pageable,
            PagedResourcesAssembler assembler) {
        Page<Events> events = eventsRepository.findAll(pageable);
        return new ResponseEntity<>(assembler.toResource(events), HttpStatus.OK);
    }

//    public Integer count() {
//        return Math.toIntExact(eventsRepository.count());
//    }
}
