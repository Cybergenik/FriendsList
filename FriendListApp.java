/********************************************************
 *
 *  Project :  ArrayList   
 *  File    :  FriendsListApp.java   
 *  Name    :  Luciano Remes
 *  Date    :  4/20/19
 *
 *  Description : This is contains the main method and controls the menu options and user input for that menu 
 *
 *    1) The purpose of the code is to display a menu for the user to navigate and call methods in FriendsList class.
 *
 *    2) What data-structures are used.
 *
 *    3) This uses a simple menu algorithm that consists of a do-while loop and a switch statement.
 *
 *    4) What methods are implemented (optional).
 *
 *  Changes :  Dates of Modification: 4/15
 *
 ********************************************************/
package friends;
import java.util.Scanner;

public class FriendListApp 
{
    public static void main(String[] args)
    {   
        FriendsList friends = new FriendsList();
        Scanner in = new Scanner(System.in);
        
        int selection = 0;
        do{
            System.out.println("1. Add a Friend \n2. Remove a Friend \n3. Display all Friends \n4. Exit");
            selection = in.nextInt();
            
            switch(selection)
            {
                case 1:
                    friends.addFriend();
                    break;
                case 2:
                    friends.removeFriend();
                    break;
                case 3:
                    friends.displayFriends();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("\nSelect 1, 2, 3 or 4!");
            }
            
        }while(selection != '4');
    }
}
