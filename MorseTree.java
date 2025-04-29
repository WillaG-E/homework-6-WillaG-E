import java.util.*;

public class MorseTree {
    private TreeNode<String> root;
   
    public MorseTree(){
        root = new TreeNode<>("");
        buildTree();
    }

    private void buildTree(){
        insert("e", new String[]{"o"});
        insert("t", new String[]{"-"});
        insert("i", new String[]{"o", "o"});
        insert("a", new String[]{"o", "-"});
        insert("n", new String[]{"-", "o"});
        insert("m", new String[]{"-", "-"});
        insert("s", new String[]{"o", "o", "o"});
        insert("u", new String[]{"o", "o", "-"});
        insert("r", new String[]{"o", "-", "o"});
        insert("w", new String[]{"o", "-", "-"});
        insert("d", new String[]{"-", "o", "o"});
        insert("k", new String[]{"-", "o", "-"});
        insert("g", new String[]{"-", "-", "o"});
        insert("o", new String[]{"-", "-", "-"});
        insert("h", new String[]{"o", "o", "o", "o"});
        insert("v", new String[]{"o", "o", "o", "-"});
        insert("f", new String[]{"o", "o", "-", "o"});
        insert("l", new String[]{"o", "-", "o", "o"});
        insert("p", new String[]{"o", "-", "-", "o"});
        insert("j", new String[]{"o", "-", "-", "-"});
        insert("b", new String[]{"-", "o", "o", "o"});
        insert("x", new String[]{"-", "o", "o", "-"});
        insert("c", new String[]{"-", "o", "-", "o"});
        insert("y", new String[]{"-", "o", "-", "-"});
        insert("z", new String[]{"-", "-", "o", "o"});
        insert("q", new String[]{"-", "-", "o", "-"});
    }
}