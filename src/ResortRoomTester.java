public class ResortRoomTester {

    public static void main(String[] args) {

        /*
        Declare some rooms to check ResortRoom class is OK.
         */

        ResortRoom room1 = new ResortRoom(ResortRoom.STREET_SIDE, ResortRoom.ROOM_SIZE_TWO, 3);
        ResortRoom room2 = new ResortRoom(ResortRoom.STREET_SIDE, ResortRoom.ROOM_SIZE_TWO, 4);
        ResortRoom room3 = new ResortRoom(ResortRoom.OCEAN_SIDE, ResortRoom.ROOM_SIZE_FOUR, 4);
        ResortRoom room4 = new ResortRoom(ResortRoom.OCEAN_SIDE, ResortRoom.ROOM_SIZE_FOUR, 8);
        ResortRoom room5 = new ResortRoom(ResortRoom.OCEAN_SIDE, ResortRoom.ROOM_SIZE_TWO, 2);
        ResortRoom room6 = new ResortRoom(ResortRoom.STREET_SIDE, ResortRoom.ROOM_SIZE_FOUR, 6);

        /*
        Print data the about the room
         */
        printRoomData(room1);
        printRoomData(room2);
        printRoomData(room3);
        printRoomData(room4);
        printRoomData(room5);
        printRoomData(room6);


    }

    /**
     * This method gets a ResortRoom object and print it on the console.
     * @param room
     */
    public static  void printRoomData(ResortRoom room) {
        System.out.println("Room Type: " + room.getRoomType() + ", Size: " + room.getRoomSize() + ", Occupants: " + room.getRoomOccupants() + ", Cost:" + room.getRoomCost());

    }
}
