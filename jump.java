import java.util.Scanner;
	
public class jump {
	static int ans = 0;
	static int[] item;
	static int[] perm;
	static boolean[] used;
	static int n;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		for(int q = 0;q<cases;q++) {
			ans = 0;
			n = scan.nextInt();
			item =new int[n];
			for(int i =0;i<n;i++) {
				item[i] = scan.nextInt();
			}
			int one = scan.nextInt();
			int two = scan.nextInt();
			perm = new int[n];
			used = new boolean[n];
			for(int i = 0;i<n;i++) {
				used[i] = false;
			}
			permute(0,one,two);
			int factorial = 1;
			for(int i = 1;i<=n;i++) {
				factorial*=i;
			}
			System.out.println(factorial-ans);
			
		}
	}
	public static void permute(int pos,int up, int down) {
		if(pos==n) {
			for(int i = 0;i<perm.length-1;i++) {
				if(perm[i]+up<perm[i+1]) {
					ans++;
					break;
				}
				else if(perm[i]-down>perm[i+1]) {
					ans++;
					break;
				}
			}
		}else {
			for(int i = 0;i<n;i++) {
				if(!used[i]) {
					used[i] = true;
					perm[pos] = item[i];
					permute(pos+1,up,down);
					used[i] = false;
				}
			}
		}
	}

}
