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
public class Movie {
    private String title;
    private String genre;
    private int durationMinutes;
    private LocalDateTime timeAvailable;
    private boolean status;

    //constructor
    public Movie(){}
    
    public Movie(String title, String genre, int durationMinutes, LocalDateTime timeAvailable, boolean status) {
        this.title = title;
        this.genre = genre;
        this.durationMinutes = durationMinutes;
        this.timeAvailable = timeAvailable;
        this.status = status;
    }
    
    //getter

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public LocalDateTime getTimeAvailable() {
        return timeAvailable;
    }

    public boolean isStatus() {
        return status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public void setTimeAvailable(LocalDateTime timeAvailable) {
        this.timeAvailable = timeAvailable;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", genre=" + genre + ", durationMinutes=" + durationMinutes + ", timeAvailable=" + timeAvailable + ", status=" + status + '}';
    }
    
    
    
}
