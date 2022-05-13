public class Wizard extends Character {
    Wizard(String name, int lvl, int hp, int mp){
        super(name, lvl, hp, mp);
    }
    /**
     * Wizard skills method class
     * Wizard Skill no. 1
     */
    public void dancingLights(Character enemyCharacter, Character name){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Dancing Lights (Damage - 30)");
        int damagePoints = 30;
        int manaLost = 50;
        damageTarget(enemyCharacter, damagePoints, manaLost, name);
    }
    /**
     * Wizard Skill no. 2
     */
    public void thunderClap(Character enemyCharacter, Character name){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Thunder Clap (Damage - 60)");
        int damagePoints = 60;
        int manaLost = 100;
        damageTarget(enemyCharacter, damagePoints, manaLost, name);
    }
    /**
     * Wizard Skill no.3
     */
    public void healingPoison(){
        super.healthPoints += 30;
        System.out.println(super.characterName + "Health Restored + 30 hp");
    }
}
