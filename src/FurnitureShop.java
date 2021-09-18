public class FurnitureShop {
    int sofN=3;
    int tabN=3;
    Sofas[] sofasKat = new Sofas[sofN];
    Tables[] tablesKat = new Tables[tabN];
    public FurnitureShop() {
        sofasKat[0]=new Sofas(3,"Синий диван","Металл",20999);
        sofasKat[1]=new Sofas(5,"Изысканый диван","Красное дерево",100000);
        sofasKat[2]=new Sofas(1,"Дешевый диван","Фанера",9999);
        tablesKat[0]=new Tables('N',"Круглый стол","Металл",7999);
        tablesKat[1]=new Tables('N',"Изысканный стол","Красное дерево",73000);
        tablesKat[2]=new Tables('Y',"Iстол","Алюмиинй",80999);
    }
    public void katalog(){
        System.out.println("Каталог ::\n\nДиваны:");
        for (int i = 0; i < sofN; i++) {
            System.out.print("\n"+(i+1)+") Название: "+sofasKat[i].getName()+"   Материал: "+sofasKat[i].getType()+"   Уровень мягкости 1/5: "+sofasKat[i].getSoftness1to5()+"   Цена: "+sofasKat[i].getCost());
        }
        System.out.print("\n\nСтолы:\n");
        for (int i = 0; i < tabN; i++) {
            System.out.print("\n"+(i+1)+") Название: "+tablesKat[i].getName()+"   Материал: "+tablesKat[i].getType()+"   Возможность расширения: "+tablesKat[i].getMoreSpace()+"   Цена: "+tablesKat[i].getCost());
        }
    }
    public void byuSofa(int n){
        n--;
        for (; n < sofasKat.length-1; n++) {
            sofasKat[n]=sofasKat[n+1];
        }
        sofasKat[2]=null;
        this.sofN--;
    }
    public void buyTable(){

    }
}
//Создать абстрактный класс, описывающий мебель. С помощью наследования реализовать различные виды мебели.
//Реализовать класс магазина мебели (FurnitureShop),
//реализовать каталог мебели, с возможность покупки. Создать консольный интерфейс. Продемонстрировать работу класса.