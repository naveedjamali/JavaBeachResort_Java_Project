public class ResortRoom {
    // static members of the class
    public static final int OCEAN_SIDE = 0;
    public static final int STREET_SIDE = 1;

    public static final double OCEAN_TWO_PRICE = 250.50;
    public static final double OCEAN_FOUR_PRICE = 370.90;
    public static final double STREET_TWO_PRICE = 175.50;
    public static final double STREET_FOUR_PRICE = 260.90;
    public static final double COST_PER_EXTRA_PERSON = 80.00;

    public static final int ROOM_SIZE_TWO = 2;
    public static final int ROOM_SIZE_TWO_MIN = 1;
    public static final int ROOM_SIZE_TWO_MAX = 4;


    public static final int ROOM_SIZE_FOUR = 4;
    public static final int ROOM_SIZE_FOUR_MIN = 2;
    public static final int ROOM_SIZE_FOUR_MAX = 8;


    /*
     *default room type is OCEAN_SIDE
     */
    private int roomType = OCEAN_SIDE;

    /*
    The default room size is four.
     */
    private int roomSize = 4;


    private int numberOfOccupants;

    /**
     * @param theType           - Room type of the room. Use the types ResortRoom.OCEAN_SIDE or ResortRoom.STREET_SIDE.
     * @param theSize           - Room size of the room. Use the types ResortRoom.ROOM_SIZE_TWO or ROOM_SIZE_FOUR.
     * @param numberOfOccupants
     */
    public ResortRoom(int theType, int theSize, int numberOfOccupants) {

        setRoomType(theType);
        setRoomSize(theSize);
        setRoomOccupants(numberOfOccupants);
    }

    /**
     * Set the room type of the Room Ocean side or Street Side
     *
     * @param roomType - ResortRoom.OCEAN_SIDE / ResortRoom.STREET_SIDE
     */
    public void setRoomType(int roomType) {

        /*
         * Assigning the room type. if the room type passed in the constructor is invalid, we will ignore assignment.
         * The default type OCEAN_SIDE is already assigned.
         */

        if (roomType >= 0 && roomType <= 1) {

            this.roomType = roomType;
        }
    }

    /**
     * returns the size of the room, 2 or 4
     *
     * @return roomSize - the size of the room which is 2 or 4.
     */
    public int getRoomSize() {
        return roomSize;
    }

    /**
     * Set the room size. default is 4. Values other than 2 or will be ignored, and default 4 will be assigned.
     *
     * @param theSize
     */
    public void setRoomSize(int theSize) {
        /*
        since default room size 4 is already assigned. we will assign 2 only.
         if theSize to be assigned is not 2, we will ignore it because 4 is already assigned,
          and we don't have other choices other than 2.
         */
        if (theSize == 2) {
            this.roomSize = ROOM_SIZE_TWO;
        } else {
            this.roomSize = ROOM_SIZE_FOUR;
        }
    }

    /**
     * Returns the number of occupants living in the room.
     *
     * @return
     */
    public int getRoomOccupants() {
        return numberOfOccupants;
    }

    /**
     * Set the number of occupants for the room.
     *
     * @param numberOfOccupants
     */
    public void setRoomOccupants(int numberOfOccupants) {
        this.numberOfOccupants = numberOfOccupants;
    }

    /**
     * Return the room type, ocean or street
     *
     * @return
     */
    public String getRoomType() {
        return roomType == OCEAN_SIDE ? "ocean" : "street";
    }

    /**
     * Calculate and returns the cost of room dependant on room type, room size, occupants in the room.
     *
     * @return
     */
    public double getRoomCost() {
        // cost variable, used to store the calculated cost, returned in the end.
        double cost = 0;
        switch (roomType) {
            /*
            Check the room type. Ocean side or Street size?
             */
            case OCEAN_SIDE: {
                /*
                Check the number of occupants in the room.
                 */
                if (numberOfOccupants <= roomSize) {
                    /*
                    Calculate cost depending on room size, type, and number of occupants.
                     */
                    if (roomSize == ROOM_SIZE_TWO) {
                        cost = OCEAN_TWO_PRICE;
                    } else if (roomSize == ROOM_SIZE_FOUR) {
                        cost = OCEAN_FOUR_PRICE;
                    }
                } else {
                    if (roomSize == ROOM_SIZE_TWO) {
                        cost = OCEAN_TWO_PRICE + ((numberOfOccupants - roomSize) * COST_PER_EXTRA_PERSON);
                    } else if (roomSize == ROOM_SIZE_FOUR) {
                        cost = OCEAN_FOUR_PRICE + ((numberOfOccupants - roomSize) * COST_PER_EXTRA_PERSON);
                    }
                }
                break;
            }
            case STREET_SIDE: {
                if (numberOfOccupants <= roomSize) {
                    if (roomSize == ROOM_SIZE_TWO) {
                        cost = STREET_TWO_PRICE;
                    } else if (roomSize == ROOM_SIZE_FOUR) {
                        cost = STREET_FOUR_PRICE;
                    }
                } else {
                    if (roomSize == ROOM_SIZE_TWO) {
                        cost = STREET_TWO_PRICE + ((numberOfOccupants - roomSize) * COST_PER_EXTRA_PERSON);
                    } else if (roomSize == ROOM_SIZE_FOUR) {
                        cost = STREET_FOUR_PRICE + ((numberOfOccupants - roomSize) * COST_PER_EXTRA_PERSON);
                    }
                }
                break;
            }
        }
        /*
        return the calculated cost of the room.
         */
        return cost;
    }
}
