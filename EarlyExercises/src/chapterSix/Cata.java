package chapterSix;

public class Cata {
    public static char calculateGrade(int score) {
        if (score >= 90)
            return 'A';
        if (score >= 80)
            return 'B';
        if (score >= 70)
            return 'C';
        if (score >= 60)
            return 'D';
        return 'F';
    }


    public int testForQuantityAgainstPrice(int totalPurchase, int finalprice) {
        if (totalPurchase >= 1) {
            if (totalPurchase <= 4)
                return finalprice * totalPurchase;

            if (totalPurchase >= 5) {
                if (totalPurchase <= 9)
                    return finalprice * totalPurchase;


                if (totalPurchase >= 10) {
                    if (totalPurchase <= 29)
                        return finalprice * totalPurchase;


                    if (totalPurchase >= 30) {
                        if (totalPurchase <= 49)
                            return finalprice * totalPurchase;


                        if (totalPurchase >= 50) {
                            if (totalPurchase <= 99)
                                return finalprice * totalPurchase;

                            if (totalPurchase >= 100) {
                                if (totalPurchase <= 199)
                                    return finalprice * totalPurchase;

                                if (totalPurchase >= 200) {
                                    if (totalPurchase <= 499)
                                        return finalprice * totalPurchase;
                                }


                                return finalprice * 500;

                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
}