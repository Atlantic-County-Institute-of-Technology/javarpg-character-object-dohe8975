import java.util.Objects;

public class Character {
    public String name;
    public String characterType;
    private int level = 1;
    public int hitPoints;
    public int armorClass;
    public int STR;
    public int DEX;
    public int INT;
    public int CON;
    public int WIS;
    public int CHA;
    Dice dice = new Dice();


    public void character(String name, int level, String characterType) {
        this.name = name;
        this.level = level;
        this.characterType = characterType;
    }

    int getAbilityModifier(int abilityScore) {
        return abilityScore = (abilityScore - 10)/2;
    }

    int getPrimaryAbilityModifier() {
        if (Objects.equals(characterType, "melee")) {
            return STR;
        }
        if (Objects.equals(characterType, "ranged")) {
            return DEX;
        }
        if(Objects.equals(characterType, "magic")) {
            return INT;
        }
        else {
            System.out.println("didn't choose a class, hard mode active...");
        }
        return 0;
    }

    int calculateBaseHitPoints() {
        return hitPoints = 20 + CON;
    }

    int calcutlateArmorClass() {
        return armorClass = 10 + getPrimaryAbilityModifier();
    }

    int rollStat() {
        Dice dice = new Dice();
        dice.addDice(4,6);
        dice.rollAll();
        dice.sortDice();
        dice.removeDie(0);
        return dice.getAllValues();
    }

    int rollStats() {
        dice.clear();
        dice.addDice(4,6);
        dice.rollAll();
        dice.sortDice();
        dice.removeDie(0);
        return dice.getAllValues();
    }

    boolean isAlive() {
        if (hitPoints > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void displayStats() {
        System.out.println("Name: " + name + " (Level " + level + " " + characterType +")");
        System.out.println("HP: " + calculateBaseHitPoints() + " | AC: " + calcutlateArmorClass());
        System.out.println("STR: " + STR + " DEX: " + DEX + " CON: " + CON + "\nINT: " + INT + " WIS: " + WIS + " CHA: " + CHA);
    }
}

