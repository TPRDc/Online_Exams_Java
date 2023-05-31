package exams;
import java.util.ArrayList;
import java.util.Scanner;
public class Online_exams {
    String name,userAnswer;
    int score;
    ArrayList<String> failedQuestion =new ArrayList<String>();
    Scanner input = new Scanner(System.in);

    public void remark(){
        System.out.println("\n\t******************* RESULT *******************");
        if(this.score >= 20){
            System.out.println("\tStudent Name: "+this.name+"\n\tRemark: Excellent\n\tScore: "+this.score+"\n\tFailed Questions: "+failedQuestion);
        } else if(this.score >= 15){
            System.out.println("\tStudent Name: "+this.name+"\n\tRemark: Very Good\n\tScore: "+this.score+"\n\tFailed Questions: "+failedQuestion);
        } else if(this.score >= 10){
            System.out.println("\tStudent Name: "+this.name+"\n\tRemark: Good\n\tScore: "+this.score+"\n\tFailed Questions: "+failedQuestion);
        } else if(this.score >= 5){
            System.out.println("\tStudent Name: "+this.name+"\n\tRemark: Poor\n\tScore: "+this.score+"\n\tFailed Questions: "+failedQuestion);
        }  else {
            System.out.println("\tStudent Name: "+this.name+"\n\tRemark: Fail\n\tScore: "+this.score+"\n\tFailed Questions: "+failedQuestion);
        }
    }
    public void askQuestion(){
        System.out.print("""
                Question 1) who is a boy.
                
                a) a male human being.
                b) a man.
                c) a girl.

                Enter your answer =>""");
        this.userAnswer = this.input.next();
        question("a", this.userAnswer);
        if(this.userAnswer.equalsIgnoreCase("a")){
            failedQuestion.clear();
        } else {
            failedQuestion.add("Question 1");
        }

        System.out.print("""
                
                Question 2) who is a girl.
                
                a) a woman.
                b) a female human being.
                c) a boy.

                Enter your answer =>    \s""");
        this.userAnswer = this.input.next();
        question("b", this.userAnswer);
        if(this.userAnswer.equalsIgnoreCase("b")){
            failedQuestion.clear();
        } else {
            failedQuestion.add("Question 2");
        }

        System.out.print("""
                
                Question 3) 2+2-4x7.
                
                a) 0
                b) 4
                c) 8

                Enter your answer =>    \s""");
        this.userAnswer = this.input.next();
        question("a", this.userAnswer);
        if(this.userAnswer.equalsIgnoreCase("a")){
            failedQuestion.clear();
        } else {
            failedQuestion.add("Question 3");
        }

        System.out.print("""
                
                Question 4) 2 raised to the power of 4.
                
                a) 8
                b) 4
                c) 16

                Enter your answer =>     \s""");
        this.userAnswer = this.input.next();
        question("c", this.userAnswer);
        if(this.userAnswer.equalsIgnoreCase("c")){
            failedQuestion.clear();
        } else {
            failedQuestion.add("Question 4");
        }

        System.out.print("""
                
                Question 5) Which of the following best's describe a computer.
                
                a) an electronic device that receives, process\s
                data and sends out information as output.
                b) an electronic device that calculate's.
                c) an electronic device that calculate's, type's, print's
                and has internet access.

                Enter your answer =>     \s""");
        this.userAnswer = this.input.next();
        question("a", this.userAnswer);
        if(this.userAnswer.equalsIgnoreCase("a")){
            failedQuestion.clear();
        } else {
            failedQuestion.add("Question 5");
        }

        System.out.print("""
                
                Question 6) Value of PIE in decimal.
                
                a) 227/7
                b) 22/7
                c) 27.7/7.7

                Enter your answer =>     \s""");
        this.userAnswer = this.input.next();
        question("b", this.userAnswer);
        if(this.userAnswer.equalsIgnoreCase("b")){
            failedQuestion.clear();
        } else {
            failedQuestion.add("Question 6");
        }

        System.out.print("""
                
                Question 7) Which of the the following is a high level programming language
                
                a) Python, PHP, Java.
                b) Html, CSS, Xml.
                c) Assembly Language, BASIC, QBASIC.

                Enter your answer =>     \s""");
        this.userAnswer = this.input.next();
        question("a", this.userAnswer);
        if(this.userAnswer.equalsIgnoreCase("a")){
            failedQuestion.clear();
        } else {
            failedQuestion.add("Question 7");
        }

        System.out.print("""
                
                Question 8) In python what dose print(type(1)) do.
                
                a) print's 1.
                b) display's 1.
                c) displays the data type of argument 1.

                Enter your answer =>    \s""");
        this.userAnswer = this.input.next();
        question("c", this.userAnswer);
        if(this.userAnswer.equalsIgnoreCase("c")){
            failedQuestion.clear();
        } else {
            failedQuestion.add("Question 8");
        }

        System.out.print("""
                
                Question 9) Is microsoft word a spreed sheet package.
                
                a) yes its not.
                b) no it is.
                c) no or yes.

                Enter your answer =>     \s""");
        this.userAnswer = this.input.next();
        question("b", this.userAnswer);
        if(this.userAnswer.equalsIgnoreCase("b")){
            failedQuestion.clear();
        } else {
            failedQuestion.add("Question 9");
        }

        System.out.print("""
                
                Question 10) 20/CSC/084 falls under which data type in programming.
                
                a) String
                b) Integer
                c) Float / Double

                Enter your answer =>     \s""");
        this.userAnswer = this.input.next();
        question("a", this.userAnswer);
        if(this.userAnswer.equalsIgnoreCase("a")){
            failedQuestion.clear();
        } else {
            failedQuestion.add("Question 10");
        }

        System.out.println("\nChecking answers......................\nLoading Result......................\n");
        remark();
    }

    public void question(String questionAnswer, String userAnswer) {

        if (userAnswer.equalsIgnoreCase(questionAnswer)) {
            this.score+=2;
        }
    }

    public void welcomePage(){
        System.out.print("""
                        
                        \t\t********* Welcome to TPRDc Online Exams On General Studies *********
                        \t      Answer a Total of 10 Question, each question carry's 2 marks
                        \t for question which  you have no ideal type in next or skip
                        \t\t\t                  good luck \s
                        
                        Enter Your Name =>\s"""); name = input.next();
                        System.out.println("\n\t\t\t                 QUESTION'S");
    }

    public static void main(String[] args) {
        Online_exams exam = new Online_exams();
        exam.welcomePage();
        exam.askQuestion();
    }
}
