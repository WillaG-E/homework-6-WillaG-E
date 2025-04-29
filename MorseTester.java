public class MorseTester {
    public static void main(String[] args) {
        MorseTree tree = new MorseTree();

        //Pre-Order of Tree
        System.out.println("Preorder tree contents:");
        System.out.println(tree.preorder());

        //Post-Order of Tree
        System.out.println("Postorder tree contents:");
        System.out.println(tree.postorder());

        String input = "The quick fox";
        System.out.println("\nInput: " + input);

        //Translate English Text to Morse
        String morse = tree.endcode(input);
        System.out.println("Output: " + morse);

        //Translate Morse to English Text
        String decoded = tree.decode(morse);
        System.out.println("Decoded: " + decoded);

    }
}