# Growfinix IPL Ticket Booking System

## Project Description

This project is a Java-based multi-threaded ticket booking system developed as part of the Growfinix Java Development Internship.

The application simulates a high-demand IPL ticket booking scenario where multiple users attempt to book a limited number of tickets simultaneously. It uses Java Threads, ExecutorService, and ReentrantLock to prevent race conditions and double booking.

## Features

* Simulates concurrent ticket booking
* Supports multiple users booking at the same time
* Prevents double booking using ReentrantLock
* Uses ExecutorService for thread management
* Displays successful and failed booking attempts
* Demonstrates thread synchronization

## Technologies Used

* Java 21
* Java Thread API
* ExecutorService
* ReentrantLock
* Java Collections Framework

## Project Structure

Growfinix-IPL-Ticket-Booking-System

* TicketBookingSystem.java
* README.md
* screenshots/

## How It Works

1. A limited number of tickets are available.
2. Multiple users attempt to book tickets simultaneously.
3. ReentrantLock ensures only one thread accesses the booking process at a time.
4. Successful bookings reduce the available ticket count.
5. Once tickets are sold out, further booking attempts fail.

## Sample Output

User-1 booked ticket successfully. Remaining: 49

User-2 booked ticket successfully. Remaining: 48

...

User-50 booked ticket successfully. Remaining: 0

User-51 booking failed. No tickets available.

User-52 booking failed. No tickets available.

...

User-100 booking failed. No tickets available.

## Learning Outcomes

* Understanding Multithreading
* Thread Synchronization
* ExecutorService Usage
* ReentrantLock Implementation
* Race Condition Prevention
* Concurrent Programming in Java

## Internship Task

Task 3 - IPL Ticket Booking System

Submitted for Growfinix Java Development Internship.
