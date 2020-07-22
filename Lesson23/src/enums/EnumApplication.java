package enums;

public class EnumApplication {
    public static void main(String[] args) {
        GameEnums event = GameEnums.ADD_NEW_OBJECT;
        GameEnums event2 = GameEnums.GAME_OVER;
        GameEnums even3 = GameEnums.EMPTY_ERROR;

        System.out.println(even3.name()+" "+even3.ordinal()+" "+even3.getDesc());

        for(GameEnums ev: GameEnums.values()){
            System.out.println(ev.name()+" "+ev.ordinal()+" "+ev.getDesc());
        }

        System.out.println(event2.getDesc());

        System.out.println("**************");
        System.out.println("Find ");
        System.out.println(GameEnums.findByCode(1002));

        int a = -11;
        int b = 2;

        double d = a % b;
        System.out.println((int)d);


    }
}
