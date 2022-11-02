public class PoisonMatango Matango {
    int poisonCount=5;
    public PoisonMatango(char suffix){
        super(suffix);
    }
    public void attack(Hero h){
        super.attack(h);
        if(this.poisonCount){
            System.out.println("追加攻撃");
            int dmg =h.hp/5;
            h.hp-=dmg;
            System.out.println(dmg+"ポイントのダメージ");
            this.poisonCount;
        }
    }
}
