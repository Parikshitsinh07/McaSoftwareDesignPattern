public class Hotel_keeper{
  public static void food_service(String dishes)
  {
      Chef c=new Chef();
      c.cook_food(dishes);
  }
  public static void cleaning_service(int room_id)
  {
      Room_cleaner rc=new Room_cleaner();
      rc.clean_room(room_id);
  }
  public static void luggage_service(int room_id)
  {
      Luggage l=new Luggage();
      l.carry_luggage(room_id);
  }
};