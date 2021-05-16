class PezDispenser {
    // final keyword to prevent changes to this variable.
    public static final int  MAX_PEZ = 12;
    final private String characterName;
    private int pezCount;
    
    public PezDispenser(String characterName) {
        this.characterName = characterName;
        pezCount = 0;
    }
    
    public boolean dispense() {
        boolean wasDispensed = false;
        
        if(!isEmpty()) {
            pezCount--;
            wasDispensed = true;
        }
        
        return wasDispensed;
    }

    public boolean isEmpty() {
        return pezCount == 0;
    }
    
    // void keyword means not returning anything.
    public void fill() {
        fill(MAX_PEZ);
    }

    public void fill(int pezAmount) {
        pezCount += pezAmount;
    } 
    
    // returns a string.
    public String getCharacterName() {
        return characterName;
    }
}