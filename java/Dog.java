public class Dog extends Animal {


   private boolean isWorkingBreed;

    public Dog(String name, int age, boolean isWorkingBreed){

        super(name, age);
        this.isWorkingBreed= isWorkingBreed;
    }

    public boolean getIsWorkingBreed() {
        return this.isWorkingBreed;
    }

    public String bark(){return "woof";
    }

}


