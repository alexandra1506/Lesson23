package enums;

public enum GameEnums {
    ADD_NEW_OBJECT("Добавлен новый объект", 1001),
    CHANGE_COORDINATE("Движение на поле", 1002),
    GAME_OVER("Игра окончена", 1003),
    EMPTY_ERROR();

    private String desc;
    private int code;

    GameEnums(String desc, int code) {
        this.desc = desc;
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    GameEnums() {
    }

    public int getCode() {
        return code;
    }

    public static GameEnums findByCode(int code){
        for(GameEnums event: GameEnums.values()){
            if(event.getCode()==code) return event;
        }
return null;
    }
}
