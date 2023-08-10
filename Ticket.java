/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;
import java.time.LocalDateTime;
/**
 *
 * @author User
 */
public class Ticket {
    private static int orderId=2001;
    private Member member;
    private int pax;
    private int[][][] seat;
    private Movie movie; 
    private LocalDateTime bookingTime;
    private double price;

    //constructor
    public Ticket(){}

    public Ticket(Member member, int pax, int[][][] seat, Movie movie, LocalDateTime bookingTime) {
        orderId++;
        this.member = member;
        this.pax = pax;
        this.seat = seat;
        this.movie = movie;
        this.bookingTime = bookingTime;
    }

    //getter
    public static int getOrderId() {
        return orderId;
    }

    public Member getMember() {
        return member;
    }

    public int getPax() {
        return pax;
    }

    public int[][][] getSeat() {
        return seat;
    }

    public Movie getMovie() {
        return movie;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public double getPrice() {
        return price;
    }

    
    //setter
    public void setMember(Member member) {
        this.member = member;
    }

    public void setPax(int pax) {
        this.pax = pax;
    }

    public void setSeat(int[][][] seat) {
        this.seat = seat;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setBookingTime(LocalDateTime bookingTime) {
        this.bookingTime = bookingTime;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Booking{" + "orderId=" + orderId + ", member=" + member + ", pax=" + pax + ", seat=" + seat + ", movie=" + movie + ", bookingTime=" + bookingTime + ", price=" + price + '}';
    }

    

    
    
    
    
    
    
    
}
