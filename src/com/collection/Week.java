package com.collection;

/**
 * Created by Yayheniy_Lepkovich on 8/18/2017.
 */
public enum Week {
    MONDAY {
        @Override
        public String toString() {
            return "Mon";
        }

        @Override
        public int dayValue() {
            return 1;
        }
    }, TUESDAY {
        @Override
        public String toString() {
            return "Tue";
        }

        @Override
        public int dayValue() {
            return 2;
        }
    }, WEDNESDAY {
        @Override
        public String toString() {
            return "Wed";
        }

        @Override
        public int dayValue() {
            return 3;
        }
    }, THURSDAY {
        @Override
        public String toString() {
            return "Thu";
        }

        @Override
        public int dayValue() {
            return 4;
        }
    }, FRIDAY {
        @Override
        public String toString() {
            return "Fri";
        }

        @Override
        public int dayValue() {
            return 5;
        }
    }, SATURDAY {
        @Override
        public String toString() {
            return "Sat";
        }

        @Override
        public int dayValue() {
            return 6;
        }
    }, SUNDAY {
        @Override
        public String toString() {
            return "Sun";
        }

        @Override
        public int dayValue() {
            return 7;
        }
    };

    public abstract String toString();
    public abstract int dayValue();

    public static boolean isDay(String day) {
        for (Week weekDay : values()){
            if (weekDay.toString().equals(day)) {
                return true;
            }
        }
        return false;
    }
    public static int getDayValue(String day) {
        for (Week weekDay : values()){
            if (weekDay.toString().equals(day)) {
                return weekDay.dayValue();
            }
        }
        throw new RuntimeException("can't find day value");
    }
}
