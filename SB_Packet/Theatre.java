// a
public boolean isAisleSeat(int row, int seatNumber) {
    if (seatNumber == 0 || seatNumber == SEATS_PER_ROW) {
        return true; 
    }
    return false; 
}
// b
public boolean twoTogether() {
    for (int i = 0; i < NUM_ROWS; i++) {
        for (int j = 0; j < SEATS_PER_ROW-1; j++) {
            if (seats[i][j] == 0 && seats[i][j+1] == 0) {
                seats[i][j] == 1;
                seats[i][j+1] == 1;
                return true; 
            }
        }
    }
    return false; 
}
// c
public int findAdjacent(int row, int seatsNeeded) {
    int adj = -1; 
    boolean rows = false; 
    for (int i = 0; i <= SEATS_PER_ROW - seatsNeeded; i++) {
        rows = true; 
        for (int j = 0; j < seatsNeeded; j++) {
            if (seats[row][i+j] == 1) {
                rows = false; 
            }
        }
        if (rows) { adj = i; }
    }
    return adj; 
}
