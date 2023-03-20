public class HuffmanDecoding {
    public String decode(String archive, String[] dictionary) {
        // Build Huffman tree from dictionary
        HuffmanTree huffmanTree = new HuffmanTree();
        for (String code : dictionary) {
            huffmanTree.addCode(code);
        }

        // Decode archive
        StringBuilder decoded = new StringBuilder();
        HuffmanNode currentNode = huffmanTree.root;
        for (int i = 0; i < archive.length(); i++) {
            char bit = archive.charAt(i);
            if (bit == '0') {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }

            if (currentNode.isLeaf()) {
                decoded.append(currentNode.value);
                currentNode = huffmanTree.root;
            }
        }

        return decoded.toString();

    }

    public static void main(String[] args) {
        HuffmanDecoding huffmanDecoding = new HuffmanDecoding();
        String archive = "101101";
        String[] dictionary = {"00", "01", "10", "11"};
        System.out.println(huffmanDecoding.decode(archive, dictionary)); // SHOULD PRINT BDC
    }


    public class HuffmanNode {
        public int value;
        public HuffmanNode left;
        public HuffmanNode right;

        public HuffmanNode(int value) {
            this.value = value;
        }

        public boolean isLeaf() {
            return left == null && right == null;
        }
    }

    public class HuffmanTree {
        public HuffmanNode root;

        public HuffmanTree() {
            root = new HuffmanNode(-1);
        }

        public void addCode(String code) {
            HuffmanNode currentNode = root;
            for (int i = 0; i < code.length(); i++) {
                char bit = code.charAt(i);
                if (bit == '0') {
                    if (currentNode.left == null) {
                        currentNode.left = new HuffmanNode(-1);
                    }
                    currentNode = currentNode.left;
                } else {
                    if (currentNode.right == null) {
                        currentNode.right = new HuffmanNode(-1);
                    }
                    currentNode = currentNode.right;
                }
            }
            currentNode.value = code.charAt(0);
        }
    }
}