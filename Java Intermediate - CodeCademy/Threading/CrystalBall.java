import java.util.Random;

public class CrystalBall extends Thread {
    private Question question;

    public CrystalBall(Question question){
     this.question = question;
    }

    @Override
    public void run() {
        ask(this.question);
    }

    private int getSleepTimeInMs(Question.Difficulty difficulty) {
        switch (difficulty) {
            case EASY:
                return 1000;
            case MEDIUM:
                return 2000;
            case HARD:
                return 3000;
            default:
                return 500;
        }
    }

    private String answer() {
        String[] answers = {
                "Signs point to yes!",
                "Certainly!",
                "No opinion",
                "Answer is a little cloudy. Try again.",
                "Surely.",
                "No.",
                "Signs point to no.",
                "It could very well be!"
        };
        return answers[new Random().nextInt(answers.length)];
    }

    private void think(Question question) {
        System.out.println("Hmm... Thinking");
        try {
            Thread.sleep(this.getSleepTimeInMs(question.getDifficulty()));
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Done!");
    }

    public void ask(Question question) {
        System.out.println("Good question! You asked: " + question.getQuestion());
        this.think(question);
        System.out.println("Answer: " + this.answer());
    }
}