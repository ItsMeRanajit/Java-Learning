
//moving to point 0,0 to n,m in a matrix.
//only right and down movements are allowed. no diagonal movement
//count total path to reach n,m from 0,0
public class moveTo_nm_InMarrix {
    public static void main(String args[]) {
        int n = 3;
        int m = 3;
        int totalPath = countPath(0, 0, n, m);
        System.out.println(totalPath);

    }

    static int countPath(int i, int j, int n, int m) {
        if (i == n || j == m)
            return 0;
        if (i == n - 1 && j == m - 1)
            return 1;

        int downPath = countPath(i + 1, j, n, m);// move downwards
        int rightPath = countPath(i, j + 1, n, m);// move rightwards

        return downPath + rightPath;
    }
}

// O(2^n)