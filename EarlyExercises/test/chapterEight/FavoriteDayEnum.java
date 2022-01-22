package chapterEight;

import java.time.LocalDate;

public class FavoriteDayEnum {

    public enum FavoriteDay{
        BIRTH("BirthDay","Osun", LocalDate.of(1995,11,4)),
        GRADUATION("Convocation Day","Osun",LocalDate.of(2019,1,1)),
                WEDDING("Wedding Day","Lagos",LocalDate.of(2030,11,4)),
        DEATH("Date Of Death","Unavailable",LocalDate.of(0000,0,0));

        private final String name;
        private final String placeOfOccurrence;
        private final LocalDate date;

        FavoriteDay(String favDayName, String location, LocalDate date){
            name = favDayName;
            placeOfOccurrence = location;
            this.date = date;

        }

        public String getName() {
            return name;
        }

        public String getPlaceOfOccurrence() {
            return placeOfOccurrence;
        }

        public LocalDate getDate() {
            return date;
        }
    }
}
