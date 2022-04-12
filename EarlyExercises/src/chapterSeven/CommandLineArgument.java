package chapterSeven;
public class CommandLineArgument {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println("Error in the entered command TryAgain!!!!\nCommand should be followed by three integer argument seperated by a comma\n For example CommandLineArgument 3 4 4");
        }else{
            int arrayLength = Integer.parseInt(args[0]);
            int startingValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            int [] numberArray = new int[arrayLength];

            for(int index = 0; index < arrayLength; index++){
                numberArray[index] = startingValue + increment * index;
            }
            System.out.printf("%s7%s%n","Index","Value");
            for (int index = 0; index < numberArray.length; index++) {
                System.out.printf("%d%7d%n",index,numberArray[index]);


            }
        }

    }
}
