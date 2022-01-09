package chapterFive;

public class SumOfASeries {
    public static void main(String[] args) {

        System.out.println("n Series\t\tSum of nSeries");
        for(int seriesLength = 1; seriesLength<=100; seriesLength++){
            long nSum =0;
            for(int nSeries = 1; nSeries<= seriesLength; nSeries++){
                nSum +=nSeries;
            }
            System.out.printf("%d\t\t\t\t\t%d%n",seriesLength,nSum);
        }
    }
}
