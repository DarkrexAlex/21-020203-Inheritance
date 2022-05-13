public class Character {
    public String characterName;
    public int level;
    public int healthPoints;
    public int manaPoints;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */
    Character(){
        System.out.println("null");
    }

    Character(String name, int lvl, int hp, int mp){
        characterName = name;
        level = lvl;
        healthPoints = hp;
        manaPoints = mp;

    }
    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */
    public void displayName(){
        System.out.println("Character Initialized: " + characterName);
    }
    /**
     * Create a method to Damage Target and mana lost of Character 
     */
    public void damageTarget(Character enemyCharacter,int damagePoints, int manaLost, Character name){
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("enemy character HP Left = " + enemyCharacter.healthPoints);
        /**
         * Deduct mana points
         */
        name.manaPoints = name.manaPoints - manaLost;
        System.out.println("Your remaining mana points is " + manaPoints);
        /**
         * Prompt Character is defeated if HP falls below 0
         * eg. Character Shaman defeated.
         * 
         * Level up Character
         */
        if(enemyCharacter.healthPoints <= 0){
            System.out.println("");
            System.out.println("Character " + enemyCharacter.characterName + " is now defeated");
            name.level += 10;
            System.out.println("Congratulation " + name.characterName + " you'll level up!!");
        }
    }
    /**
     * Level up method
     */
    public void levelUp(Character name){
        name.level += 10;
        System.out.println(name.characterName + "Level Up!!");
    }
    /**
     * Displaying the current character details
     */
    public void displayDetails(){
        System.out.println("Player: " + characterName);
        System.out.println("Health Points: " + healthPoints);
        System.out.println("Mana Points: " + manaPoints);
        System.out.println("Level: " + level);
    }
}
