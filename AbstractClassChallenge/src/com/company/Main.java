package com.company;

public class Main {

    public static void main(String[] args) {
	    SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
       // String stringData = "5 4 3 6 7 0 8 9 1 2";
        String[] data = stringData.split(" ");
        for(String s : data){
            //create new item with value set to the string s
            tree.addItem(new Node(s));
        }
        tree.traverse(tree.getRoot());
    }
}
