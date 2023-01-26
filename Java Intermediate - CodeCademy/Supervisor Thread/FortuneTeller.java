import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FortuneTeller {

    public static void main(String[] args) {

        List<Question> questions = Arrays.asList(
                new Question(Question.Difficulty.EASY, "Am I a good coder?"),
                new Question(Question.Difficulty.MEDIUM, "Will I be able to finish this course?"),
                new Question(Question.Difficulty.EASY, "Will it rain tomorrow?"),
                new Question(Question.Difficulty.EASY, "Will it snow today?"),
                new Question(Question.Difficulty.HARD, "Are you really all-knowing?"),
                new Question(Question.Difficulty.HARD, "Do I have any hidden talents?"),
                new Question(Question.Difficulty.HARD, "Will I live to be greater than 100 years old?"),
                new Question(Question.Difficulty.MEDIUM, "Will I be rich one day?"),
                new Question(Question.Difficulty.MEDIUM, "Should I clean my room?")
        );

        CrystalBall c = new CrystalBall();

        // The .map will transform the List of Questions into a List of Threads.
        List<Thread> threads = questions.stream().map(q -> {

            Thread t = new Thread(() -> {
                c.ask(q);
          });
          return t;

        }).collect(Collectors.toList());

        // Create the Supervisor, and send to it the list of threads to supervise.
        Thread supervisor = createSupervisor(threads);

        // Starts each thread from the List of Threads
        threads.stream().forEach(t -> t.start());
        // After starting the threads, I start the supervisor
        supervisor.start();



    }

    public static Thread createSupervisor(List<Thread> threads) {

        // It creates the supervisor
        Thread supervisor = new Thread(() -> {

            while (true) {

                //It filters out the list of threads, check which threads are running, for the ones that are running it
                // gets their name, collects them by name and converts them to a List.
                List<String> runningThreads = threads.stream().filter(t -> t.isAlive()).map(t -> t.getName()).collect(Collectors.toList());

                // Displays the running threads
                System.out.println(Thread.currentThread().getName() + " - Currently running threads: " + runningThreads);

                // If there are no more threads running, the supervisor ends its process
                if (runningThreads.isEmpty()) {
                    break;
                }
                try {
                    // If there are threads running, it waits for 1sec and checks again for alive threads.
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
            System.out.println(Thread.currentThread().getName() + " - All threads completed!");
        });

        // Set the name here...
        supervisor.setName("Supervisor");

        return supervisor;
    };
}