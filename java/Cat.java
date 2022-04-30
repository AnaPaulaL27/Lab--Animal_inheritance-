public class Cat extends Animal{

   // private String name;
    //private int age;
        //deal with it in animal entirely

    //constructing cat object
    public Cat(String name, int age) {
        // this.name = name;
        //this.age = age;
        super(name, age);
    }

//getters

//    public String getName() {
//        return this.name;
//    

//    public int getAge() {
 //       return this.age;

 //   }

    public String meow(){
        return "meow";
    }

}
