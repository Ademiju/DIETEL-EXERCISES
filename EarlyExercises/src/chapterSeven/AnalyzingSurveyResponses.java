package chapterSeven;

public class AnalyzingSurveyResponses {
    public static void main(String[] args) {
        int [] responses = {2,1,4,4,5,3,2,4,5,2,4,4,3,13,1,3,5,7,8,2};
        int [] frequency = new int[6];
        for (int response = 0; response < responses.length; response++){
           try {
               int answer = responses[response];
               frequency[answer]++;
           }catch(ArrayIndexOutOfBoundsException error){
               System.out.println(error);
               System.out.printf("responses[%d] = %d%n", response,responses[response]);
            }
        }
        System.out.println("Frequency\tResponses");
        for(int frequencies = 1; frequencies < frequency.length; frequencies++ ){
            System.out.printf("%d%12d%n",frequencies,frequency[frequencies]);
        }
    }
}
