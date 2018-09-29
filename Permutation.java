static int[] perm;
static int[] item;
static boolean[] used;
static int n;


public static void permute(int pos) {
		if(pos==n) {
			  do stuff
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
