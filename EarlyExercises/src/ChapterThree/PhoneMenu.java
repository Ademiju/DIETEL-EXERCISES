package chapterThree;

import java.util.Scanner;

public class PhoneMenu {

    public static void main(String[] args) {

        String prompt = """
                1.   Phone book
                2.   Messages
                3.   Chat
                4.   Call register
                5.   Tones
                6.   Settings
                7.   Call divert
                8.   Games
                9.   Calculator
                10.  Reminder
                11.  Clock
                12.  Profiles
                13.  SIM services""";
        System.out.println(prompt);

        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        switch (userInput) {

            case 1:
                String phonebook = """
                        1.  Search
                        2.  Service Nos.
                        3.  Add name
                        4.  Erase
                        5.  Edit
                        6.  Assign tone
                        7.  Send b'card
                        8.  Options
                        9.  Speed dials
                        10. Voice tags""";
                System.out.println(phonebook);

                Scanner phoneBook = new Scanner(System.in);
                int phonebookList = phoneBook.nextInt();
                switch (phonebookList) {
                    case 1:
                        System.out.println("Welcome to Search");
                        break;
                    case 2:
                        System.out.println("Welcome to Service Nos.");
                        break;
                    case 3:
                        System.out.println("Welcome to Add name");
                        break;
                    case 4:
                        System.out.println("Welcome to Erase");
                        break;
                    case 5:
                        System.out.println("Welcome to Edit");
                        break;
                    case 6:
                        System.out.println("Welcome to Assign tone");
                        break;
                    case 7:
                        System.out.println("Welcome to Send b'card ");
                        break;
                    case 8:
                        System.out.println("1.  Type of view");
                        System.out.println("2.  Memory status");

                        Scanner option = new Scanner(System.in);
                        int optionsList = option.nextInt();

                        switch (optionsList) {
                            case 1:
                                System.out.println("Welcome to Type of view");
                                break;
                            case 2:
                                System.out.println("Welcome to Memory status");
                            default:
                                System.out.println("Invalid input");
                        }
                        break;
                    case 9:
                        System.out.println("Welcome to Speed dials");
                        break;
                    case 10:
                        System.out.println("Welcome to Voice tags");
                        break;
                    default:
                        System.out.println("Invalid input");
                }
                break;
            case 2:
                String messages = """
                        1.  Write messages
                        2.  Inbox
                        3.  Outbox
                        4.  Picture messages
                        5.  Templates
                        6.  Smileys
                        7.  Message settings
                        8.  Info service
                        9.  Voice mailbox number
                        10. Service command editor""";
                System.out.println(messages);

                Scanner message = new Scanner(System.in);
                int messageList = message.nextInt();

                switch (messageList) {
                    case 1:
                        System.out.println("Welcome to Write messages");
                        break;
                    case 2:
                        System.out.println("Welcome to Inbox");
                        break;
                    case 3:
                        System.out.println("Welcome to Outbox");
                        break;
                    case 4:
                        System.out.println("Welcome to Picture messages");
                        break;
                    case 5:
                        System.out.println("Welcome to Template");
                        break;
                    case 6:
                        System.out.println("Welcome to Smileys");
                        break;
                    case 7:
                        System.out.println("1.  Set 1");
                        System.out.println("2.  Common");


                        Scanner messageSetting = new Scanner(System.in);
                        int messageSettingList = messageSetting.nextInt();

                        switch (messageSettingList) {
                            case 1:
                                System.out.println("1.  Message centre number");
                                System.out.println("2.  Message sent as");
                                System.out.println("3.  Message validity");

                                Scanner set1 = new Scanner(System.in);
                                int set1List = set1.nextInt();

                                switch (set1List) {
                                    case 1:
                                        System.out.println("Welcome to Message centre number");
                                        break;
                                    case 2:
                                        System.out.println("Welcome to Message sent as");
                                        break;
                                    case 3:
                                        System.out.println("Welcome to Message validity");
                                        break;
                                    default:
                                        System.out.println("invalid selection");
                                }
                                break;
                            case 2:
                                System.out.println("1.  Delivery reports");
                                System.out.println("2.  Reply via same centre");
                                System.out.println("3.  Character support");

                                Scanner common = new Scanner(System.in);
                                int commonList = common.nextInt();

                                switch (commonList) {
                                    case 1:
                                        System.out.println("Welcome to Delivery reports");
                                        break;
                                    case 2:
                                        System.out.println("Welcome to Reply via same centre");
                                        break;
                                    case 3:
                                        System.out.println("Welcome to Character support");
                                        break;
                                    default:
                                        System.out.println("Invalid selection");
                                }
                                break;

                            default:
                                System.out.println("Invalid input");
                        }
                        break;

                    case 8:
                        System.out.println("Welcome to Info service");

                        break;
                    case 9:
                        System.out.println("Welcome to Voice mailbox number");
                        break;
                    case 10:
                        System.out.println("Welcome to Service command editor ");
                        break;
                    default:
                        System.out.println("Invalid input");
                }
                break;
            case 3:
                System.out.println("Welcome to Chat");

                break;
            case 4:
                String callRegister = """
                        1.  Missed calls
                        2.  Received calls
                        3.  Dialled numbers
                        4.  Erase recent call lists
                        5.  Show call duration
                        6. Show call costs
                        7. Call cost settings
                        8. Prepaid credit""";
                System.out.println(callRegister);

                Scanner callregister = new Scanner(System.in);
                int callRegisterList = callregister.nextInt();

                switch (callRegisterList) {
                    case 1 :
                        System.out.println("Welcome to Missed calls");
                        break;
                    case 2 :
                        System.out.println("Welcome to Received calls");
                        break;
                    case 3:
                        System.out.println("Welcome to Dialled numbers");
                        break;
                    case 4:
                        System.out.println("Welcome to Erase recent call lists");
                        break;
                    case 5:
                        String showCallDuration = """
                            1.  Last call duration
                            2.  All calls' duration
                            3.  Received calls' duration
                            4.  Dialled calls' duration
                            5.  Clear timers""";
                        System.out.println(showCallDuration);
                        Scanner showcallduration = new Scanner(System.in);
                        int showCallDurationList = showcallduration.nextInt();
                        switch (showCallDurationList){
                            case 1:
                                System.out.println("Welcome to Last call duration");
                                break;
                            case 2:
                                System.out.println("Welcome to All calls' duration");
                                break;
                            case 3:
                                System.out.println("Welcome to Received calls' duration");
                                break;
                            case 4:
                                System.out.println("Welcome to Dialled calls' duration");
                                break;
                            case 5:
                                System.out.println("Welcome to Clear timers");
                            default:
                                System.out.println("Invalid input");

                        }
                        break;
                    case 6:
                        String showCallCosts = """
                            1.  Last call cost
                            2.  All calls' cost
                            3.  Clear counters
                           """;
                        System.out.println(showCallCosts);
                        Scanner showcallcost = new Scanner(System.in);
                        int showCallCostList = showcallcost.nextInt();
                        switch (showCallCostList){
                            case 1:
                                System.out.println("Welcome to Last call cost");
                                break;
                            case 2:
                                System.out.println("Welcome to All calls' cost");
                                break;
                            case 3:
                                System.out.println("Welcome to Clear counters");
                                break;
                            default:
                                System.out.println("Invalid input");

                        }
                         break;
                    case 7:
                        String callCostSettings = """
                            1.  Call cost limit
                            2.  Show costs in """;
                        System.out.println(callCostSettings);
                        Scanner callcostsettings= new Scanner(System.in);
                        int callCostSettingsList = callcostsettings.nextInt();
                        switch (callCostSettingsList){
                            case 1:
                                System.out.println("Welcome to Call cost limit");
                                break;
                            case 2:
                                System.out.println("Welcome to Show costs in");
                                break;
                            case 3:
                                System.out.println("Welcome to Clear counters");
                                break;
                            default:
                                System.out.println("Invalid input");

                        }
                         break;
                    case 8:
                        System.out.println("Welcome to Prepaid credit");
                }
                break;

            case 5:
                String tones = """
                        1.  Ringing tone
                        2.  Ringing volume
                        3.  Incoming call alert
                        4.  Composer
                        5.  Message alert tone
                        6.  Keypad tones
                        7.  Warning and game tones
                        8.  Vibrating alert
                        9.  Screen saver
                        """;
                System.out.println(tones);

                Scanner tone = new Scanner(System.in);
                int tonesList = tone.nextInt();

                switch (tonesList) {
                    case 1:
                        System.out.println("Welcome to Ringing tone");
                        break;
                    case 2:
                        System.out.println("Welcome to Ringing volume");
                        break;
                    case 3:
                        System.out.println("Welcome to Incoming call alert");
                        break;
                    case 4:
                        System.out.println("Welcome to Composer");
                        break;
                    case 5:
                        System.out.println("Welcome to Message alert tone");
                        break;
                    case 6:
                        System.out.println("Welcome to Keypad tones");
                        break;

                    case 7:
                        System.out.println("Welcome to Warning and game tones");
                        break;
                    case 8:
                        System.out.println("Welcome to Vibrating alert");
                        break;
                    case 9:
                        System.out.println("Welcome to Screen saver");
                        break;
                    default:
                        System.out.println("Invalid input");
        }
         break;

            case 6:
                String settings = """
                        1.  Call settings
                        2.  Phone settings
                        3.  Security settings""";
                System.out.println(settings);

                Scanner setting = new Scanner(System.in);
                int settingsList = setting.nextInt();

                switch(settingsList){

                    case 1:
                        String callSetttings = """
                                1.  Automatic redial
                                2.  Speed dialling
                                3.  Call waiting options
                                4.  Own number sending
                                5.  Phone line in use
                                6.  Automatic answer""";
                        System.out.println(callSetttings);

                        Scanner callsetting = new Scanner(System.in);
                        int callSettingsList = callsetting.nextInt();

                        switch(callSettingsList){
                            case 1:
                                System.out.println("Welcome to Automatic redial");
                                break;
                            case 2:
                                System.out.println("Welcome to Speed dialling");
                                break;
                            case 3:
                                System.out.println("Welcome to Call waiting options");
                                break;
                            case 4:
                                System.out.println("Welcome to Own number sending");
                                break;
                            case 5:
                                System.out.println("Welcome to Phone line in use");
                                break;
                            case 6:
                                System.out.println("Welcome to Automatic answer");
                                break;
                            default:
                                System.out.println("Invalid input");

                        }
                         break;
                    case 2:
                        String phoneSetttings = """
                                1.  Language
                                2.  Cell info display
                                3.  Welcome note
                                4.  Network selection
                                5.  Lights
                                6.  Confirm SIM service actions""";
                        System.out.println(phoneSetttings);

                        Scanner phonesetting = new Scanner(System.in);
                        int phoneSettingsList = phonesetting.nextInt();

                        switch(phoneSettingsList){
                            case 1:
                                System.out.println("Welcome to Language ");
                                break;
                            case 2:
                                System.out.println("Welcome to Cell info display");
                                break;
                            case 3:
                                System.out.println("Welcome to Welcome note");
                                break;
                            case 4:
                                System.out.println("Welcome to Network selection");
                                break;
                            case 5:
                                System.out.println("Welcome to Lights");
                                break;
                            case 6:
                                System.out.println("Welcome to Confirm SIM service actions");
                                break;
                            default:
                                System.out.println("Invalid input");

                        }
                        break;
                    case 3:
                        String securitySetttings = """
                                1.  PIN code request
                                2.  Call barring service
                                3.  Fixed dialling
                                4.  Closed user group
                                5.  Phone security
                                6.  Change access codes""";
                        System.out.println(securitySetttings);

                        Scanner securitysetting = new Scanner(System.in);
                        int securitySettingsList = securitysetting.nextInt();

                        switch(securitySettingsList){
                            case 1:
                                System.out.println("Welcome to PIN code request ");
                                break;
                            case 2:
                                System.out.println("Welcome to Call barring service");
                                break;
                            case 3:
                                System.out.println("Welcome to Fixed dialling");
                                break;
                            case 4:
                                System.out.println("Welcome to Closed user group");
                                break;
                            case 5:
                                System.out.println("Welcome to Phone security");
                                break;
                            case 6:
                                System.out.println("Welcome to Change access codes");
                                break;
                            default:
                                System.out.println("Invalid input");

                        }
                        break;
                    case 4:
                        System.out.println("Welcome to Restore factory settings");
                }
                break;
            case 7:
                System.out.println("Welcome to Call divert");
                break;

            case 8:
                System.out.println("Welcome to Games");
                break;
            case 9:
                System.out.println("Welcome to Calculator");
                break;
            case 10:
                System.out.println("Welcome to Reminder");
                break;
            case 11:
                String clock = """
                        1.  Alarm clock
                        2.  Clock settings
                        3.  Date setting
                        4.  Stopwatch
                        5.  Countdown timer
                        6. Auto update of date and time""";
                System.out.println(clock);

                    Scanner newClock = new Scanner(System.in);
                    int clockList = newClock.nextInt();
                    switch(clockList){
                        case 1:
                            System.out.println("Welcome to Alarm clock");
                            break;
                        case 2:
                            System.out.println("Welcome to Clock settings");
                            break;
                        case 3:
                            System.out.println("Welcome to Date setting");
                            break;
                        case 4:
                            System.out.println("Welcome to Stopwatch");
                            break;
                        case 5:
                            System.out.println("Welcome to Countdown timer");
                            break;
                        case 6:
                            System.out.println("Welcome to Auto update of date and time");
                            break;
                        default:
                            System.out.println("Invalid input");
                    }
                break;
            case 12:
                System.out.println("Welcome to Profiles");
                break;
            case 13:
                System.out.println("Welcome to SIM services");
            default:
                System.out.println("Invalid input");
        }
    }


}