import java.util.*;
import java.util.Random;
public class Main {
    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Toss");
        System.out.println("Choose Heads or Tails");
        String toss = sc.nextLine();
        int result = random.nextInt(2);
        String ran_toss;
        if (result == 0) {
            ran_toss = "Heads";
        } else {
            ran_toss = "Tails";
        }
        int teamA_runs = 0;
        int teamB_runs = 0;
        if (ran_toss.equals(toss)) {
            System.out.println("You won the toss");
            System.out.println("Choose 1 for Batting or 2 for Bowling:");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("You chose to bat first");
                teamA_runs = batting();
                teamB_runs = bowling();
            } else {
                System.out.println("You chose to bowl first");
                teamB_runs = bowling();
                teamA_runs = batting();
            }
        } else {
            System.out.println("You lost the toss");
            int choice = random.nextInt(2);
            if (choice == 1) {
                System.out.println("Opponent chose to bat first");
                teamA_runs = bowling();
                teamB_runs = batting();
            } else {
                System.out.println("Opponent chose to bowl first");
                teamA_runs = batting();
                teamB_runs = bowling();
            }
        }
        if(teamA_runs > teamB_runs) {
                System.out.println("You won the match by " + (teamA_runs - teamB_runs) + " runs");
            } else if(teamA_runs < teamB_runs) {
                System.out.println("You lost the match by " + (teamB_runs - teamA_runs) + " runs");
            } else {
                System.out.println("The match is a tie");
            }
        }

    public static int batting() {
        Random random = new Random();
        int teamA_runs = 0;
            int count = 0;
            int total_run = 0;
            for (int j = 1; j <= 6; j++) {
                System.out.println("____________________________________________________");
                System.out.println("Choose your shot:");
                System.out.println("Defensive - 0 ");
                System.out.println("Normal Sh ot - 1");
                System.out.println("Aggressive - 2");
                int bat = sc.nextInt();
                int ball = random.nextInt(3);
                int a = runs(bat, ball);
                if (a == -1) {
                    System.out.println("Out!!");
                    count++;
                    if (count == 2) {
                        System.out.println("Your innings is over. Your Team score was " + total_run + "/" + count);
                        System.out.println();
                        return total_run;      //return the total runs if 2 wickets are down
                    }
                } else if (a == 0) {
                    System.out.println("Dot ball!!");
                } else if (a == 1) {
                    System.out.println("1 run...");
                    total_run = total_run + a;
                } else if (a == 2) {
                    System.out.println("2 runs!!");
                    total_run = total_run + a;
                } else if (a == 3) {
                    System.out.println("3 runs!!");
                    total_run = total_run + a;
                } else if (a == 4) {
                    System.out.println("FOUR!!!");
                    total_run = total_run + a;
                } else if (a == 6) {
                    System.out.println("SIX!!!");
                    total_run = total_run + a;
                }
                System.out.println("Scorecard: " + total_run + "/" + count);
            }
        System.out.println("Your innings is over. Your Team score was " + total_run + "/" + count);
            return total_run;
        }

    public static int bowling() {
        Random random = new Random();
        int teamB_runs = 0;
            int count = 0;
            int total_run = 0;
            for (int j = 1; j <= 6; j++) {
                System.out.println("____________________________________________________");
                System.out.println("You can choose each ball type only 2 times");
                System.out.println("Choose your ball type:");
                System.out.println("Yorker - 0");
                System.out.println("Bouncer - 1");
                System.out.println("Full toss - 2");
                int ball = sc.nextInt();
                int bat = random.nextInt(3);
                int a = runs(bat, ball);
                if (a == -1) {
                    System.out.println("Out!!");
                    count++;
                    if (count == 2) {
                        System.out.println("Your opponent's innings is over. Their score was " + total_run + "/" + count); //return the total runs if 2 wickets are down
                        return total_run;
                    }
                } else if (a == 0) {
                    System.out.println("Dot ball!!");
                } else if (a == 1) {
                    System.out.println("1 run...");
                    total_run = total_run + a;
                } else if (a == 2) {
                    System.out.println("2 runs!!");
                    total_run = total_run + a;
                } else if (a == 3) {
                    System.out.println("3 runs!!");
                    total_run = total_run + a;
                } else if (a == 4) {
                    System.out.println("FOUR!!!");
                    total_run = total_run + a;
                } else if (a == 6) {
                    System.out.println("SIX!!!");
                    total_run = total_run + a;
                }
                System.out.println("Scorecard: " + total_run + "/" + count);
        }
        System.out.println("Your opponent's innings is over. Their Team score was " + total_run + "/" + count);
        return total_run;
    }
    public static int runs(int bat, int ball) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int outcome = rand.nextInt(100);
        int teamA_runs = 0;
        if (ball == 0) {
            if (bat == 0)
            {
                if (outcome < 90) {
                    return rand.nextInt(2);      //return 0 or 1
                } else {
                    return -1;          //Wicket
                }
            }
            else if (bat == 1) {
                if (outcome < 80) {
                    return rand.nextInt(3);     //return 0, 1 or 2
                } else {
                    return -1;          //Wicket
                }
            } else if (bat == 2) {
                if (outcome < 60) {
                    if (rand.nextBoolean()) {
                        return 2;
                    } else {
                        return 4;
                    }
                } else {
                    return -1;              //Wicket
                }
            }
        } else if (ball == 1) {
            if (bat == 0)
            {
                if (outcome < 80) {
                    return rand.nextInt(2);     //return 0 or 1
                } else {
                    return -1;     //Wicket
                }
            }
            else if (bat == 1) {
                if (outcome < 70) {
                    if (rand.nextBoolean()) {
                        return 2;
                    } else {
                        return 4;
                    }
                } else {
                    return -1;     //Wicket
                }
            } else if (bat == 2) {
                if (outcome < 50) {
                    if (rand.nextBoolean()) {
                        return 4;
                    } else {
                        return 6;
                    }
                } else {
                    return -1;    //Wicket
                }
            }
        } else if (ball == 2) {
            if(bat == 0)
            {
                if (outcome < 90) {
                    return rand.nextInt(3);     //return 0, 1 or 2
                } else {
                    return -1;     //Wicket
                }
            }
            else if (bat == 1) {
                if (outcome < 80) {
                    if (rand.nextBoolean()) {
                        return 2;
                    } else {
                        return 4;
                    }
                } else {
                    return -1;     //Wicket
                }
            } else if (bat == 2) {
                if (outcome < 60) {
                    if (rand.nextBoolean()) {
                        return 4;
                    } else {
                        return 6;
                    }
                } else {
                    return -1;    //Wicket
                }
            }
        }
        return -10;
    }
}










