class SuperHero extends Person {
    private String alterEgo;
    private String villains;

    public SuperHero(String name, String alterEgo, String villains) {
        super(name);
        this.alterEgo = alterEgo;
        this.villains = villains;
    }

    public String getName() {
        return alterEgo;
    }

    public String getSecretIdentity() {
        return super.getName();
    }

    public String getVillains(){
        return villains;
    }


    public static void main(String[] args) {
        SuperHero theManOfSteel = new SuperHero("Clark Kent", "Superman", "Lex Luthor");
        SuperHero theDarkKnight = new SuperHero("Bruce Wayne", "Batman", "The Joker");
        SuperHero theAmazingSpiderMan = new SuperHero("Peter Parker", "Spider-Man", "Green Goblin");
        SuperHero theAngryGreen = new SuperHero("David Bruce Banner", "Incredible Hulk", "Doc Samson");
        SuperHero theFastOne = new SuperHero("Barry Allen", "The Flash", "The Shade");

        System.out.println(theManOfSteel.getName()); // "Superman"
        System.out.println(theManOfSteel.getSecretIdentity()); // "Clark Kent"
        System.out.println(theManOfSteel.getVillains());
        System.out.println();
        System.out.println(theDarkKnight.getName());// Batman
        System.out.println(theDarkKnight.getSecretIdentity());// Bruce Wayne
        System.out.println(theDarkKnight.getVillains());
        System.out.println();
        System.out.println(theAmazingSpiderMan.getName());
        System.out.println(theAmazingSpiderMan.getSecretIdentity());
        System.out.println(theAmazingSpiderMan.getVillains());
        System.out.println();
        System.out.println(theAngryGreen.getName());
        System.out.println(theAngryGreen.getSecretIdentity());
        System.out.println(theAngryGreen.getVillains());
        System.out.println();
        System.out.println(theFastOne.getName());
        System.out.println(theFastOne.getSecretIdentity());
        System.out.println(theFastOne.getVillains());




    }

}
