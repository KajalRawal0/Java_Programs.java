import java.util.Scanner;

public class quiz_game {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        String questions[]={
            "What is the capital of India?",
            "Which planet is known as the Red Planet?",
            "What is the hardest natural substance on Earth?",
            "Which element is said to keep bones strong?",
            "What is the largest ocean on Earth?",
            "What is the boiling point of water?",
            "What is the tallest mountain in the world?",
            "In which year did man first land on the moon?",
            "Who is known as the Father of the Computer?",
            "Who invented the telephone?"
        };

        String options[][] = {
            {"Madhya Pradesh", "Goa", "Delhi", "Maharastra"},
            {"Mars", "Venus", "Earth", "Jupiter"},
            {"Gold", "Iron", "Quartz", "Diamond"},
            {"Oxygen", "Hydrogen", "Calcium", "Carbonate"},
            {"Indian Ocean", "Atlantic Ocean", "Pacific Ocean", "Arctic Ocean"},
            {"50°C", "100°C", "75°C", "150°C"},
            {"Mount Everest", "K2", "Kangchenjunga", "Lhotse"},
            {"1972", "1968", "1975", "1969"},
            {"Albert Einstein", "Charles Babbage", "Alan Turing", "Thomas Edison"},
            {" Nikola Tesla", "Alexander Graham Bell", "Thomas Edison", "Guglielmo Marcon"}
        };

        int answers[] = {3,1,4,3,3,2,1,4,1,2};

        int score = 0;

        for(int i=0; i<questions.length; i++){
            System.out.println(questions[i]);

            for(int j=0; j<options[i].length; j++){
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer from (1-4):");
            int userAnswer=sc.nextInt();


            if(userAnswer==answers[i]){
                System.out.println("Correct!");
                score++;
            }
            else{
                System.out.println("Wrong! The correct option is "+options[i][answers[i]-1]);
            }
        }
        System.out.println("Your final score is " + score +"/"+ questions.length);

    }
}
