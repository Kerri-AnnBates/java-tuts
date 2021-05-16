public class Example {
    public static void main(String[] args) {
      // Your amazing code goes here...
        System.out.println("We are making a new PEZ dispenser");
        System.out.printf("There are %d pez allowed in every dispenser %n", PezDispenser.MAX_PEZ);
        PezDispenser dispenser = new PezDispenser("Yoda");
        
        System.out.printf("The dispenser is %s \n", dispenser.getCharacterName());

        if(dispenser.isEmpty()) {
            System.out.printf("Dispenser is empty! %n");
        }

        System.out.printf("Filling the dispenser with delicious pez.. %n");
        dispenser.fill();
        
        if (!dispenser.isEmpty()) {
            System.out.printf("Dispenser is full! %n");
        }
    }
}