import java.util.Arrays;
import java.util.List;

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

        questions.stream().forEach(q -> {

            new Thread(() -> {
                c.ask(q);
            }).start();



        });
    }
}