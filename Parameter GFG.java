class Geeks {
// data members of the class
String name;
int id;
Geeks(String name, int id) {
this.name = name;
this.id = id;
}
}

class GFG
{
public static void main(String[] args)
{
    Geeks geek1= new Geeks("Sweta",68);
System.out.println("GeekName: " + geek1.name + " and GeekId: " + geek1.id);

}
}

