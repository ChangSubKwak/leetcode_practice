package leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class TreeNodeTest {
	//@Test
	public void test1() {
		TreeNode root = new TreeNode(3);
		TreeNode t1 = new TreeNode(9);
		TreeNode t2 = new TreeNode(20);
		TreeNode t3 = new TreeNode(15);
		TreeNode t4 = new TreeNode(7);
		
		t2.left  = t3;
		t2.right = t4;
		
		root.left  = t1;
		root.right = t2;
		
		System.out.println(root.executeAndGetInOrderResult());
		System.out.println(root.executeAndGetPreOrderResult());
		assertThat(new int[] {9, 3, 15, 20, 7}).isEqualTo(root.executeAndGetInOrderResult().stream().mapToInt(i->i).toArray());
		assertThat(new int[] {3, 9, 20, 15, 7}).isEqualTo(root.executeAndGetInOrderResult().stream().mapToInt(i->i).toArray());
//		assertArrayEquals(new int[] {9, 3, 15, 20, 7}, root.executeAndGetInOrderResult().stream().mapToInt(i->i).toArray());
//		assertArrayEquals(new int[] {3, 9, 20, 15, 7}, root.executeAndGetPreOrderResult().stream().mapToInt(i->i).toArray());
	}
	
//	@Test
	public void test2() {
		TreeNode root = new TreeNode(1);
		TreeNode t1 = new TreeNode(2);
		TreeNode t2 = new TreeNode(3);
		
		root.left  = t1;
		root.right = t2;
		
		System.out.println(root.executeAndGetInOrderResult());
		assertThat(new int[] {2, 1, 3}).isEqualTo(root.executeAndGetInOrderResult().stream().mapToInt(i->i).toArray());
	}
	
//	@Test
	public void test3() {
		TreeNode root = new TreeNode(1);
		TreeNode t1 = new TreeNode(2);
		TreeNode t2 = new TreeNode(3);
		
		root.left  = t1;
		root.right = t2;
		
		TreeNode t3 = new TreeNode(4);
		t1.left = t3;
//		System.out.println(root.executeAndGetInOrderResult());
		
		t1.left = null;
		t1.right = t3;
//		System.out.println(root.executeAndGetInOrderResult());
		
		t1.left = null;
		t1.right = null;
		t2.left = t3;
//		System.out.println(root.executeAndGetInOrderResult());
		
		t2.left = null;
		t2.right = t3;
//		System.out.println(root.executeAndGetInOrderResult());
		System.out.println(root.constructLevelList());
		
		//assertArrayEquals(new int[] {2, 1, 3}, root.executeAndGetInOrderResult().stream().mapToInt(i->i).toArray());
	}
	
//	@Test
	public void test4() {
		TreeNode root = new TreeNode(3);
		TreeNode t1 = new TreeNode(9);
		TreeNode t2 = new TreeNode(20);
		TreeNode t3 = new TreeNode(15);
		TreeNode t4 = new TreeNode(7);
		
		t2.left  = t3;
		t2.right = t4;
		
		root.left  = t1;
		root.right = t2;
		
		System.out.println(root.constructLevelList());
	}
	
	@Test
	public void test5() {
		TreeNode root = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		
		root.left  = t2;
		root.right = t3;
		
		t2.left  = t4;
		t3.right = t5;
		
		System.out.println(root.constructLevelList());
	}
}
