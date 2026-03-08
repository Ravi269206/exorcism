class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior 
class Warrior extends Fighter{

    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable(){
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter){
        return fighter.isVulnerable() ? 10 : 6;
    }
    
}

// TODO: define the Wizard class

class Wizard extends Fighter{
    boolean spellPrepared = false;
    
    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }

    void prepareSpell(){
        spellPrepared = true;
    }

    @Override
    boolean isVulnerable(){
        return !spellPrepared;
    }

     @Override
    int getDamagePoints(Fighter fighter){
        return spellPrepared ? 12 : 3;
    }
    
}
