public class Question {

    enum Difficulty {
        EASY, MEDIUM, HARD;
    }

    private String question;
    private Difficulty difficulty;

    public Question(Difficulty difficulty, String question) {
        this.difficulty = difficulty;
        this.question = question;
    }

    public Difficulty getDifficulty() {
        return this.difficulty;
    }

    public String getQuestion() {
        return this.question;
    }
}