import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Gym {
    private final int totalGymMembers;
    private Map<MachineType, Integer> availableMachines;

    public Gym(int totalGymMembers, Map<MachineType, Integer> availableMachines) {
        this.totalGymMembers = totalGymMembers;
        this.availableMachines = availableMachines;
    }

    public static void main(String[] args) {

        Gym nicosGym = new Gym(50,new HashMap<>(){

            {
                put(MachineType.LEGPRESSMACHINE,15);
                put(MachineType.BARBELL,15);
                put(MachineType.SQUATMACHINE,15);
                put(MachineType.LEGEXTENSIONMACHINE,15);
                put(MachineType.LEGCURLMACHINE,15);
                put(MachineType.CABLECROSSOVERMACHINE,15);
            }

        });

        nicosGym.openForTheDay();

    }

    // Each member is going to be a thread, so the member's ID is going to be its corresponding Thread name.
    public void openForTheDay(){
        List<Thread> gymMembersRoutines;

        // Amount of threads is going to be equal to amount of gym members
        gymMembersRoutines = IntStream.rangeClosed(1, this.totalGymMembers).mapToObj( (id) -> {

            Member member = new Member(id);

            return new Thread(() -> {
               try{
                   member.performRoutine();
               } catch (Exception e){
                   System.out.println(e);
               }
            });
        }).collect(Collectors.toList());


        Thread supervisor = createSupervisor(gymMembersRoutines);
        supervisor.start();

        // This is method referencing
        gymMembersRoutines.forEach(Thread::start);
    }

    // Supervisor thread
    private Thread createSupervisor(List<Thread> threads){

        Thread supervisor = new Thread(() -> {

            while (true){

                List<String> runningThreads = threads.stream().filter( t -> t.isAlive()).map(t -> t.getName()).collect(Collectors.toList());

                System.out.println(Thread.currentThread().getName() + " Member is working out" + "\n" +
                        "" + "There are " + runningThreads.size() + " members working out" + "\n" + runningThreads);

                if (runningThreads.isEmpty()){
                    break;
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    System.out.println(e);
                }
            }
            Thread.currentThread().getName();
            System.out.println("All threads have completed");

        });

        supervisor.setName("Gym Staff");

        return supervisor;
    }







}
