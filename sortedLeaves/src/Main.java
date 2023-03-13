import java.util.*;

public class SortedLeaves {
    public String[] values(TreeNode tree) {
        List<String> leaves = new ArrayList<>();
        collectLeaves(tree, leaves);
        Collections.sort(leaves);
        for (int i = 0; i < leaves.size(); i++) {
            int val = Integer.parseInt(leaves.get(i));
            char c = (char) (val + 64);
            leaves.set(i, String.valueOf(c));
        }
        return leaves.toArray(new String[0]);
    }

    private void collectLeaves(TreeNode node, List<String> leaves) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            leaves.add(String.valueOf(node.val));
        }
        collectLeaves(node.left, leaves);
        collectLeaves(node.right, leaves);
    }
}