public class Warlock extends Character{
    Warlock(String name, int lvl, int hp, int mp){
        super(name, lvl, hp, mp);
    }
    /**
     * Warlock skills method class
     * Warlock Skill no. 1
     */
    public void bladeWard(Character enemyCharacter, Character name){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Blade Ward (Damage - 40)");
        int damagePoints = 40;
        int manaLost = 50;
        damageTarget(enemyCharacter, damagePoints, manaLost, name);
    }
    /**
     * Warlock Skill no. 2
     */
    public void Absorption(Character enemyCharacter, Character name){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Absorption (Damage - 50)");
        int damagePoints = 50;
        int manaLost = 60;
        damageTarget(enemyCharacter, damagePoints, manaLost, name);
    }
    /**
     * Wizard Skill no.3
     */
    public void heal(){
        super.healthPoints += 30;
        System.out.println(super.characterName + " health restored + 30 hp");
    }
}
