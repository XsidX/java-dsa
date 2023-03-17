import java.util.*;

public class AllPaths {
    public String[] paths(TreeNode t) {
        List<String> pathList = new ArrayList<>();
        getPaths(t, "", pathList);
        Collections.sort(pathList);
        return pathList.toArray(new String[0]);
    }

    private void getPaths(TreeNode tree, String path, List<String> pathList) {
        if (tree == null) {
            return;
        }

       
        path += tree.info + "->";

    
        if (tree.left == null && tree.right == null) {
            pathList.add(path.substring(0, path.length() - 2));
        }

        
        getPaths(tree.left, path, pathList);
        getPaths(tree.right, path, pathList);
    }
}