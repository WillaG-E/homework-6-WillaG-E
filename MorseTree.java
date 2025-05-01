import java.util.HashMap;

public class MorseTree {
    private TreeNode<String> root;
    private HashMap<String, String> encode;
    private HashMap<String, String> decode;
   
    public MorseTree(){
        root = new TreeNode<>("");
        encode = new HashMap<>();
        decode = new HashMap<>();
        buildTree();
    }

    private void buildTree(){
        insert("e", "o");
        insert("t", "-");
        insert("i", "o o");
        insert("a", "o -");
        insert("n", "- o");
        insert("m", "- -");
        insert("s", "o o o");
        insert("u", "o o -");
        insert("r", "o - o");
        insert("w", "o - -");
        insert("d", "- o o");
        insert("k", "- o -");
        insert("g", "- - o");
        insert("o", "- - -");
        insert("h", "o o o o");
        insert("v", "o o o -");
        insert("f", "o o - o");
        insert("l", "o - o o");
        insert("p", "o - - o");
        insert("j", "o - - -");
        insert("b", "- o o o");
        insert("x", "- o o -");
        insert("c", "- o - o");
        insert("y", "- o - -");
        insert("z", "- - o o");
        insert("q", "- - o -");
    }
}

private void insert(String letter, String morseCode){
    TreeNode<String> current = root;
    for(int i=0; i < morseCode.length(); i++){
        char symbol = morseCode.charAt(i);
        if(symbol == 'o'){
            if(current.getLeft() == null){
                current.setLeft(new TreeNode<>(""));
            }
            current = current.getLeft();
        } else if (symbol == '-'){
            if(current.getRight() == null){
                current.setRight(new TreeNode<>(""));
            }
            current = current.getRight();
        }
    }
    current.setElement(letter);

    encode.put(letter.toLowerCase(), morseCode);
    decode.put(morseCode, letter.toLowerCase());
}

public String preorder(){
    StringBuilder result = new StringBuilder();
    traversePreOrder(root, result);
    return result.toString().trim();
}


public String postorder(){
    StringBuilder result = new StringBuilder();
    traversePostOrder(root, result);
    return result.toString().trim();
}

