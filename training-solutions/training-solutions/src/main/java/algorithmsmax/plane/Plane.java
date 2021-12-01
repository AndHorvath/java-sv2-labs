package algorithmsmax.plane;

public class Plane {

    public int getLongestOcean(String map) {
        int longestOcean = Integer.MIN_VALUE;
        int length;

        for (int i = 0; i < map.length(); i++) {
            length = 0;
            while (i < map.length() && map.charAt(i) == '0') {
                length++;
                if (length > longestOcean) {
                    longestOcean = length;
                }
                i++;
            }
        }
        return longestOcean;
    }
}