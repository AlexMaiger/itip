public class Main {
    public static void main(String[] args) {
        System.out.println(gallon(6));
        System.out.println(gallon(3));
        System.out.println(gallon(8));
        System.out.println(fitCals(15, 1));
        System.out.println(fitCals(24, 2));
        System.out.println(fitCals(41, 3));
        System.out.println(containers(3, 4, 2));
        System.out.println(containers(5, 0, 2));
        System.out.println(containers(4, 1, 4));
        System.out.println(traingleType(5, 5, 5));
        System.out.println(traingleType(5, 4, 5));
        System.out.println(traingleType(3, 4, 5));
        System.out.println(traingleType(5, 1, 1));
        System.out.println(ternaryEvaluation(8, 4));
        System.out.println(ternaryEvaluation(1, 11));
        System.out.println(ternaryEvaluation(5, 9));
        System.out.println(howManyItems(22, 1.4F, 2));
        System.out.println(howManyItems(45, 1.8F, 1.9f));
        System.out.println(howManyItems(100, 2F, 2));
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(7));
        System.out.println(gcd(48, 18));
        System.out.println(gcd(52, 8));
        System.out.println(gcd(259, 28));
        System.out.println(ticketSaler(70, 1500));
        System.out.println(ticketSaler(24, 950));
        System.out.println(ticketSaler(53, 1250));
        System.out.println(tables(5, 2));
        System.out.println(tables(31, 20));
        System.out.println(tables(123, 58));
    }

    public static float gallon(int x) {
        float bob = x * 3.785f;
        return bob;
    }

    public static float fitCals(int x, int y) {
        float rom = x * y;
        return rom;
    }

    public static float containers(int x, int y, int z) {
        float rom = x * 20 + y * 50 + z * 100;
        return rom;
    }

    public static String traingleType(int x, int y, int z) {
        if (x == y & y == z & x + y > z & z + y > x & x + z > y) {
            return "isosceles";
        } else if (x == y & y != z & x + y > z & z + y > x & x + z > y) {
            return "equtareal";
        } else if (x != y & y == z & x + y > z & z + y > x & x + z > y) {
            return "equtareal";
        } else if (x != z & y == z & x + y > z & z + y > x & x + z > y) {
            return "equtareal";
        } else if (x == z & y != z & x + y > z & z + y > x & x + z > y) {
            return "equtareal";
        } else if (x != y & y != z) {
            return "different-sided";
        }
        return "doesnt exist";
    }

    public static float ternaryEvaluation(int x, int y) {
        int lol = x > y ? x : y;
        return lol;
    }

    public static float howManyItems(int n, float w, float h) {
        int waw = (int) (n / ((w + h) * 2));
        return waw;
    }

    public static float factorial(int n) {
        int count = 1;
        if (n == 1) {
            return count * n;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static float gcd(int x, int y) {
        while (x != y) {
            if (x > y) {
                x = x - y;
            }
                else {
                y = y - x;
                }
            }
        return x;
    }
    public static float ticketSaler(int x, int y){
        return (float) (x * y * 0.72);

    }
    public static float tables(int x, int y){
        if (x % (y * 2) != 0 & y * 2 < x & x % 2 != 0) {
            return (x - (y * 2 % x)) / 2 + 1;
        }
        else if (x % (y * 2) != 0 & y * 2 < x & x % 2 == 0) {
            return (x - (y * 2 % x)) / 2;
        }
        return 0;
    }

}


