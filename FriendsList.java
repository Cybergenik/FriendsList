/********************************************************
 *
 *  Project :  ArrayList   
 *  File    :  FriendsList.java   
 *  Name    :  Luciano Remes
 *  Date    :  4/20/19
 *
 *  Description : This class is full of the methods that control the menu options in FriendListApp, executes user commands on editing their friends list.
 *
 *    1) The purpose of the code is to learn how object oriented programming and apply that to a menu.
 *
 *    2) What data-structures are used.
 *
 *    3) This uses a constructor for Array and Scanner objects, and the code that is actually controlling the calculations that user makes to friends list.
 *
 *    4) What methods are implemented (optional).
 *
 *  Changes :  Dates of Modification: 4/15
 *
 ********************************************************/
package friends;
import java.util.ArrayList;
import java.util.Scanner;

public class FriendsList
{
        //Scoping for Array and Scanner
        ArrayList<Friends> friendList;
        Scanner in;
        //Constructor for ArrayList and Scanner
        public FriendsList()
        {
          friendList = new ArrayList<>();
          in = new Scanner(System.in);  
        }
        //Adds Friends
        public void addFriend()
        {
            System.out.print("Enter name: ");
            String name = in.next();
            System.out.print("Enter age: ");
            int age = in.nextInt();
        
            Friends friend = new Friends(name, age);
            friendList.add(friend);
        }
        //Removes friends
        public void removeFriend()
        {
            int i = 1;
            
            //Loop for displaying List of friends
            for(Friends f: friendList)
            {
                System.out.println("\nYour Friends: \n"+ i++ +" "+ f +"\n");
            }
            
            //User input for removing friend
            System.out.print("Enter number of friend to remove: ");
            i = in.nextInt();
            friendList.remove(i-1);
        }
        //Displays all Friends
        public void displayFriends()
        {
            int i = 1;
            for(Friends f: friendList)
            {
                System.out.println("\nYour Friends: \n"+ i++ +" "+ f +"\n");
            }
        }
    
}
