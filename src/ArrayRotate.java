import java.util.Arrays;

public class ArrayRotate {
	public static void rotate(int[][] m) {
		int n = m[0].length;
		for(int i =0; i<n/2; i++) {
			for(int j =i; j<n-i-1; j++) {
				int tl = m[i][j];
				int tr = m[j][n-i-1];
				int br = m[n-i-1][n-j-1];
				int bl = m[n-j-1][i];
				m[i][j]= bl;
				m[j][n-i-1] = tl;
				m[n-i-1][n-j-1]= tr;
				m[n-j-1][i] = br;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = new int[5][5];
		int[] m0 = {1, 2, 3, 4, 5};
		int[] m1 = {6, 7, 8, 9, 10};
		int[] m2 = {11, 12, 13, 14, 15};
		int[] m3 = {16, 17, 18, 19, 20};
		int[] m4 = {21,22,23,24,25};
		m[0] = m0;
		m[1] = m1;
		m[2] = m2;
		m[3] = m3;
		m[4] = m4;
		rotate(m);
		for(int i = 0; i<5; i++) {
			System.out.println(Arrays.toString(m[i]));
		}
	}

}
