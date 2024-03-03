public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    double dodge;


    Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if(dodge >=0 && dodge <= 100){
            this.dodge = dodge;
        }else{
            this.dodge=0;
        }
    }

    int hit(Fighter rakip) {
        System.out.println(this.name + "=> " + rakip.name + " " + this.damage + "  hasar vurdu");
        if(rakip.isDodge()){
            System.out.println(rakip.name + " gelen hasarı blokladı, hasar alamadı");
            System.out.println("----------");
            return rakip.health;
        }
        if (rakip.health - this.damage < 0) {
            return 0;
        }
        return rakip.health - this.damage; // canı azaldı, kalan health yazıldı

    }

    boolean isDodge(){
        double randomNumber= Math.random()* 100;
        return randomNumber <= this.dodge;
    }
}











