import java.sql.SQLOutput;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    //müsabakayı başlatmak için run metodu
    public void run() {
        if (isCheck()){
            while(this.f1.health> 0 && this.f2.health>0){  // sağlıkları 0dan büyükse while ile sürekli dövüşme işlemi yapılack
                System.out.println("=== YENİ ROUND ===");
                this.f2.health=this.f1.hit(f2); // f1 önce vurdugunu varsayıyoruz, f2 nin sağlığı f1 in hit metoduna dönen değer olucak.
                if (isWin()){
                    break;
                }
                this.f1.health=this.f2.hit(f1); // f2 f1 e vuruyor
                if (isWin()){
                    break;
                }
                System.out.println(this.f1.name + "Sağlık: " + this.f1.health);
                System.out.println(this.f2.name + "Sağlık: " + this.f2.health);
            }
        }else{
            System.out.println("Sporcuların sikletleri uymuyor");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin (){
        if(this.f1.health==0){
            System.out.println(this. f2.name + "Kazandı ");
            return true;
        }

        if(this.f2.health==0){
            System.out.println(this. f1.name + "Kazandı ");
            return true;
        }
        return false; //dövüşmeye devam etmesinler
    }
}











