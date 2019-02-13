import java.util.Scanner;

public class TrieInsertSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		for(int q = 0;q<cases;q++){
			int n = scan.nextInt();
			trie trie = new trie();
			for(int i = 0;i<n;i++){
				String s = scan.next();
				trie.insert(s);
			}
			String need = scan.next();
			System.out.println(trie.search(need) ? 1:0);
		}
	}
	static class node{
		node[] leafs = new node[26];
		boolean finish = false;
	}
	static class trie{
		node root = new node();
		void insert(String key){
			node move = root;
			for(int i = 0;i<key.length();i++){
				int temp = key.charAt(i)-'a';
				if(move.leafs[temp]==null){
					move.leafs[temp] = new node();
				}
				move = move.leafs[temp];
			}
			move.finish = true;
		}
		boolean search(String key){
			node move = root;
			for(int i = 0;i<key.length();i++){
				int temp = key.charAt(i)-'a';
				if(move.leafs[temp] == null){
					return false;
				}
				move = move.leafs[temp];
			}
			if(move.finish){
				return true;
			}else{
				return false;
			}
		}
	}

}
