
        public class Main {
            public static void main(String[] args) {
                System.out.println("Проверка на полиндром");
                char[] c = {'s', 'u', 'u', 's'};

                System.out.println();
                if (c[0]==c[3] && c[1]==c[2] ) {
                    System.out.println("это палиндром");
                } else {
                    System.out.println("это не палиндром");
                }
            }
        }

