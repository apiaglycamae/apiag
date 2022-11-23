import java.util.Scanner;
public class RunAnimal{
 
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   Bird b = new Bird();
   Cat c = new Cat();
   Dog d = new Dog();

   System.out.print("Choose animal. Press B for Bird, C for Cat, or D for Dog: ");
   String pet = sc.nextLine();

   if (pet.equalsIgnoreCase("B")) {
   b.eat();
   b.sleep();
   b.makeSound();
}

   else if (pet.equalsIgnoreCase("C"))
{
   c.eat();
   c.sleep();
   c.makeSound();
}

   else if(pet.equalsIgnoreCase("D"))
{
   d.eat();
   d.sleep();
   d.makeSound();
}
}
}