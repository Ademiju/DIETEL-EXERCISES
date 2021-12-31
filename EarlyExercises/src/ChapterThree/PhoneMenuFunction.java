package chapterThree;

import java.util.Scanner;

public class PhoneMenuFunction {

    public static void main(String[] args) {
        String prompt = """
                PRESS 1 for Phone book
                PRESS 2 for Messages
                PRESS 3 for Chat
                PRESS 4 for Call register
                PRESS 5 for Tones
                PRESS 6 for Settings
                PRESS 7 for Call divert
                PRESS 8 for Games
                PRESS 9 for Calculator
                PRESS 10 for Reminders
                PRESS 11 for Clock
                PRESS 12 for Profiles
                PRESS 13 for SIM services""";
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:

                String prompt1 = """
                        1. Search
                        2. Service Nos
                        3. Add Name
                        4. Erase
                        5. Edit
                        6. Assign Tone
                        7. Send b'card");
                        8. Options
                        9. Speed dials
                        10. Voice tags""";
                System.out.println(prompt1);
                int option = input.nextInt();
                if (option == 8) {
                    System.out.println("1. Type of view");
                    System.out.println("2. Memory status");
                    switch (option) {
                        case 1:
                            System.out.println("ok");
                            break;
                        case 2:
                            System.out.println(" ok");
                            break;
                        default:
                            System.out.println("invalid option");
                    }
                } else {
                    System.out.println("done");
                }

                break;
            case 2:
                String prompt2 = """
                        1. Write messages
                        2. Inbox
                        3. Outbox
                        4. Picture messages
                        5. Templates
                        6. Smileys
                        7. Message settings
                        8. Info service
                        9. Voice mailbox number
                        10. Service command editor
                        """;
                System.out.println(prompt2);
                int messageSetting = input.nextInt();
                if (messageSetting == 7) {
                    System.out.println("1. Set 1 ");
                    System.out.println("2. Common ");
                } else {
                    System.out.println("done");
                }
                int input1 = input.nextInt();
                switch (input1) {
                    case 1:
                        System.out.println("1. Message centre number");
                        break;
                    case 2:
                        System.out.println("2. Message sent as");
                        break;
                    case 3:
                        System.out.println("3. Message validity");
                        break;
                    default:
                        System.out.println("Invalid option");
                }
                break;

            case 3:
                System.out.println("Welcome to chat");
                break;

            case 4:
                String prompt3 = """
                        1. Missed calls
                        2. Received calls
                        3. Dialled numbers
                        4. Erase recent call lists
                        5. Show call duration
                        6. Show call costs
                        7. Call cost settings
                        8. Prepaid credit""";
                System.out.println(prompt3);

                int menu = input.nextInt();
                if (menu == 5) {
                    String prompt4 = """
                            1. Last call duration
                            2. All calls' duration
                            3. Received calls' duration
                            4. Dialled calls' duration
                            5. Clear timers
                            """;
                    System.out.println(prompt4);
                } else if (menu == 6) {
                    String prompt5 = """
                            1. Last call cost
                            2. All calls' cost                    
                            3. Clear counters 
                            """;
                    System.out.println(prompt5);
                } else if (menu == 7) {
                    String prompt6 = """
                            1. Call cost limit
                            2. Show costs in                        
                             """;
                    System.out.println(prompt6);
                } else {
                    System.out.println("done");
                }

        int userEntry1 = input.nextInt();
        switch (userEntry1) {
            case 1:
                System.out.println("ok");
                break;
            case 2:
                System.out.println("ok ");
                break;
            case 3:
                System.out.println("ok  ");
                break;
            case 4:
                System.out.println(" ok ");
                break;
            case 5:
                System.out.println("   ok");
                break;
            default:
                System.out.println(" invalid input ");
        }
                break;
        case 5:
                System.out.println("1. Ringing tone");
                System.out.println("2. Ringing volume");
                System.out.println("3. Incoming call alert");
                System.out.println("4. Composer");
                System.out.println("5. Message alert tone");
                System.out.println("6. Keypad tones");
                System.out.println("7. Warning and game tones");
                System.out.println("8. Vibrating alert");
                System.out.println("9. Screen saver");
            int userInput1 = input.nextInt();
            switch (userInput1) {
                case 1:
                    System.out.println("ok");
                    break;
                case 2:
                    System.out.println("ok ");
                    break;
                case 3:
                    System.out.println("ok  ");
                    break;
                case 4:
                    System.out.println(" ok ");
                    break;
                case 5:
                    System.out.println("   ok");
                    break;
                case 6:
                    System.out.println(" ok ");
                    break;
                case 7:
                    System.out.println("   ok");
                    break;
                case 8:
                    System.out.println(" ok ");
                    break;
                case 9:
                    System.out.println("   ok");
                    break;
                default:
                    System.out.println(" invalid input ");
            }
            break;

            case 6:
                System.out.println("1. Call settings");
                System.out.println("2. Phone Settings");
                System.out.println("3. Security settings");
                System.out.println("4. Restore factory settings");

                int userInput2 = input.nextInt();
                switch (userInput2) {
                    case 1:
                        System.out.println("ok");
                        break;
                    case 2:
                        System.out.println("ok ");
                        break;
                    case 3:
                        System.out.println("ok  ");
                        break;
                    case 4:
                        System.out.println(" ok ");
                        break;
                    case 5:
                        System.out.println("   ok");
                        break;
                    case 6:
                        System.out.println(" ok ");
                        break;

                    default:
                        System.out.println(" invalid input ");
                }
                break;

            case 7:
                System.out.println(" ok ");
                break;

            case 8:
                System.out.println("ok");
                break;

            case 9:
                System.out.println(" ok");
                break;

            case 10:
                System.out.println("  ok");
                break;

            case 11:
                System.out.println("1. Alarm clock");
                System.out.println("2. Clock settings");
                System.out.println("3. Date Setting");
                System.out.println("4. Stopwatch");
                System.out.println("5. Countdown timer");
                System.out.println("6. Auto update of date and time");
                int userInput3 = input.nextInt();
                switch (userInput3) {
                    case 1:
                        System.out.println("ok");
                        break;
                    case 2:
                        System.out.println("ok ");
                        break;
                    case 3:
                        System.out.println("ok  ");
                        break;
                    case 4:
                        System.out.println(" ok ");
                        break;
                    case 5:
                        System.out.println("   ok");
                        break;
                    case 6:
                        System.out.println(" ok ");
                        break;
                    default:
                        System.out.println(" invalid input ");
                }


                break;


            case 12:
                System.out.println("done");

                break;
            case 13:
                System.out.println("done ");
                break;

            default:
                System.out.println("Invalid Input ");
        }



    }
}



