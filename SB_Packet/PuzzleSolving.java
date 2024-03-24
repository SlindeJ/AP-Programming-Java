// a
public void updateLocation(int newRow, int newCol) {
    Location loc = new Location(newRow, newCol); 
}
// b
public void sortAllRows() {
    for (Contestant[] arr : contestants) {
        sort(arr); 
    }
}
// c 
public String findWinnerName() {
    String winner = ""; 
    sortAllRows()
    winner = contestants[NUM_ROWS][CONTESTANTS_PER_ROW].getName()
    return winner; 
}