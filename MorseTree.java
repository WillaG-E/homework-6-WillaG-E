import java.util.*;

public class MorseTree {
    private TreeNode<String> root;
   
    public MorseTree(){
        root = new TreeNode<>("");
        buildTree();
    }

    private void buildTree(){
        insert("e", new String[]{"o"});
    }
}