package kinoprogram.kinooblig;
import kinoprogram.kinooblig.Booking;
import kinoprogram.kinooblig.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {

    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/bookings")
    public void addBooking(@RequestBody Booking booking) {
        bookingService.addBooking(booking);
    }

    @GetMapping("/bookings")
    public List<Booking> getBookings() {
        return bookingService.getAllBookingsSortedByLastName();
    }
}


/*
import kinoprogram.kinooblig.Booking;
import kinoprogram.kinooblig.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;

    @PostMapping("/bookings")
    public void addBooking(@RequestBody Booking booking) {
        bookingRepository.save(booking);
    }

    @GetMapping("/bookings")
    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }
}




package kinoprogram.kinooblig;

import kinoprogram.kinooblig.Booking;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;



@RestController
public class BookingController {

    // her er arrayet flyttet til server 
    private List<Booking> bookings = new ArrayList<>();

    @PostMapping("/bookings")
    public void addBooking(@RequestBody Booking booking) {
        bookings.add(booking);
    }
   // @GetMapping("/bookings")
    @GetMapping("/bookings")
    public List<Booking> getBookings() {
        return bookings;
    }
}


 */
