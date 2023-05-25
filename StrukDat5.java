/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukdat5;

/**
 *
 * @author AISYAH
 */
public class StrukDat5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree pohon = new BinaryTree();
        
        pohon.NewNode(20);
        pohon.NewNode(2);
        pohon.NewNode(25);
        pohon.NewNode(37);
        pohon.NewNode(16);
        
        System.out.println("Pre-Order : ");
        pohon.preOrder(pohon.root);
        System.out.println("\nIn Order : ");
        pohon.inOrder(pohon.root);
        System.out.println("\nPost Order : ");
        pohon.postOrder(pohon.root);
    }
    
}
