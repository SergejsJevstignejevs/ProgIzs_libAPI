package com.sj.libAPI.controllers;

import com.sj.libAPI.models.DTO.BookReservationDTO;
import com.sj.libAPI.models.entities.BookReservation;
import com.sj.libAPI.services.BookReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/bookReservations")
public class BookReservationController {

    @Autowired
    private BookReservationService _bookReservationService;

    @GetMapping
    public List<BookReservation> getAllBookReservations() {
        return _bookReservationService.getAllBookReservations();
    }

    @GetMapping("{id}")
    public BookReservation getBookReservationById(@PathVariable UUID id){
        return _bookReservationService.getBookReservationById(id);
    }

    @PostMapping
    public boolean addBookReservation(@RequestBody BookReservationDTO bookReservationDTO){
        return _bookReservationService.addBookReservation(bookReservationDTO);
    }

    @PutMapping("{id}")
    public void updateBookReservation(@PathVariable UUID id, @RequestBody BookReservationDTO bookReservationDTO){
        _bookReservationService.updateBookReservation(id, bookReservationDTO);
    }

    @DeleteMapping("{id}")
    public boolean deleteBookReservation(@PathVariable UUID id){
        return _bookReservationService.deleteBookReservation(id);
    }

}
