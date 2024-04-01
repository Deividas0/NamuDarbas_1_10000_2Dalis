public class Main {
    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 10000; i++) {
            if (i%250==0)
            {
                System.out.println(STR."\{i} Dalinasi iš 250.");
            }
            else if(i%223==0)
            {
                System.out.println(STR."\{i} Dalinasi iš 223.");
            }
            else if(i%111==0)
            {
                System.out.println(STR."\{i} Dalinasi iš 111.");
            }
            else if(i%103==0)
            {
                System.out.println(STR."\{i} Dalinasi iš 103.");
            }
            else if(i%42==0)
            {
                System.out.println(STR."\{i} Dalinasi iš 42.");
            }
            else if(i%16==0)
            {
                System.out.println(STR."\{i} Dalinasi iš 16.");
            }
            else if(i%12==0)
            {
                System.out.println(STR."\{i} Dalinasi iš 12.");
            }
            else if(i%8==0)
            {
                System.out.println(STR."\{i} Dalinasi iš 8.");
            }
            else if(i%7==0)
            {
                System.out.println(STR."\{i} Dalinasi iš 7.");
            }
            else if(i%5==0)
            {
                System.out.println(STR."\{i} Dalinasi iš 5.");
            }
            else if(i%2 ==0)
            {
                System.out.println(STR."\{i} Dalinasi iš 2.");
            }
            else {
                System.out.println(STR."\{i} Nesidalina");
            }
        }

    }
}