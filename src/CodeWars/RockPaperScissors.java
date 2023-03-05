package CodeWars;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println(rps("rock","paper"));
        System.out.println(rps("rock","scissors"));
        System.out.println(rps("rock","rock"));
        System.out.println(rps("paper","paper"));
        System.out.println(rps("paper","scissors"));
        System.out.println(rps("paper","rock"));
        System.out.println(rps("scissors","paper"));
        System.out.println(rps("scissors","scissors"));
        System.out.println(rps("scissors","rock"));
    }
    public static String rps(String p1, String p2) {
        String r = "rock";
        String p = "paper";
        String s = "scissors";
        if (p1.equals(p2)) {
          return "Draw!";
        } else if (p1.equals(r)) {
            if (p2.equals(s)) {return "Player 1 won!";}
            else {return "Player 2 won!";}
        } else if (p1.equals(p)) {
            if (p2.equals(r)) {return "Player 1 won!";}
            else {return "Player 2 won!";}
        } else if (p1.equals(s)) {
            if (p2.equals(p)) {return "Player 1 won!";}
            else {return "Player 2 won!";}
        } else return null;
    }
}
