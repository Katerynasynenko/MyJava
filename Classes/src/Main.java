public class Main {

    public static void main(String[] args) {
//        
//        Dog dog1 = new Dog();
//        dog1.name = "Bubbly";
//        dog1.age = 5;
//        dog1.breed = "Poudle";
//        dog1.color = "White";
//        
//        System.out.println(dog1.name+":"+dog1.age+":"+dog1.breed+":"+dog1.color);
//        
//        dog1.bark();
//        dog1.eat();
//        dog1.wagTail();
//        
//        System.out.println("-----------");
        
        dog2 dog = new dog2();
        System.out.println(dog.name+":"+dog.age+":"+dog.breed+":"+dog.color);
        
        dog2 dog2 = new dog2();
        System.out.println(dog2.name+":"+dog2.age+":"+dog2.breed+":"+dog2.color);
        
        dog2 dog3 = new dog2("Rusty", 20, "Bulldog", "black");
        System.out.println(dog3.name+":"+dog3.age+":"+dog3.breed+":"+dog3.color);
        
        

    }
}
