package CodeWars;

public class TotalPoints {
    public static void main(String[] args) {
        System.out.println(points(new String[] {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}));
    }
    public static int points(String[] games) {
        int point = 0;
        int[] arr = new int[games.length * 2];
        for (int s = 0, i = 0, j = 1; s < games.length; s++, i++, j++) {

            arr[i] = Integer.parseInt(games[s].split(":")[0]);
            arr[j] = Integer.parseInt(games[s].split(":")[1]);

            System.out.println(arr[i] + ":" + arr[j]);

            if (arr[i] > arr[j]) {
                point += 3; // win
            } else if (arr[i] < arr[j]) {
                point += 0; // loss
            }   else {
                point += 1; // tie
            }

            i++;
            j++;

        }
        return point;
    }
}
