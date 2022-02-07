package MyersBriggsApp;

import java.util.Scanner;

public class MyersBriggs {
           private   String[] questions = {"""
            Question 1
            A: expend energy, enjoy groups
            B: conserve energy, enjoy one-on-one""", """
            Question 2     
            A: interpret literally
            B: look for meaning and possibilities""", """
            Question 3
            A: logical, thinking, questioning 
            B: empathetic, feeling, accommodating""","""
            Question 4
            A: organized, orderly
            B: flexible, adaptable""","""
            Question 5
            A: more outgoing, think out loud
            B: more reserved, think to yourself""","""
            Question 6
            A: practical, realistic, experiential 
            B: imaginative, innovative, theoretical""","""
            Question 7
            A: candid, straightforward, frank
            B: tactful, kind, encouraging ""","""
            Question 8    
            A: plan, schedule
            B: unplanned, spontaneous""","""
            Question 9
            A: seek many tasks, public activities, interaction with others 
            B: seek private, solitary activities with quiet to concentrate""","""
            Question 10
            A: standard, usual, conventional 
            B: different, novel, unique""","""
            Question 11
            A: firm, tend to criticize, hold the line
            B: gentle,tend to appreciate, conciliate""","""
            Question 12
            A: regulated,structured 
            B: easy-going,'live' and 'let live""","""
            Question 13
            A: external, communicative, express yourself
            B: internal, reticent, keep to yourself""","""
            Question 14
            A: focus on here-and-now
            B: look to the future, global perspective,'big picture""","""
            Question 15
            A: tough-minded,just
            B: tender-hearted, merciful""","""
            Question 16
            A: preparation,plan ahead
            B: go with the flow, adapt as you go""","""
            Question 17
            A: active, initiate 
            B: reflective, deliberate""","""
            Question 18
            A: facts, things,'what is'
            B: ideas, dreams, 'what could be', philosophical""","""
            Question 19
            A: matter of fact, issue-oriented
            B: sensitive, people-oriented, compassionate""","""
            Question 20
            A: control,govern
            B: latitude, freedom"""};

           private final String [] responses = new String[20];
           private String personalityTrait;

        public static void main(String[] args) {
            MyersBriggs questionnaire = new MyersBriggs();
            questionnaire.collectResponse();
            questionnaire.displayAllResponses();
            questionnaire.displayAllCharacterTrait();
        }

        public void collectResponse(){
               System.out.println("""
                       Welcome to MyersBriggs Personality Test Application
                       Choose the option that best describes you personality
                       """);
               for (int question = 0; question < questions.length; question++){
                   System.out.println("Choose either A or B :");
                   System.out.println(questions[question]);
                   Scanner input = new Scanner(System.in);
                   String response =input.nextLine().toUpperCase();
                   while(!response.equalsIgnoreCase("A") && !response.equalsIgnoreCase("B")) {
                       System.out.println("""
                   Invalid Response!!!
                   Choose either A or B""");
                       System.out.println(questions[question]);
                       response =input.nextLine().toUpperCase();
                   }
                   responses[question] = response;
               }
           }

           public String extrovertsIntrovertsPersonality(){
               int aCounter = 0;

               for (int response= 0; response < responses.length; response+=4){
                   if(responses[response].equals("A")){
                       aCounter++;
                   }
               }
               System.out.printf("E = %d :  I = %d%n",aCounter,5-aCounter);
               if(aCounter > 3){
                   personalityTrait = "Extrovert";
               }else {
                   personalityTrait = "Introvert";
               }
               return personalityTrait;
           }

        public String sensorsIntuitivesPersonality(){
            int aCounter = 0;
            for (int response= 1; response < responses.length; response+=4){
                if(responses[response].equals("A")){
                    aCounter++;
                }
            }
            System.out.printf("S = %d :  N = %d%n",aCounter,5-aCounter);

            if(aCounter > 3){
                personalityTrait = "Sensor";
            }else {
                personalityTrait = "Intuitive";
            }
            return personalityTrait;
        }

        public String thinkersFeelersPersonality(){
            int aCounter = 0;
            for (int response= 2; response < responses.length; response+=4){
                if(responses[response].equals("A")){
                    aCounter++;
                }
            }
            System.out.printf("T = %d :  F = %d%n",aCounter,5-aCounter);

            if(aCounter > 3){
                personalityTrait = "Thinker";
            }else {
                personalityTrait = "Feeler";
            }
            return personalityTrait;
        }

        public String judgersPerceiversPersonality(){
            int aCounter = 0;
            for (int response= 3; response < responses.length; response+=4){
                if(responses[response].equals("A")){
                    aCounter++;
                }
            }
            System.out.printf("J = %d :  P = %d%n",aCounter,5-aCounter);

            if(aCounter > 3){
                personalityTrait = "Judger";
            }else {
                personalityTrait = "Perceiver";
            }
            return personalityTrait;
        }

        public void displayAllResponses(){
            int count = 1;
            System.out.println("Your responses:");
               for(String response : responses ){
                   System.out.printf("Question%02d: %s%n",count,response);
                   count++;
               }
        }
        public void displayAllCharacterTrait(){
            System.out.println();
            System.out.println("The result for your Personality Trait: ");
            System.out.println(extrovertsIntrovertsPersonality());
            System.out.println(sensorsIntuitivesPersonality());
            System.out.println(thinkersFeelersPersonality());
            System.out.println(judgersPerceiversPersonality());
        }
    //    public void validateResponses(){
    //     System.out.println("""
    //               Invalid Response!!!
    //               Choose either A or B""");
    //                   System.out.println(questions[question]);
    //                   response =input.nextLine().toUpperCase();
    //    }
        }



