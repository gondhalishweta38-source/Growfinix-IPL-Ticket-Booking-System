import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

class TicketCounter {
    private int availableTickets = 50;
    private final ReentrantLock lock = new ReentrantLock();

    public void bookTicket(String user) {
        lock.lock();

        try {
            if (availableTickets > 0) {
                System.out.println(user +
                        " booked ticket successfully. Remaining: "
                        + (--availableTickets));
            } else {
                System.out.println(user +
                        " booking failed. No tickets available.");
            }
        } finally {
            lock.unlock();
        }
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {

        TicketCounter counter = new TicketCounter();

        ExecutorService executor =
                Executors.newFixedThreadPool(10);

        for (int i = 1; i <= 100; i++) {
            int userId = i;

            executor.submit(() ->
                    counter.bookTicket("User-" + userId));
        }

        executor.shutdown();
    }
}