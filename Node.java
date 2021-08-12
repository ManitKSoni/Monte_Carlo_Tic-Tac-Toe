import java.util.*;
public class Node {
    int winRate;
    State state;
    Node parent;
    List<Node> childArray;

    //Node Constructor
    public Node(State state, Node parent, List<Node> childArray){
        this.state = state;
        this.parent = parent;
        this.childArray = childArray;
    }

    public void visit(){
        this.state.visitCount++;
    }
}

class Tree{
    Node root;
    
    //Tree Constructor
    public Tree(Node node){
        this.root = node;
    }

    // Work in Progress
    public void print(){
        Node current = this.root;
        System.out.println("Level 0: " + current.winRate);
        int level = 1;
        while(current != null){
            System.out.print("Level " + level + ": ");
            for(int i=0; i<current.childArray.size(); i++){
                if(i==current.childArray.size()-1){
                    System.out.println(current.winRate);
                }
                else{
                    System.out.println(current.winRate + ", ");
                }
            }
        }
    }
}


