/********************************************************
 *
 *  Project :  ArrayList   
 *  File    :  Friends.java   
 *  Name    :  Luciano Remes
 *  Date    :  4/20/19
 *
 *  Description : Constructor for each friend, getting and setting name and age
 *
 *    1) The purpose of the code is to implement the ArrayList parameters for what a friend is.
 *
 *    2) What data-structures are used.
 *
 *    3) This uses 2 simple constructors, 2 set methods, and 2 get methods.
 *
 *    4) What methods are implemented (optional).
 *
 *  Changes :  Dates of Modification: 4/15
 *
 ********************************************************/
package friends;
class Friends 
{
    private String name;
    private int age;
   
    //constructors
    public Friends()
    {
        this("", 0);
    }
    public Friends(String n, int a)
    {
        name = n;
        age = a;
    }
    
    //setters
    public void setName(String n)
    {
        name = n;
    }
    public void setAge(int a)
    {
        age = a;
    }
    
    //getters
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    
    //toString()
    public String toString()
    {
        return (name +" "+ age);
    }
}
