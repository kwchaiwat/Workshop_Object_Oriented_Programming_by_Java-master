public class Thor extends Superhero implements SkillHero,Nation {
    @Override
    public void skill(String skill) {
        System.out.println("Skill = "+skill);
    }

    public void moving(String moving){

    }

    public void weapon(String weapon){
        System.out.println("Weapon = "+weapon);
    }

    public void jumping(String jumping){

    }

    public void setNation(String nation){
        System.out.println("Nation = "+nation);
    }
}
