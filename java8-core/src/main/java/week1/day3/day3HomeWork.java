package week1.day3;

public class day3HomeWork {
    /*
        * interface Checker {
        boolean check(int number);
    }

    Checker checker = new Checker() {
        @Override
        public boolean check(int number) {
            return number > 10;
        }
    };
    * 를 Lambda식으로 변경하세요.
    * */
    interface Checker {
        boolean check(int number);
    }

    Checker checker = (number) -> number > 10;

}
